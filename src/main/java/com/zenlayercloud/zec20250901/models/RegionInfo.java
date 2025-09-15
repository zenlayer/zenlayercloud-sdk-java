package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 节点信息。
 */
public class RegionInfo extends TeaModel {


    /**
     * 节点ID
     */
    public String regionId;

    /**
     * 节点名称
     */
    public String regionName;

    /**
     * 节点标题
     */
    public String regionTitle;

    /**
     * 是否支持IPv6
     */
    public Boolean enablePubIpv6;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return this.regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionTitle() {
        return this.regionTitle;
    }

    public void setRegionTitle(String regionTitle) {
        this.regionTitle = regionTitle;
    }

    public Boolean getEnablePubIpv6() {
        return this.enablePubIpv6;
    }

    public void setEnablePubIpv6(Boolean enablePubIpv6) {
        this.enablePubIpv6 = enablePubIpv6;
    }

}