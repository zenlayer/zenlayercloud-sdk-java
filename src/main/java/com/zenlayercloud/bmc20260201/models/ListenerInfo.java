package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * ListenerInfo 信息
 */
public class ListenerInfo extends TeaModel {


    /**
     * LoadBalancerId唯一ID。
     */
    public String loadBalancerId;

    /**
     * Listener的ID。
     */
    public String listenerId;

    /**
     * Listener的名称。
     */
    public String listenerName;

    /**
     * 状态。
     */
    public String status;

    /**
     * 监听端口。
     */
    public String port;

    /**
     * 监听协议。
     */
    public String protocol;

    /**
     * 后段服务器协议。
     */
    public String backendProtocol;

    /**
     * 调度算法。
     */
    public String scheduler;

    /**
     * 流量转发模式。
     */
    public String kind;

    /**
     * 健康检查。
     */
    public HealthCheck healthCheck;

    /**
     * 通知地址。
     */
    public Notify notify;

    /**
     * 创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-ddTHH:mm:ssZ`。
     */
    public String createTime;

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

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPort() {
        return this.port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getBackendProtocol() {
        return this.backendProtocol;
    }

    public void setBackendProtocol(String backendProtocol) {
        this.backendProtocol = backendProtocol;
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

    public HealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    public void setHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }

    public Notify getNotify() {
        return this.notify;
    }

    public void setNotify(Notify notify) {
        this.notify = notify;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}