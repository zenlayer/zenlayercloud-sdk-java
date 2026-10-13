package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeInstanceAvailableEipResourcesRequest extends TeaModel {


    /**
     * 机器实例ID 。
     * 可通过DescribeInstances接口返回的instanceId获取。
     */
    public String instanceId;

    /**
     * EIP 类型，取值：IPv4、IPv6。不填默认查询 IPv4。
     */
    public String ipType;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getIpType() {
        return this.ipType;
    }

    public void setIpType(String ipType) {
        this.ipType = ipType;
    }

}