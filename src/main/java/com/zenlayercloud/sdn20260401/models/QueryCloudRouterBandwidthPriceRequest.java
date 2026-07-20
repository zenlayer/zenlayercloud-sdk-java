package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class QueryCloudRouterBandwidthPriceRequest extends TeaModel {


    /**
     * 三层网络骨干网的数据中心ID。
     */
    public String dcId;

    /**
     * 三层网络的最大带宽限制。
     * 默认值是10，单位：Mbps。
     */
    public Integer bandwidthMbps;

    public String getDcId() {
        return this.dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
    }

    public Integer getBandwidthMbps() {
        return this.bandwidthMbps;
    }

    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }

}