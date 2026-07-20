package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class QueryCloudOnrampPriceRequest extends TeaModel {


    /**
     * 云连接类型。
     * 可选值：AWS | TENCENT | GOOGLE | ALI_CLOUD | AZURE | HUAWEI_CLOUD。
     */
    public String cloudType;

    /**
     * 云连接的数据中心ID。
     */
    public String dcId;

    /**
     * 云连接的最大带宽限制。
     * 默认值是10，单位：Mbps。
     */
    public Integer bandwidthMbps;

    /**
     * VLAN ID。
     */
    public Integer vlanId;

    /**
     * 公有云区域ID。
     * Google云无需传参。
     */
    public String cloudRegionId;

    public String getCloudType() {
        return this.cloudType;
    }

    public void setCloudType(String cloudType) {
        this.cloudType = cloudType;
    }

    public String getDcId() {
        return this.dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
    }

    public Integer getBandwidthMbps() {
        return this.bandwidthMbps;
    }

    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }

    public Integer getVlanId() {
        return this.vlanId;
    }

    public void setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
    }

    public String getCloudRegionId() {
        return this.cloudRegionId;
    }

    public void setCloudRegionId(String cloudRegionId) {
        this.cloudRegionId = cloudRegionId;
    }

}