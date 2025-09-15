package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述带宽组的基本信息。
 */
public class BandwidthClusterInfo extends TeaModel {


    /**
     * 共享带宽包ID
     */
    public String bandwidthClusterId;

    /**
     * 共享带宽包名称
     */
    public String bandwidthClusterName;

    public String getBandwidthClusterId() {
        return this.bandwidthClusterId;
    }

    public void setBandwidthClusterId(String bandwidthClusterId) {
        this.bandwidthClusterId = bandwidthClusterId;
    }

    public String getBandwidthClusterName() {
        return this.bandwidthClusterName;
    }

    public void setBandwidthClusterName(String bandwidthClusterName) {
        this.bandwidthClusterName = bandwidthClusterName;
    }

}