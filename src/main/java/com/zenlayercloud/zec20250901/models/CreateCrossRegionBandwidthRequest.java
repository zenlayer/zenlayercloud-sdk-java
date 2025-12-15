package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 创建内网跨区域带宽请求参数。
 */
public class CreateCrossRegionBandwidthRequest extends TeaModel {


    /**
     * 创建内网跨区域带宽所在的VPC ID
     */
    public String vpcId;

    /**
     * 网络计费类型
     */
    public String internetChargeType;

    /**
     * 内网跨区域带宽的名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-/_和英文句点(.)。
     * 且必须以数字或字母开头和结尾
     */
    public String crossRegionBandwidthName;

    /**
     * 市场营销的相关选项
     */
    public MarketingInfo marketingInfo;

    /**
     * 其中一端的区域连接点（A）
     */
    public String regionA;

    /**
     * 另一端的区域连接点（Z）
     */
    public String regionZ;

    /**
     * 带宽|保底带宽。
     * 单位：Mbps
     */
    public Integer bandwidth;

    /**
     * 突发带宽。
     * 单位：Mbps。
     * 当且仅当internetChargeType为`ByInstanceBandwidth95`时此字段必填
     */
    public Integer bandwidthCap;

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public String getCrossRegionBandwidthName() {
        return this.crossRegionBandwidthName;
    }

    public void setCrossRegionBandwidthName(String crossRegionBandwidthName) {
        this.crossRegionBandwidthName = crossRegionBandwidthName;
    }

    public MarketingInfo getMarketingInfo() {
        return this.marketingInfo;
    }

    public void setMarketingInfo(MarketingInfo marketingInfo) {
        this.marketingInfo = marketingInfo;
    }

    public String getRegionA() {
        return this.regionA;
    }

    public void setRegionA(String regionA) {
        this.regionA = regionA;
    }

    public String getRegionZ() {
        return this.regionZ;
    }

    public void setRegionZ(String regionZ) {
        this.regionZ = regionZ;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Integer getBandwidthCap() {
        return this.bandwidthCap;
    }

    public void setBandwidthCap(Integer bandwidthCap) {
        this.bandwidthCap = bandwidthCap;
    }

}