package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeGoogleRegionsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 接入点相关的区域信息列表。
     */
    public List<CloudRegion> cloudRegions;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<CloudRegion> getCloudRegions() {
        return this.cloudRegions;
    }

    public void setCloudRegions(List<CloudRegion> cloudRegions) {
        this.cloudRegions = cloudRegions;
    }

}