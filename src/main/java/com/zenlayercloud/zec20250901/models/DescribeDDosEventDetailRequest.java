package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeDDosEventDetailRequest extends TeaModel {


    /**
     * 攻击事件唯一ID。
     */
    public String eventId;

    /**
     * 区域节点ID。
     */
    public String regionId;

    public String getEventId() {
        return this.eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

}