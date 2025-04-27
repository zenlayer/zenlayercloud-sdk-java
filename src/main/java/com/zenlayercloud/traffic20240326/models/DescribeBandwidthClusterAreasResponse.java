package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeBandwidthClusterAreasResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 可开通共享流量包区域列表
     */
    public List<BandwidthClusterAreaInfo> areas;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<BandwidthClusterAreaInfo> getAreas() {
        return this.areas;
    }

    public void setAreas(List<BandwidthClusterAreaInfo> areas) {
        this.areas = areas;
    }

}