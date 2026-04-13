package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class DeleteListenerRequest extends TeaModel {


    /**
     * 监听器的ID。
     */
    public String listenerId;

    public String getListenerId() {
        return this.listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

}