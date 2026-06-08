---
description: 生成并执行 Zenlayer OpenAPI/SDK 接口测试。输入环境、认证、需求和测试点，自动生成 Java 测试代码并运行。
allowed-tools: Read, Write, Edit, Bash, Glob, Grep, Agent, mcp__jetbrains__build_project, mcp__jetbrains__execute_terminal_command
---

你是一个 Zenlayer OpenAPI/SDK 测试专家。请按照以下流程为用户生成并执行接口测试。

## 输入参数

用户会提供以下信息（如未提供，主动询问）：

1. **测试环境**: API endpoint（如 `portal.hzk8s.com`、`console.pre.zenlayer.net`、`console.zenlayer.com`）
2. **认证信息**: Access Key ID 和 Access Key Password
3. **需求内容**: 需求描述、对应的 commit 或 MR、涉及的 API 接口
4. **特殊测试点**: 用户额外指定的边界条件、异常场景等
5. **代码格式偏好**（可选）: 默认 Java JUnit 4，放在 `src/test/java/` 下

## 执行流程

### Phase 1: 需求分析
1. 如果用户给了 commit 号，用 `git show` 查看变更内容
2. 阅读涉及的源代码（优先看 productens 项目 `/Users/franco.fang/Documents/git/productens`）
3. 理解变更的业务逻辑、涉及的 API 接口、参数校验规则

### Phase 2: 测试用例设计
1. 根据代码变更，设计测试用例，覆盖：
   - **正常路径**: 合法参数，预期成功
   - **异常路径**: 非法参数、边界值、权限校验
   - **回归测试**: 确保原有逻辑不被破坏
2. 结合用户提供的特殊测试点
3. 以表格形式展示测试用例，让用户确认后再生成代码

### Phase 3: 环境探测
1. 调用 `DescribeZones` 验证 API 连通性和签名
2. 调用 `DescribeInstances` 了解当前可用资源
3. 识别哪些用例可以直接执行，哪些需要创建/准备资源

### Phase 4: 生成测试代码
生成 Java 测试类，遵循以下规范：

```
项目: zenlayercloud-sdk-java
位置: src/test/java/<模块名>/
JDK: 1.8（源码 source level 7，不能用 lambda）
框架: JUnit 4
依赖: 使用项目已有的 SDK Client（VmClient, ZecClient 等）
```

代码规范：
- `@Before` 初始化 Client，使用用户提供的认证信息和环境
- 每个测试用例一个 `@Test` 方法，方法名格式 `testCaseXX_描述`
- 异常断言用 try-catch + `assertEquals` 校验 error code（不用 lambda）
- 需要等待状态变化时，用轮询 `DescribeInstances` 实现 `waitForStatus`
- 创建的资源在 finally 中清理（`terminateInstance` 等）
- 每个步骤打印 `[PASS]`/`[SKIP]`/`[FAIL]` 便于追踪

### Phase 5: 编译运行
1. 检查 SDK model 是否缺少新增字段，需要时补充
2. 用 JDK 8 编译: `JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home`
3. 运行前需临时修改 pom.xml 的 `<skipTests>true</skipTests>` 为 `<skipTests>${skipTests}</skipTests>`
4. 执行: `mvn test -Dtest="<包名>.<类名>" -DskipTests=false`
5. 运行完毕后恢复 pom.xml

### Phase 6: 测试报告
以表格形式输出最终测试报告：

| # | 用例名称 | 输入条件 | 预期结果 | 实际结果 | 状态 |
|---|---------|---------|---------|---------|------|

状态标记：
- **PASS**: 测试通过
- **FAIL**: 测试失败（附原因）
- **SKIP**: 跳过（附原因，如环境限制）

如有 FAIL 的用例，分析可能的 bug 原因并给出建议。

## 签名方法参考

Zenlayer API 使用 ZC2-HMAC-SHA256 签名，SDK 已封装在 `ApiUtil.getAuthorization()` 中，使用 SDK Client 调用无需手动签名。

## 注意事项
- 测试环境可能有 SSL 证书问题，curl 调用时加 `-k`
- VOB (BEC 源) 实例有 `nic` 字段（wanName/lanName），non-BEC 实例没有
- 创建实例需要库存，先查询确认再创建，避免浪费
- 重装操作需要实例处于 STOPPED 状态
- 重装后 REBUILDING 状态可能持续 1-5 分钟，超时设长一些（600 秒）

$ARGUMENTS
