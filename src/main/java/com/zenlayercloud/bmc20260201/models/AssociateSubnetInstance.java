package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * Subnet绑定实例。
 */
public class AssociateSubnetInstance extends TeaModel {


    /**
     * 实例ID。
     */
    public String instanceId;

    /**
     * 内网IPv4地址。该地址必须在子网的CIDR范围内。 如果不指定内网地址，系统会会寻找CIDR中未用的内网地址下发到实例。
     */
    public String privateIpAddress;

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

}