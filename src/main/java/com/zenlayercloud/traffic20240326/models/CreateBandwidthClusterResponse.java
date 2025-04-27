package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class CreateBandwidthClusterResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 订单编号
     */
    public String orderNumber;

    /**
     * 创建的共享带宽包ID
     */
    public String bandwidthClusterId;

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

    public String getBandwidthClusterId() {
        return this.bandwidthClusterId;
    }

    public void setBandwidthClusterId(String bandwidthClusterId) {
        this.bandwidthClusterId = bandwidthClusterId;
    }

}