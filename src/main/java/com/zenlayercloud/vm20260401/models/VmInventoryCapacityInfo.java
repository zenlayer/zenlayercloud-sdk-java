package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 可用区库存相关信息。
 */
public class VmInventoryCapacityInfo extends TeaModel {


    /**
     * 可用区ID。
     */
    public String zoneId;

    /**
     * 档位。
     * 库存容量根据所有机型可售核数定义。
     */
    public String capacity;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getCapacity() {
        return this.capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

}