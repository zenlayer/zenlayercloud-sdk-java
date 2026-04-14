package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


public class ModifyIPTransitBandwidthRequest extends TeaModel {


    /**
     * IP Transit ID。
     */
    public String iptId;

    /**
     * 需要修改的带宽限速。
     * 范围：1~1000。
     * 单位：Mbps。
     */
    public Integer bandwidth;

    /**
     * 保底带宽。
     * 当IP Transit的带宽计费方式为95计费时该参数有效，如果不设置，则不会修改保底。
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