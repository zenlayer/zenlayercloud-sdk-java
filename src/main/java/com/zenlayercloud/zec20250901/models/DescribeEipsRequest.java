package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeEipsRequest extends TeaModel {


    /**
     * 按照EIP的唯一ID过滤。
     */
    public List<String> eipIds;

    /**
     * 按照EIP所属节点ID过滤。
     * 可通过调用 ~~DescribeRegions~~ 获取。
     */
    public String regionId;

    /**
     * 按照EIP的显示名称过滤，该字段支持模糊匹配。
     */
    public String name;

    /**
     * 按照EIP的状态过滤。
     */
    public String status;

    /**
     * 按照EIP的默认属性进行过滤。
     */
    public Boolean isDefault;

    /**
     * 返回的分页大小。
     * 默认为20，最大为1000。
     */
    public Integer pageSize;

    /**
     * 返回的分页页码。
     */
    public Integer pageNum;

    /**
     * 按照EIP绑定的内网IP过滤。
     */
    public String privateIpAddress;

    /**
     * 按照EIP的IP过滤。
     */
    public String ipAddress;

    /**
     * 按照EIP的IP列表过滤。
     */
    public List<String> ipAddresses;

    /**
     * 按照EIP绑定的实例ID过滤。
     * 该字段过滤出该实例所绑定的网卡上的EIP。
     * 可通过调用 ~~DescribeInstances~~ 获取。
     */
    public String instanceId;

    /**
     * 按照EIP绑定的资源ID过滤。
     */
    public String associatedId;

    /**
     * 按照EIP所属的CIDR ID过滤。
     * 可通过调用 ~~DescribeCidrs~~ 获取。
     */
    public List<String> cidrIds;

    /**
     * 按照EIP所属的资源组ID过滤。
     */
    public String resourceGroupId;

    /**
     * 根据标签键进行搜索。
     * 最长不得超过20个标签键。
     */
    public List<String> tagKeys;

    /**
     * 根据标签进行搜索。
     * 最长不得超过20个标签。
     */
    public List<Tag> tags;

    /**
     * 按照EIP的网络计费方式过滤。
     */
    public String internetChargeType;

    /**
     * 按照EIP的掩码长度过滤。
     * 32表示单IP，20–31表示网段。
     */
    public Integer prefixLength;

    public List<String> getEipIds() {
        return this.eipIds;
    }

    public void setEipIds(List<String> eipIds) {
        this.eipIds = eipIds;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public List<String> getIpAddresses() {
        return this.ipAddresses;
    }

    public void setIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getAssociatedId() {
        return this.associatedId;
    }

    public void setAssociatedId(String associatedId) {
        this.associatedId = associatedId;
    }

    public List<String> getCidrIds() {
        return this.cidrIds;
    }

    public void setCidrIds(List<String> cidrIds) {
        this.cidrIds = cidrIds;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public List<String> getTagKeys() {
        return this.tagKeys;
    }

    public void setTagKeys(List<String> tagKeys) {
        this.tagKeys = tagKeys;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public Integer getPrefixLength() {
        return this.prefixLength;
    }

    public void setPrefixLength(Integer prefixLength) {
        this.prefixLength = prefixLength;
    }

}