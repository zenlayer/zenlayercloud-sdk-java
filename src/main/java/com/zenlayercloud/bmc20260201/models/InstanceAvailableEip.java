package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * EIP信息。
 */
public class InstanceAvailableEip extends TeaModel {


    /**
     * 一个EIP ID。
     * 可通过DescribeEipAddresses接口返回值中的eipId获取。
     */
    public String eipId;

    /**
     * IP地址。
     */
    public String ipAddress;

    /**
     * IP掩码。
     */
    public Integer netmask;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Integer getNetmask() {
        return this.netmask;
    }

    public void setNetmask(Integer netmask) {
        this.netmask = netmask;
    }

}