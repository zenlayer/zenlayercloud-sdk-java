快速使用[(English)](./README.md)

--- 

# Zenlayer Cloud SDK Java

[![Maven Central](https://img.shields.io/maven-central/v/com.zenlayer/zenlayercloud-sdk-java.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:com.zenlayer%20AND%20a:zenlayercloud-sdk-java)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

# 简介

欢迎使用Zenlayer Cloud 开发者工具SDK，SDK是云 Zenlayer API
平台v2版本的配套工具。目前已经支持bmc等产品，后续所有的云服务产品都会接入进来。
为方便 JAVA 开发者调试和接入 Zenlayer Cloud 产品 API，提供了一些使用SDK的简单示例。让您快速上手调试 Java SDK。

# 依赖环境

1. 依赖环境：JDK 7 版本及以上。
2. 使用 Zenlayer Cloud SDK java, 您需要在云平台拥有一个云账号，并在 Zenlayer 云平台控制台中的创建和查看您的 Access Key ID 和 Access Key
   Password。如何获取详见 [帮助文档](https://docs.console.zenlayer.com/welcome/platform/team-management/generate-an-api-access-key)

# 通过 Maven 安装(推荐)

如果您使用Maven来管理Java项目，只需在项目的pom.xml文件加入相应的依赖项即可。您只需在pom.xml中声明以下依赖：

```xml

<dependency>
   <groupId>com.zenlayer</groupId>
   <artifactId>zenlayercloud-sdk-java</artifactId>
   <!-- 请到https://search.maven.org/search?q=zenlayercloud-sdk-java查询所有版本，最新版本如下 -->
   <version>0.6.0</version>
</dependency>

```

# 快速使用

以BMC服务产品下创建实例接口CreateInstances为例：

```java
import com.zenlayercloud.bmc20221120.BmcClient;
import com.zenlayercloud.bmc20221120.models.CreateInstancesRequest;
import com.zenlayercloud.bmc20221120.models.CreateInstancesResponse;
import com.zenlayercloud.common.Credential;
import com.zenlayercloud.common.ZenlayerSdkException;

public class Example {

    public static void main(String[] args) {
        // 1. 初始化client
        Credential credential = new Credential("your accessKeyId", "your accessKey password");
        BmcClient client = new BmcClient(credential);
        // 2. 设置API请求参数
        CreateInstancesRequest createInstancesRequest = new CreateInstancesRequest();
        createInstancesRequest.instanceChargeType = "PREPAID";
        createInstancesRequest.internetChargeType = "ByBandwidth";
        createInstancesRequest.zoneId = "SEL-A";
        createInstancesRequest.instanceTypeId = "M8C";

        try {
            // 3. 发起API请求并获得响应结果
            CreateInstancesResponse instances = client.createInstances(createInstancesRequest);

        } catch (ZenlayerSdkException e) {
            // 4. 处理应答异常 
        }
    }
}

```

# 限流重试

当服务端返回 `REQUEST_LIMIT_EXCEEDED` 错误码（HTTP 429）时，SDK 会自动按指数退避（1s、2s、4s ……）进行重试。该行为**默认开启**，
默认最大重试次数为 **3 次**，多数调用方无需额外配置。每次重试都会通过 SLF4J 输出 `WARN` 级别日志，
logger 名为 `com.zenlayercloud.common.AbstractClient`。

如需自定义重试次数或退避策略，可通过 `Config` 调整；将重试次数设置为 `0` 即可关闭限流重试：

```java
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.RetryDurationFunction;

Config config = new Config();

// 自定义：最多重试 5 次，每次等待固定 2 秒
config.setRateLimitMaxRetries(5);
config.setRateLimitRetryDuration(new RetryDurationFunction() {
    @Override
    public int getDurationSeconds(int retryIndex) {
        return 2;
    }
});

// 或者关闭限流重试
config.setRateLimitMaxRetries(0);
```

---
快速使用[(English)](./README.md)
