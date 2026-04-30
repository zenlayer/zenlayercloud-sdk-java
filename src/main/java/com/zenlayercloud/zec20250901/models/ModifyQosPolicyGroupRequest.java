package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class ModifyQosPolicyGroupRequest extends TeaModel {


    /**
     * QoS策略组ID。
     */
    public String qosPolicyGroupId;

    /**
     * QoS策略组新名称。
     * 长度不能超过64个字符。
     */
    public String name;

    /**
     * 新的带宽限制，单位Mbps。
     * 最大不得超过100000000 Mbps。
     */
    public Long bandwidthLimit;

    /**
     * 新的限速模式。
     */
    public String rateLimitMode;

    public String getQosPolicyGroupId() {
        return this.qosPolicyGroupId;
    }

    public void setQosPolicyGroupId(String qosPolicyGroupId) {
        this.qosPolicyGroupId = qosPolicyGroupId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBandwidthLimit() {
        return this.bandwidthLimit;
    }

    public void setBandwidthLimit(Long bandwidthLimit) {
        this.bandwidthLimit = bandwidthLimit;
    }

    public String getRateLimitMode() {
        return this.rateLimitMode;
    }

    public void setRateLimitMode(String rateLimitMode) {
        this.rateLimitMode = rateLimitMode;
    }

}