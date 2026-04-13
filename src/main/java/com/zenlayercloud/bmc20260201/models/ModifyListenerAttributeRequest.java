package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class ModifyListenerAttributeRequest extends TeaModel {


    /**
     * 监听器的ID。
     */
    public String listenerId;

    /**
     * 监听器名称。
     * 不得超过64个字符。仅支持输入字母、数字、-和英文句点(.)。
     */
    public String listenerName;

    /**
     * 监听协议。取值：
     * <ul><li>TCP</li><li>UDP</li></ul>
     */
    public String protocol;

    /**
     * 后端转发协议。取值：
     * <ul><li>TCP</li><li>UDP</li></ul>
     */
    public String backendProtocol;

    /**
     * 调度算法。取值：
     * <ul><li>wrr（默认值）：加权轮询，权重值越高的后端服务器，被轮询到的概率也越高。</li><li>rr：轮询，按照访问顺序依次将外部请求分发到后端服务器。</li></ul>
     */
    public String scheduler;

    /**
     * 工作模式。取值：
     * <ul><li>NAT</li><li>DR</li></ul>
     */
    public String kind;

    /**
     * 健康检查。
     */
    public HealthCheck healthCheck;

    /**
     * 警报。
     */
    public Notify notify;

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

}