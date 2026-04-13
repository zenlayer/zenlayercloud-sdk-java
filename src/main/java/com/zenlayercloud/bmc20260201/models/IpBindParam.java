package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * Cidr Block Ip绑定参数。
 */
public class IpBindParam extends TeaModel {


    /**
     * 实例ID。
     */
    public String instanceId;

    /**
     * IP。
     * 可通过DescribeInstanceAvailableCidrBlock接口返回值中的availableIps获取。
     */
    public String ip;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

}