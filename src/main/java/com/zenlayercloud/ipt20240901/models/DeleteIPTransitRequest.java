package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


public class DeleteIPTransitRequest extends TeaModel {


    /**
     * IP Transit ID。
     */
    public String iptId;

    public String getIptId() {
        return this.iptId;
    }

    public void setIptId(String iptId) {
        this.iptId = iptId;
    }

}