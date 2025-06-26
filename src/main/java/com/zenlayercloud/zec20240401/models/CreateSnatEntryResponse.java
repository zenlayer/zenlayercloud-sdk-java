package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;


public class CreateSnatEntryResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * SNAT规则唯一ID
     */
    public String snatEntryId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    public void setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
    }

}