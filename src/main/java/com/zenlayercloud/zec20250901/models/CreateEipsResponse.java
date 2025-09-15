package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 创建弹性公网IP的响应结果
 */
public class CreateEipsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 创建的弹性公网IP ID列表
     */
    public List<String> eipIds;

    /**
     * 本次创建的订单编号
     */
    public String orderNumber;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getEipIds() {
        return this.eipIds;
    }

    public void setEipIds(List<String> eipIds) {
        this.eipIds = eipIds;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

}