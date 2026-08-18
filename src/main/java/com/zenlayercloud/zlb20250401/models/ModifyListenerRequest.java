package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


public class ModifyListenerRequest extends TeaModel {


    /**
     * 负载均衡器ID。
     */
    public String loadBalancerId;

    /**
     * 负载均衡器的监听器ID。
     */
    public String listenerId;

    /**
     * 负载均衡器的监听器名称。
     * 不传则不会进行修改。
     */
    public String listenerName;

    /**
     * 负载均衡器的监听器健康检查。
     * 不传则不会进行修改，如果开启或关闭，请设置`HealthCheck.enabled`字段。
     */
    public HealthCheck healthCheck;

    /**
     * 负载均衡器的监听器调度方式。
     * 不传则不会进行修改。
     */
    public String scheduler;

    /**
     * 监听器端口。
     * 多个端口使用,分隔。
     * 当端口是范围时用`-`连接，例如：10000-10005。
     * 端口的取值范围为0～65535，0代表全范围端口。
     * 不指定将不会进行修改。
     * 范围端口与全端口在配额计算中均按1个端口计。
     * 连续的单端口会被自动合并为区间端口后再保存和返回，例如`1,2,3,4,5`会被保存为`1-5`。
     */
    public String port;

    /**
     * 工作模式。
     * 如果修改为`DR`模式，如果后端服务器指定了端口将失效，将跟随监听器的端口。
     * 修改后必须与该负载均衡器下其他监听器的工作模式保持一致。
     * DR模式下监听器不支持设置为全端口（0）。
     */
    public String kind;

    /**
     * 会话保持时间，单位秒。
     * 与`algoOpts`（调度算法高级选项）互斥：若该监听器已开启`algoOpts`，不可修改为非0值，需一并传`algoOpts=None`将其清空。
     */
    public Integer persistent;

    /**
     * 空闲超时时间，单位秒。
     */
    public Integer idleTimeout;

    /**
     * 调度算法高级选项。
     * 仅当工作模式（`kind`）为`DR`且调度算法（`scheduler`）为`mh`时可设置。
     * 不传表示不修改该字段；传`None`表示显式清空已开启的选项。
     * 校验按修改后生效的最终状态判定：若该监听器已开启此选项，把`kind`或`scheduler`改为其它组合时也需一并传`None`。
     * 开启后与会话保持（`persistent`）互斥：若该监听器已开启此选项，把`persistent`改为非0值同样会报错，需一并传`None`将其清空。
     */
    public String algoOpts;

    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    public String getListenerId() {
        return this.listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public String getListenerName() {
        return this.listenerName;
    }

    public void setListenerName(String listenerName) {
        this.listenerName = listenerName;
    }

    public HealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    public void setHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }

    public String getScheduler() {
        return this.scheduler;
    }

    public void setScheduler(String scheduler) {
        this.scheduler = scheduler;
    }

    public String getPort() {
        return this.port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Integer getPersistent() {
        return this.persistent;
    }

    public void setPersistent(Integer persistent) {
        this.persistent = persistent;
    }

    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public void setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

    public String getAlgoOpts() {
        return this.algoOpts;
    }

    public void setAlgoOpts(String algoOpts) {
        this.algoOpts = algoOpts;
    }

}