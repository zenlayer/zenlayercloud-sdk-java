package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class DeleteDnatEntryRequest extends TeaModel {


    /**
     * DNAT规则 ID
     */
    public String dnatEntryId;

    public String getDnatEntryId() {
        return this.dnatEntryId;
    }

    public void setDnatEntryId(String dnatEntryId) {
        this.dnatEntryId = dnatEntryId;
    }

}