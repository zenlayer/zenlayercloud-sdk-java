package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;


public class CreateDnatEntryResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * DNAT规则唯一ID
     */
    public String dnatEntryId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getDnatEntryId() {
        return this.dnatEntryId;
    }

    public void setDnatEntryId(String dnatEntryId) {
        this.dnatEntryId = dnatEntryId;
    }

}