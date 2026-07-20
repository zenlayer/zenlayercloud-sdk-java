package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class CreatePortResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 创建数据中心端口产生的订单号。
     */
    public String orderNumber;

    /**
     * 创建成功的数据中心端口 ID。
     */
    public String portId;

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

    public String getPortId() {
        return this.portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

}