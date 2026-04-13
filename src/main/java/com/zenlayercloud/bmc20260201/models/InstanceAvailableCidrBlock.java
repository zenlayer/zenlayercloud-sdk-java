package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 实例可用的CIDR地址块。
 */
public class InstanceAvailableCidrBlock extends TeaModel {


    /**
     * Cidr Block唯一ID。
     */
    public String cidrBlockId;

    /**
     * Cidr Block所属的可用区ID。
     */
    public String zoneId;

    /**
     * CIDR的类型。
     */
    public String cidrBlockType;

    /**
     * CIDR地址块的类型。
     */
    public String cidrType;

    /**
     * CIDR。
     */
    public String cidrBlock;

    /**
     * 可用的IP列表。
     */
    public List<String> availableIps;

    /**
     * 可用的IP数量。
     */
    public Integer availableIpCount;

    public String getCidrBlockId() {
        return this.cidrBlockId;
    }

    public void setCidrBlockId(String cidrBlockId) {
        this.cidrBlockId = cidrBlockId;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getCidrBlockType() {
        return this.cidrBlockType;
    }

    public void setCidrBlockType(String cidrBlockType) {
        this.cidrBlockType = cidrBlockType;
    }

    public String getCidrType() {
        return this.cidrType;
    }

    public void setCidrType(String cidrType) {
        this.cidrType = cidrType;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public List<String> getAvailableIps() {
        return this.availableIps;
    }

    public void setAvailableIps(List<String> availableIps) {
        this.availableIps = availableIps;
    }

    public Integer getAvailableIpCount() {
        return this.availableIpCount;
    }

    public void setAvailableIpCount(Integer availableIpCount) {
        this.availableIpCount = availableIpCount;
    }

}