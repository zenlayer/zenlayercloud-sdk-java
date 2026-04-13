package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class ModifyInstanceBandwidthResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 订单编号。
     */
    public String orderNumber;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

}