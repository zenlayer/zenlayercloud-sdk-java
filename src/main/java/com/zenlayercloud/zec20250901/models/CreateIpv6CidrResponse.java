package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class CreateIpv6CidrResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 创建的IPv6 CIDR地址段ID列表。
     */
    public List<String> cidrIds;

    /**
     * 本次购买生成的订单号。
     */
    public String orderNumber;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getCidrIds() {
        return this.cidrIds;
    }

    public void setCidrIds(List<String> cidrIds) {
        this.cidrIds = cidrIds;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

}