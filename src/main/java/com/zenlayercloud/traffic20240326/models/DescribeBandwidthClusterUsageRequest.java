package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;


public class DescribeBandwidthClusterUsageRequest extends TeaModel {


    /**
     * 共享带宽包ID。
     */
    public String bandwidthClusterId;

    /**
     * 返回的分页大小。
     * 默认为20。
     */
    public Integer pageSize;

    /**
     * 返回的分页数。
     * 默认为1。
     */
    public Integer pageNum;

    public String getBandwidthClusterId() {
        return this.bandwidthClusterId;
    }

    public void setBandwidthClusterId(String bandwidthClusterId) {
        this.bandwidthClusterId = bandwidthClusterId;
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