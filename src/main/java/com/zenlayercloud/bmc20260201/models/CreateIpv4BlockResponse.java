package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class CreateIpv4BlockResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 订单编号。
     */
    public String orderNumber;

    /**
     * Cidr Block ID列表。
     */
    public List<String> cidrBlockIds;

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

    public List<String> getCidrBlockIds() {
        return this.cidrBlockIds;
    }

    public void setCidrBlockIds(List<String> cidrBlockIds) {
        this.cidrBlockIds = cidrBlockIds;
    }

}