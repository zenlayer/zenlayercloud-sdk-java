package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 区域的BYOIP支持情况。
 */
public class ByoipRegionAvailability extends TeaModel {


    /**
     * 区域ID。
     */
    public String regionId;

    /**
     * 区域所在城市。
     */
    public String location;

    /**
     * 各线路的BYOIP支持状态。
     */
    public List<ByoipLineAvailability> lineAvailabilities;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<ByoipLineAvailability> getLineAvailabilities() {
        return this.lineAvailabilities;
    }

    public void setLineAvailabilities(List<ByoipLineAvailability> lineAvailabilities) {
        this.lineAvailabilities = lineAvailabilities;
    }

}