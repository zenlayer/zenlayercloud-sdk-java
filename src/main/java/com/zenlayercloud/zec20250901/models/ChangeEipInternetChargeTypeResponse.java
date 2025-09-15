package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 变更弹性公网IP更网络计费模式
 */
public class ChangeEipInternetChargeTypeResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 变更可能产生的订单号
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