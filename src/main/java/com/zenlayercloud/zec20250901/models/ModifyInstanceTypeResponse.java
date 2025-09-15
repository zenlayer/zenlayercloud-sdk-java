package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 变更实例规格的响应结果。
 */
public class ModifyInstanceTypeResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 变更产生订单的编号
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