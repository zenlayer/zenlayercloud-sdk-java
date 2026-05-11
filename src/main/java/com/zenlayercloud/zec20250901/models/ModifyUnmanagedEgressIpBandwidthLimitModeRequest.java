package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class ModifyUnmanagedEgressIpBandwidthLimitModeRequest extends TeaModel {


    /**
     * 非托管出口IP的唯一ID。
     */
    public String unmanagedEgressIpId;

    /**
     * 新的限速模式。
     */
    public String rateLimitMode;

    public String getUnmanagedEgressIpId() {
        return this.unmanagedEgressIpId;
    }

    public void setUnmanagedEgressIpId(String unmanagedEgressIpId) {
        this.unmanagedEgressIpId = unmanagedEgressIpId;
    }

    public String getRateLimitMode() {
        return this.rateLimitMode;
    }

    public void setRateLimitMode(String rateLimitMode) {
        this.rateLimitMode = rateLimitMode;
    }

}