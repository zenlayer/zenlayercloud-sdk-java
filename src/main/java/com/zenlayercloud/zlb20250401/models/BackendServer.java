package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


/**
 * 后端服务器信息
 */
public class BackendServer extends TeaModel {


    /**
     * 实例ID。
     * 如果是zec实例作为后端服务器，可通过 DescribeInstances 接口返回字段中的 InstanceId 字段获取。
     * 解绑时，对于存在实例ID的，该字段必传
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
    public Integer port;

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

    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

}