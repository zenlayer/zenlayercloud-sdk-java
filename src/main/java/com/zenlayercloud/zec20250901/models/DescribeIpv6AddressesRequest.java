package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeIpv6AddressesRequest extends TeaModel {


    /**
     * 按照公网IPv6的唯一ID过滤。
     * 最大不能超过100个。
     */
    public List<String> ipv6Ids;

    /**
     * 按照公网IPv6所属节点ID过滤。
     * 可通过调用 ~~DescribeRegions~~ 获取。
     */
    public String regionId;

    /**
     * 按照公网IPv6的CIDR地址段过滤，该字段支持模糊匹配。
     */
    public String ipv6Cidr;

    /**
     * 按照公网IPv6的状态过滤。
     */
    public String status;

    /**
     * 按照公网IPv6绑定的资源ID过滤。
     * 取值可以是网卡ID或负载均衡ID。
     */
    public List<String> associatedIds;

    /**
     * 按照公网IPv6所属的资源组ID过滤。
     */
    public String resourceGroupId;

    /**
     * 返回的分页大小。
     * 当未传递时，默认值为20。
     */
    public Integer pageSize;

    /**
     * 返回的分页数。
     * 当未传递时，默认值为1。
     */
    public Integer pageNum;

    public List<String> getIpv6Ids() {
        return this.ipv6Ids;
    }

    public void setIpv6Ids(List<String> ipv6Ids) {
        this.ipv6Ids = ipv6Ids;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getIpv6Cidr() {
        return this.ipv6Cidr;
    }

    public void setIpv6Cidr(String ipv6Cidr) {
        this.ipv6Cidr = ipv6Cidr;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getAssociatedIds() {
        return this.associatedIds;
    }

    public void setAssociatedIds(List<String> associatedIds) {
        this.associatedIds = associatedIds;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
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

}