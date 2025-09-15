package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 公网IPv6流量包或固定带宽询价的请求参数。
 */
public class InquiryPricePublicIpv6Request extends TeaModel {


    /**
     * 节点ID
     */
    public String regionId;

    /**
     * 流量包订购大小。
     * 单位为TB
     */
    public Double packageSize;

    /**
     * 公网出带宽上限。
     * 单位：Mbps。
     * 不同机型带宽上限范围不一致，具体限制详见购买网络带宽
     */
    public Integer bandwidth;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public Double getPackageSize() {
        return this.packageSize;
    }

    public void setPackageSize(Double packageSize) {
        this.packageSize = packageSize;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

}