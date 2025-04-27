package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeBandwidthClustersRequest extends TeaModel {


    /**
     * 共享带宽包ID。
     * 最多支持100个ID查询
     */
    public List<String> bandwidthClusterIds;

    /**
     * 共享带宽包显示名称。
     * 支持模糊匹配
     */
    public String bandwidthClusterName;

    /**
     * 共享带宽包所包含的城市名称
     */
    public String cityName;

    /**
     * 返回的分页大小。
     * 默认为20，最大为1000
     */
    public Integer pageNum;

    /**
     * 返回的分页数。
     * 默认为1
     */
    public Integer pageSize;

    public List<String> getBandwidthClusterIds() {
        return this.bandwidthClusterIds;
    }

    public void setBandwidthClusterIds(List<String> bandwidthClusterIds) {
        this.bandwidthClusterIds = bandwidthClusterIds;
    }

    public String getBandwidthClusterName() {
        return this.bandwidthClusterName;
    }

    public void setBandwidthClusterName(String bandwidthClusterName) {
        this.bandwidthClusterName = bandwidthClusterName;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
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

}