package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


/**
 * Auto-generated by SDK Generator
 */
public class BackendServer extends TeaModel {


    public String instanceId;

    public String privateIpAddress;

    public Integer weight;

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