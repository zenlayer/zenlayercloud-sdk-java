package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class ModifyEipBandwidthLimitModeRequest extends TeaModel {


    /**
     * 弹性公网IP的唯一ID。
     */
    public String eipId;

    /**
     * 新的限速模式。
     */
    public String rateLimitMode;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public String getRateLimitMode() {
        return this.rateLimitMode;
    }

    public void setRateLimitMode(String rateLimitMode) {
        this.rateLimitMode = rateLimitMode;
    }

}