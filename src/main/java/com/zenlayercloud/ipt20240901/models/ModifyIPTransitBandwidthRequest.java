package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyIPTransitBandwidthRequest extends TeaModel {


    /**
     * IP Transit ID。
     */
    public String iptId;

    /**
     * 目标带宽（Mbps）。
     */
    public Integer bandwidth;

    /**
     * 保底带宽（Mbps）。
     * 不填则与 bandwidth 相同。
     */
    public Integer commitBandwidth;

    public String getIptId() {
        return this.iptId;
    }

    public void setIptId(String iptId) {
        this.iptId = iptId;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Integer getCommitBandwidth() {
        return this.commitBandwidth;
    }

    public void setCommitBandwidth(Integer commitBandwidth) {
        this.commitBandwidth = commitBandwidth;
    }

}