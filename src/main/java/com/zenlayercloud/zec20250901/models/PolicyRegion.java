package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 区域的基本信息。
 */
public class PolicyRegion extends TeaModel {


    /**
     * 区域ID
     */
    public String regionId;

    /**
     * 国家名称
     */
    public String regionName;

    /**
     * 地域名称
     */
    public String areaName;

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

    public String getAreaName() {
        return this.areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

}