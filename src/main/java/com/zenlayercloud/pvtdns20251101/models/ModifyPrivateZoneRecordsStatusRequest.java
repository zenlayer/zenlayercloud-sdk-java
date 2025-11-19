package com.zenlayercloud.pvtdns20251101.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyPrivateZoneRecordsStatusRequest extends TeaModel {


    /**
     * 内网权威域名ID
     */
    public String zoneId;

    /**
     * 要修改生效状态的内网权威域名解析记录ID
     */
    public String recordId;

    /**
     * 生效状态
     */
    public String status;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getRecordId() {
        return this.recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}