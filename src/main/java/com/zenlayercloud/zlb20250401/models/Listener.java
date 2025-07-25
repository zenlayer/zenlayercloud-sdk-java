package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述监听器的基本信息。
 */
public class Listener extends TeaModel {


    /**
     * 负载均衡监听器 ID
     */
    public String listenerId;

    /**
     * 监听器的名称
     */
    public String listenerName;

    /**
     * 监听器协议
     */
    public String protocol;

    /**
     * 监听器端口。
     * 多个端口使用,分隔。
     * 当端口是范围时用`-`连接，例如：10000-10005。
     * 如果传多个单独的端口连续，将会被自动聚合为范围端口
     */
    public String port;

    /**
     * 监听器的健康检查信息
     */
    public HealthCheck healthCheck;

    /**
     * 监听器转发的方式
     */
    public String scheduler;

    /**
     * 工作模式
     */
    public String kind;

    /**
     * 创建时间。
     * 按照ISO8601标准表示，并且使用UTC时间。
     * 格式为：YYYY-MM-DDThh:mm:ssZ
     */
    public String createTime;

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

    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getPort() {
        return this.port;
    }

    public void setPort(String port) {
        this.port = port;
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

    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}