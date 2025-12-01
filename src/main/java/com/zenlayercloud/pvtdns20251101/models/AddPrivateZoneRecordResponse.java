package com.zenlayercloud.pvtdns20251101.models;

import com.aliyun.tea.TeaModel;


public class AddPrivateZoneRecordResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 内网权威域名解析记录ID
     */
    public String recordId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRecordId() {
        return this.recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

}