package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class InquiryPriceModifyUnmanagedEgressIpBandwidthRequest extends TeaModel {


    /**
     * 要操作的非托管出口IP。
     */
    public String unmanagedEgressIpId;

    /**
     * 调整后的带宽上限。
     * 单位：Mbps。
     */
    public Integer bandwidth;

    public String getUnmanagedEgressIpId() {
        return this.unmanagedEgressIpId;
    }

    public void setUnmanagedEgressIpId(String unmanagedEgressIpId) {
        this.unmanagedEgressIpId = unmanagedEgressIpId;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

}