package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;


public class UpdateBandwidthClusterCommitBandwidthRequest extends TeaModel {


    /**
     * 共享带宽包ID
     */
    public String bandwidthClusterId;

    /**
     * 保底带宽
     */
    public Integer commitBandwidthMbps;

    public String getBandwidthClusterId() {
        return this.bandwidthClusterId;
    }

    public void setBandwidthClusterId(String bandwidthClusterId) {
        this.bandwidthClusterId = bandwidthClusterId;
    }

    public Integer getCommitBandwidthMbps() {
        return this.commitBandwidthMbps;
    }

    public void setCommitBandwidthMbps(Integer commitBandwidthMbps) {
        this.commitBandwidthMbps = commitBandwidthMbps;
    }

}