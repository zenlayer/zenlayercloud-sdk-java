package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class DescribeInstanceAvailableCidrBlockRequest extends TeaModel {


    /**
     * 实例ID。
     * 可通过DescribeInstances接口返回值中的instanceId获取。
     */
    public String instanceId;

    /**
     * CIDR地址块的类型。
     */
    public String cidrBlockType;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getCidrBlockType() {
        return this.cidrBlockType;
    }

    public void setCidrBlockType(String cidrBlockType) {
        this.cidrBlockType = cidrBlockType;
    }

}