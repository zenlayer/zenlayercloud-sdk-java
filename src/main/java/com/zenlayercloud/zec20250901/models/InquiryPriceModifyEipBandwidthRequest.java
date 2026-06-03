package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class InquiryPriceModifyEipBandwidthRequest extends TeaModel {


    /**
     * 要操作的公网弹性IP。
     */
    public String eipId;

    /**
     * 调整后的带宽上限。
     * 单位：Mbps。
     */
    public Integer bandwidth;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

}