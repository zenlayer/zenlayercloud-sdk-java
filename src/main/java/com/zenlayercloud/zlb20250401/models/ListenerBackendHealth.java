package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述监听器后端服务器的健康检查。
 */
public class ListenerBackendHealth extends TeaModel {


    /**
     * 后端服务健康检查状态
     */
    public String healthStatus;

    /**
     * 后端服务健康检查对应端口的健康检查状态。
     * 当`healthStatus`为`Close` 或 `Unknown`时，无详情信息
     */
    public List<BackendHealthStatusDetail> healthStatusDetail;

    /**
     * 实例ID。
     * 可通过 DescribeInstances 接口返回字段中的 InstanceId 字段获取
     */
    public String instanceId;

    /**
     * 实例上绑定网卡的私网IP地址
     */
    public String privateIpAddress;

    /**
     * 后端服务修改后的转发权重。
     * 创建绑定服务器时默认值为100, 修改时如果不指定，则不会进行修改。
     * 删除时不需要指定该参数
     */
    public Integer weight;

    /**
     * 请求转发和健康检查的目标端口。
     * 如果为空，将跟随监听器端口配置。
     * 删除时不需要指定该参数
     */
    public Integer backendPort;

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
     * 当端口是范围时用`-`连接，例如：10000-10005
     */
    public String listenerPort;

    public String getHealthStatus() {
        return this.healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public List<BackendHealthStatusDetail> getHealthStatusDetail() {
        return this.healthStatusDetail;
    }

    public void setHealthStatusDetail(List<BackendHealthStatusDetail> healthStatusDetail) {
        this.healthStatusDetail = healthStatusDetail;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getBackendPort() {
        return this.backendPort;
    }

    public void setBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
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

    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getListenerPort() {
        return this.listenerPort;
    }

    public void setListenerPort(String listenerPort) {
        this.listenerPort = listenerPort;
    }

}