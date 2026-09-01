package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 节点的基本信息。
 */
public class RegionItem extends TeaModel {


    /**
     * 节点ID。
     */
    public String regionId;

    /**
     * 节点名称。
     */
    public String regionName;

    /**
     * 节点所属的行政区划。
     * 区域配置缺失时为null。
     */
    public String administrativeRegion;

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

    public String getAdministrativeRegion() {
        return this.administrativeRegion;
    }

    public void setAdministrativeRegion(String administrativeRegion) {
        this.administrativeRegion = administrativeRegion;
    }

}