package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class InquiryCreatePrivateConnectPriceRequest extends TeaModel {


    /**
     * 二层网络专线最大带宽限制。
     * 默认为 1，单位：Mbps。
     */
    public Integer bandwidthMbps;

    /**
     * 网络计费方式。
     */
    public String internetType;

    /**
     * 保底带宽。
     * 单位：Mbps。
     */
    public Integer commitBandwidth;

    /**
     * 二层网络专线一端的连接点（A）。
     */
    public CreateEndpointParam endpointA;

    /**
     * 二层网络专线另一端的连接点（Z）。
     */
    public CreateEndpointParam endpointZ;

    public Integer getBandwidthMbps() {
        return this.bandwidthMbps;
    }

    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }

    public String getInternetType() {
        return this.internetType;
    }

    public void setInternetType(String internetType) {
        this.internetType = internetType;
    }

    public Integer getCommitBandwidth() {
        return this.commitBandwidth;
    }

    public void setCommitBandwidth(Integer commitBandwidth) {
        this.commitBandwidth = commitBandwidth;
    }

    public CreateEndpointParam getEndpointA() {
        return this.endpointA;
    }

    public void setEndpointA(CreateEndpointParam endpointA) {
        this.endpointA = endpointA;
    }

    public CreateEndpointParam getEndpointZ() {
        return this.endpointZ;
    }

    public void setEndpointZ(CreateEndpointParam endpointZ) {
        this.endpointZ = endpointZ;
    }

}