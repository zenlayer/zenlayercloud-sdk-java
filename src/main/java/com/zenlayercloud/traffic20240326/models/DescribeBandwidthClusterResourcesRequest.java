package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;


public class DescribeBandwidthClusterResourcesRequest extends TeaModel {


    /**
     * 共享带宽包ID
     */
    public String bandwidthClusterId;

    public String getBandwidthClusterId() {
        return this.bandwidthClusterId;
    }

    public void setBandwidthClusterId(String bandwidthClusterId) {
        this.bandwidthClusterId = bandwidthClusterId;
    }

}