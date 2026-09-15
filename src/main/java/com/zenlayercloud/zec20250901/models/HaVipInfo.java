package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 高可用虚拟IP信息。
 */
public class HaVipInfo extends TeaModel {


    /**
     * 高可用虚拟IP的ID。
     */
    public String haVipId;

    /**
     * 高可用虚拟IP名称。
     */
    public String name;

    /**
     * HaVip所在节点的ID。
     */
    public String regionId;

    /**
     * 所属VPC的ID。
     */
    public String vpcId;

    /**
     * 所属子网ID。
     */
    public String subnetId;

    /**
     * 安全组ID。
     */
    public String securityGroupId;

    /**
     * 高可用虚拟IP的私网IPv4地址。
     */
    public String ipAddress;

    /**
     * 关联的实例ID列表。
     */
    public List<String> associatedInstances;

    /**
     * 当前持有该VIP流量的主实例ID。未绑定实例或无主实例时为null。
     */
    public String masterInstanceId;

    /**
     * 绑定的弹性公网IP列表。未绑定时返回空列表。
     */
    public List<HaVipEipAttachment> associatedEips;

    /**
     * 创建时间。
     */
    public String createTime;

    /**
     * 标签列表。
     */
    public Tags tags;

    public String getHaVipId() {
        return this.haVipId;
    }

    public void setHaVipId(String haVipId) {
        this.haVipId = haVipId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public List<String> getAssociatedInstances() {
        return this.associatedInstances;
    }

    public void setAssociatedInstances(List<String> associatedInstances) {
        this.associatedInstances = associatedInstances;
    }

    public String getMasterInstanceId() {
        return this.masterInstanceId;
    }

    public void setMasterInstanceId(String masterInstanceId) {
        this.masterInstanceId = masterInstanceId;
    }

    public List<HaVipEipAttachment> getAssociatedEips() {
        return this.associatedEips;
    }

    public void setAssociatedEips(List<HaVipEipAttachment> associatedEips) {
        this.associatedEips = associatedEips;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}