package com.zenlayercloud.aigw20260414.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class ModifyAiGatewayIpAclRequest extends TeaModel {


    /**
     * 网关UUID。
     */
    public String gatewayUuid;

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

    public String getGatewayUuid() {
        return this.gatewayUuid;
    }

    public void setGatewayUuid(String gatewayUuid) {
        this.gatewayUuid = gatewayUuid;
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