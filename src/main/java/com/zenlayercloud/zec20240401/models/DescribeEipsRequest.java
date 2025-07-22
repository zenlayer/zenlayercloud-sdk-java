package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeEipsRequest extends TeaModel {


    /**
     * 按照 EIP 的唯一 ID 过滤
     */
    public List<String> eipIds;

    /**
     * 按照 EIP 所属节点ID过滤
     */
    public String regionId;

    /**
     * 按照 EIP 的显示名称过滤，该字段支持模糊匹配
     */
    public String name;

    /**
     * 按照 EIP 的状态过滤
     */
    public String status;

    /**
     * 按照 EIP 的默认属性进行过滤
     */
    public Boolean isDefault;

    /**
     * 返回的分页大小。
     * 默认为20，最大为1000
     */
    public Integer pageSize;

    /**
     * 返回的分页页码。
     * 默认为1
     */
    public Integer pageNum;

    /**
     * 按照 EIP 绑定的内网 IP 过滤
     */
    public String privateIpAddress;

    /**
     * 按照 EIP 的 IP 过滤
     */
    public String ipAddress;

    /**
     * 按照 EIP 的 IP列表过滤
     */
    public List<String> ipAddresses;

    /**
     * 按照 EIP 绑定的实例 ID 过滤。
     * 该字段过滤出该实例所绑定的网卡上的 EIP
     */
    public String instanceId;

    /**
     * 按照 EIP 绑定的资源 ID 过滤
     */
    public String associatedId;

    /**
     * 按照 EIP 所属的CIDR ID列表 过滤
     */
    public List<String> cidrIds;

    /**
     * 按照 资源组ID 过滤
     */
    public String resourceGroupId;


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

}