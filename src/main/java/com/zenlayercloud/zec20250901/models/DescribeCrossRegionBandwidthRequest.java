package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询内网跨区域带宽列表请求参数。
 */
public class DescribeCrossRegionBandwidthRequest extends TeaModel {


    /**
     * 按照唯一ID过滤
     */
    public List<String> crossRegionBandwidthIds;

    /**
     * 按照显示名称过滤，该字段支持模糊匹配
     */
    public String crossRegionBandwidthName;

    /**
     * 按照所属的VPC的ID过滤
     */
    public String vpcId;

    /**
     * 按照其中一端的区域连接点（A）过滤
     */
    public String regionA;

    /**
     * 按照另一端的区域连接点（Z）过滤
     */
    public String regionZ;

    /**
     * 按照状态过滤
     */
    public String status;

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
     * 根据资源组ID过滤
     */
    public String resourceGroupId;

    public List<String> getCrossRegionBandwidthIds() {
        return this.crossRegionBandwidthIds;
    }

    public void setCrossRegionBandwidthIds(List<String> crossRegionBandwidthIds) {
        this.crossRegionBandwidthIds = crossRegionBandwidthIds;
    }

    public String getCrossRegionBandwidthName() {
        return this.crossRegionBandwidthName;
    }

    public void setCrossRegionBandwidthName(String crossRegionBandwidthName) {
        this.crossRegionBandwidthName = crossRegionBandwidthName;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getRegionA() {
        return this.regionA;
    }

    public void setRegionA(String regionA) {
        this.regionA = regionA;
    }

    public String getRegionZ() {
        return this.regionZ;
    }

    public void setRegionZ(String regionZ) {
        this.regionZ = regionZ;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

}