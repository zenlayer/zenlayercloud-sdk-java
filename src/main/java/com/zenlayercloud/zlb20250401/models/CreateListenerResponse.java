package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;


public class CreateListenerResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 创建的监听器ID
     */
    public String listenerId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getListenerId() {
        return this.listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

}