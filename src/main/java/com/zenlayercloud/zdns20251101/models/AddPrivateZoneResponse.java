package com.zenlayercloud.zdns20251101.models;

import com.aliyun.tea.TeaModel;


public class AddPrivateZoneResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 新增的内网权威域名ID
     */
    public String zoneId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

}