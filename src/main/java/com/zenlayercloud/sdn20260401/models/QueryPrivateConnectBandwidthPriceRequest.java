package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class QueryPrivateConnectBandwidthPriceRequest extends TeaModel {


    /**
     * 二层网络其中一端接入点的数据中心ID。
     */
    public String sourceDcId;

    /**
     * 二层网络另外一端接入点的数据中心ID。
     */
    public String destinationDcId;

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
     * 二层网络专线服务等级。
     * 默认值为SINGLE_PROTECTED。
     */
    public String serviceLevel;

    public String getSourceDcId() {
        return this.sourceDcId;
    }

    public void setSourceDcId(String sourceDcId) {
        this.sourceDcId = sourceDcId;
    }

    public String getDestinationDcId() {
        return this.destinationDcId;
    }

    public void setDestinationDcId(String destinationDcId) {
        this.destinationDcId = destinationDcId;
    }

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

    public String getServiceLevel() {
        return this.serviceLevel;
    }

    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

}