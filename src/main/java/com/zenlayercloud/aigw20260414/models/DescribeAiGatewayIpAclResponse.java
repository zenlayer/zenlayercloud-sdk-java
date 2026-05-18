package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeAiGatewayIpAclResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * IP访问控制类型（白名单/黑名单）。
     */
    public String ipAclType;

    /**
     * IP地址列表。
     */
    public List<String> ipAddresses;

    /**
     * 是否启用。
     */
    public Boolean enabled;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getIpAclType() {
        return this.ipAclType;
    }

    public void setIpAclType(String ipAclType) {
        this.ipAclType = ipAclType;
    }

    public List<String> getIpAddresses() {
        return this.ipAddresses;
    }

    public void setIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

}