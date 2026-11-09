package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DeleteInternetRequest extends TeaModel {


    /**
     * Internet ID。
     */
    public String internetId;

    public String getInternetId() {
        return this.internetId;
    }

    public void setInternetId(String internetId) {
        this.internetId = internetId;
    }

}