package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class RestoreLoadBalancerResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 订单号。
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