package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class InquiryPriceChangeUnmanagedEgressIpInternetChargeTypeRequest extends TeaModel {


    /**
     * 要操作的非托管出口IP。
     */
    public String unmanagedEgressIpId;

    /**
     * 要变更的目标网络计费类型。
     */
    public String internetChargeType;

    /**
     * 带宽限速。
     * 单位：Mbps。
     * 变更为按带宽计费（ByBandwidth）时必传。
     */
    public Integer bandwidth;

    /**
     * 流量包大小。
     * 单位：TB，为0或0.1的倍数。
     * 变更为流量包计费（ByTrafficPackage）时必传。
     */
    public Double flowPackage;

    public String getUnmanagedEgressIpId() {
        return this.unmanagedEgressIpId;
    }

    public void setUnmanagedEgressIpId(String unmanagedEgressIpId) {
        this.unmanagedEgressIpId = unmanagedEgressIpId;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Double getFlowPackage() {
        return this.flowPackage;
    }

    public void setFlowPackage(Double flowPackage) {
        this.flowPackage = flowPackage;
    }

}