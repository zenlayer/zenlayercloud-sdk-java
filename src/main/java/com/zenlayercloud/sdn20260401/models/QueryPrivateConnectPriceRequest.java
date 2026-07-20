package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class QueryPrivateConnectPriceRequest extends TeaModel {


    /**
     * 网络计费类型。
     * 默认值为ByBandwidth。
     */
    public String internetType;

    /**
     * 二层网络专线的最大带宽限制。
     * 默认值是10，单位：Mbps。
     */
    public Integer bandwidthMbps;

    /**
     * 二层网络专线A端连接点信息。
     */
    public PrivateConnectEndpointInfo endpointA;

    /**
     * 二层网络专线Z端连接点信息。
     */
    public PrivateConnectEndpointInfo endpointZ;

    public String getInternetType() {
        return this.internetType;
    }

    public void setInternetType(String internetType) {
        this.internetType = internetType;
    }

    public Integer getBandwidthMbps() {
        return this.bandwidthMbps;
    }

    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }

    public PrivateConnectEndpointInfo getEndpointA() {
        return this.endpointA;
    }

    public void setEndpointA(PrivateConnectEndpointInfo endpointA) {
        this.endpointA = endpointA;
    }

    public PrivateConnectEndpointInfo getEndpointZ() {
        return this.endpointZ;
    }

    public void setEndpointZ(PrivateConnectEndpointInfo endpointZ) {
        this.endpointZ = endpointZ;
    }

}