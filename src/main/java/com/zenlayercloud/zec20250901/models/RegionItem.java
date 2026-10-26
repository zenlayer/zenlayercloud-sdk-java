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
     * 节点所在城市。
     * 例如 asia-east-1 对应 Shanghai。
     * 区域配置缺失时为null。
     */
    public String location;

    /**
     * 节点所属大区的标识。
     * 例如 EMEA。
     */
    public String wideRegionName;

    /**
     * 节点所属大区的展示名。
     * 例如 Europe and Middle East。
     */
    public String wideRegionTitle;

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

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWideRegionName() {
        return this.wideRegionName;
    }

    public void setWideRegionName(String wideRegionName) {
        this.wideRegionName = wideRegionName;
    }

    public String getWideRegionTitle() {
        return this.wideRegionTitle;
    }

    public void setWideRegionTitle(String wideRegionTitle) {
        this.wideRegionTitle = wideRegionTitle;
    }

    public String getAdministrativeRegion() {
        return this.administrativeRegion;
    }

    public void setAdministrativeRegion(String administrativeRegion) {
        this.administrativeRegion = administrativeRegion;
    }

}