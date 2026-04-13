package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeInstancesRequest extends TeaModel {


    /**
     * 实例ID。
     * 最多支持100个ID查询。
     */
    public List<String> instanceIds;

    /**
     * 实例所属的可用区ID。
     */
    public String zoneId;

    /**
     * 资源组的ID。
     * 如果不传，则返回该用户可见的所有资源组内的实例。
     */
    public String resourceGroupId;

    /**
     * 实例机型ID。
     * 具体取值可通过调用接口DescribeInstanceTypes来获得最新的规格表。
     */
    public String instanceTypeId;

    /**
     * 网络计费类型。
     */
    public String internetChargeType;

    /**
     * 镜像ID。
     */
    public String imageId;

    /**
     * 虚拟子网ID 。
     * 可以调用DescribeVpcSubnets查询已创建交换机的相关信息。
     */
    public String subnetId;

    /**
     * 实例状态。
     * 状态类型详见实例状态。
     */
    public String instanceStatus;

    /**
     * 实例显示名称。
     * 如果该值以*结尾，则对instanceName进行模糊匹配，否则将进行精确匹配。
     */
    public String instanceName;

    /**
     * 实例的主机名。
     * 如果该值以*结尾，则对hostname进行模糊匹配，否则将进行精确匹配。
     */
    public String hostname;

    /**
     * 公网ipv4地址。
     */
    public List<String> publicIpAddresses;

    /**
     * 内网子网的ipv4地址。
     */
    public List<String> privateIpAddresses;

    /**
     * 返回的分页数。
     */
    public Integer pageNum;

    /**
     * 返回的分页大小。
     * 默认为20，最大为1000。
     */
    public Integer pageSize;

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

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getInstanceTypeId() {
        return this.instanceTypeId;
    }

    public void setInstanceTypeId(String instanceTypeId) {
        this.instanceTypeId = instanceTypeId;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public List<String> getPublicIpAddresses() {
        return this.publicIpAddresses;
    }

    public void setPublicIpAddresses(List<String> publicIpAddresses) {
        this.publicIpAddresses = publicIpAddresses;
    }

    public List<String> getPrivateIpAddresses() {
        return this.privateIpAddresses;
    }

    public void setPrivateIpAddresses(List<String> privateIpAddresses) {
        this.privateIpAddresses = privateIpAddresses;
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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

}