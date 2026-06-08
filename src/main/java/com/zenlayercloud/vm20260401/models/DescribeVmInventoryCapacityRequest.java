package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeVmInventoryCapacityRequest extends TeaModel {


    /**
     * 可用区ID。
     */
    public String zoneId;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

}