package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class DeleteSnatEntryRequest extends TeaModel {


    /**
     * SNAT规则 ID
     */
    public String snatEntryId;

    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    public void setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
    }

}