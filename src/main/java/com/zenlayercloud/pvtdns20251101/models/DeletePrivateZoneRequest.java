package com.zenlayercloud.pvtdns20251101.models;

import com.aliyun.tea.TeaModel;


public class DeletePrivateZoneRequest extends TeaModel {


    /**
     * 要删除的内网权威域名ID
     */
    public String zoneId;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

}