package com.zenlayercloud.pvtdns20251101.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DeletePrivateZoneRecordRequest extends TeaModel {


    /**
     * 内网权威域名ID
     */
    public String zoneId;

    /**
     * 要删除的内网权威域名解析记录ID列表
     */
    public List<String> recordIds;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public List<String> getRecordIds() {
        return this.recordIds;
    }

    public void setRecordIds(List<String> recordIds) {
        this.recordIds = recordIds;
    }

}