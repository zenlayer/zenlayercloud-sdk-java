package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * Eip信息。
 */
public class EipAddress extends TeaModel {


    /**
     * EIP唯一ID。
     */
    public String eipId;

    /**
     * EIP所属的可用区ID。
     */
    public String zoneId;

    /**
     * IP地址。
     */
    public String ipAddress;

    /**
     * IP掩码。
     */
    public Integer netmask;

    /**
     * 实例ID。
     */
    public String instanceId;

    /**
     * 实例名称。
     */
    public String instanceName;

    /**
     * 付费类型。
     * PREPAID：预付费，即包年包月。POSTPAID：后付费。
     */
    public String eipChargeType;

    /**
     * 购买EIP的时长。
     * 单位：月。
     * 后付费EIP该字段为null。
     */
    public Integer period;

    /**
     * 创建时间。
     * 按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-ddTHH:mm:ssZ。
     */
    public String createTime;

    /**
     * 到期时间。
     * 按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-ddTHH:mm:ssZ。
     * 注意：后付费模式本项为null。
     */
    public String expiredTime;

    /**
     * 资源组ID。
     */
    public String resourceGroupId;

    /**
     * 资源组名称。
     */
    public String resourceGroupName;

    /**
     * EIP状态
     */
    public String eipStatus;

    /**
     * 资源关联的标签信息。
     */
    public Tags tags;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
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

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getEipChargeType() {
        return this.eipChargeType;
    }

    public void setEipChargeType(String eipChargeType) {
        this.eipChargeType = eipChargeType;
    }

    public Integer getPeriod() {
        return this.period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getExpiredTime() {
        return this.expiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    public String getEipStatus() {
        return this.eipStatus;
    }

    public void setEipStatus(String eipStatus) {
        this.eipStatus = eipStatus;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}