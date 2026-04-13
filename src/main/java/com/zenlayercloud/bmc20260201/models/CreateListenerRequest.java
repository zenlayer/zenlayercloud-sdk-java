package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class CreateListenerRequest extends TeaModel {


    /**
     * 负载均衡实例 ID。
     */
    public String loadBalancerId;

    /**
     * 监听器名称。
     * 不得超过64个字符。仅支持输入字母、数字、-和英文句点(.)。
     */
    public String listenerName;

    /**
     * 监听端口。取值范围：0~65535。
     * 示例值：["6569"]
     */
    public List<Integer> portList;

    /**
     * 用于保证请求的幂等性。
     */
    public String clientToken;

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
     * <ul><li>FNAT(全局网络地址转换)</li><li>DR(直接路由)</li></ul>
     */
    public String kind;

    /**
     * 健康检查的信息。
     */
    public HealthCheck healthCheck;

    /**
     * 警报。
     */
    public Notify notify;

    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    public String getListenerName() {
        return this.listenerName;
    }

    public void setListenerName(String listenerName) {
        this.listenerName = listenerName;
    }

    public List<Integer> getPortList() {
        return this.portList;
    }

    public void setPortList(List<Integer> portList) {
        this.portList = portList;
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
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