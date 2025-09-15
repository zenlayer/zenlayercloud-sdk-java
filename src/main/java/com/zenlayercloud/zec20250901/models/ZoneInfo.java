package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 可用区的基本信息。
 */
public class ZoneInfo extends TeaModel {


    /**
     * 可用区ID
     */
    public String zoneId;

    /**
     * 可用区所在的节点ID
     */
    public String regionId;

    /**
     * 可用区名称
     */
    public String zoneName;

    /**
     * 可用区是否支持安全组。
     * 该字段已废弃，当前所有节点均支持安全组
     */
    public Boolean supportSecurityGroup;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public Boolean getSupportSecurityGroup() {
        return this.supportSecurityGroup;
    }

    public void setSupportSecurityGroup(Boolean supportSecurityGroup) {
        this.supportSecurityGroup = supportSecurityGroup;
    }

}