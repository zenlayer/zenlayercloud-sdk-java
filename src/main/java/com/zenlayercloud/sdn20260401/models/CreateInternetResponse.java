package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class CreateInternetResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 订单号。
     */
    public String orderNumber;

    /**
     * Internet ID。
     */
    public String internetId;

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

    public String getInternetId() {
        return this.internetId;
    }

    public void setInternetId(String internetId) {
        this.internetId = internetId;
    }

}