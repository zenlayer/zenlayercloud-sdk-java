package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeBandwidthClusterResourcesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 共享带宽包里的资源信息
     */
    public List<BandwidthClusterResource> resources;

    /**
     * 共享带宽包里的资源数量
     */
    public Integer totalCount;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<BandwidthClusterResource> getResources() {
        return this.resources;
    }

    public void setResources(List<BandwidthClusterResource> resources) {
        this.resources = resources;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

}