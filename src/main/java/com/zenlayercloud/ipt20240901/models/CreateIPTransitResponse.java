package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class CreateIPTransitResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 订单号。
     */
    public String orderNumber;

    /**
     * IP Transit ID。
     */
    public String iptId;

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

    public String getIptId() {
        return this.iptId;
    }

    public void setIptId(String iptId) {
        this.iptId = iptId;
    }

}