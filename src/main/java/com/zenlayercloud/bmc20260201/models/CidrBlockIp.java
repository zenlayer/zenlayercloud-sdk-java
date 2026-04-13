package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * CIDR 地址块里的IP的信息。
 */
public class CidrBlockIp extends TeaModel {


    /**
     * Cidr Block唯一ID。
     */
    public String cidrBlockId;

    /**
     * CIDR的类型。
     */
    public String cidrBlockType;

    /**
     * IP。
     */
    public String ip;

    /**
     * 绑定的实例ID。
     */
    public String instanceId;

    /**
     * IP的状态。
     */
    public String status;

    public String getCidrBlockId() {
        return this.cidrBlockId;
    }

    public void setCidrBlockId(String cidrBlockId) {
        this.cidrBlockId = cidrBlockId;
    }

    public String getCidrBlockType() {
        return this.cidrBlockType;
    }

    public void setCidrBlockType(String cidrBlockType) {
        this.cidrBlockType = cidrBlockType;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}