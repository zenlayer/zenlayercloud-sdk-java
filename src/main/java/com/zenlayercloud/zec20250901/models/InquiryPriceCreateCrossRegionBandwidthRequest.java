package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 创建内网跨地域带宽询价请求参数
 */
public class InquiryPriceCreateCrossRegionBandwidthRequest extends TeaModel {


    /**
     * 网络计费类型
     */
    public String internetChargeType;

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

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
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

}