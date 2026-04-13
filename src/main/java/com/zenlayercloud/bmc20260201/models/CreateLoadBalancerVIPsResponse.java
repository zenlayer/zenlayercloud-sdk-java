package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class CreateLoadBalancerVIPsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 订单号。若LB是VIP6类型则返回空
     */
    public String orderNumber;

    /**
     * IP ID集合。
     */
    public List<String> vipIdSet;

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

    public List<String> getVipIdSet() {
        return this.vipIdSet;
    }

    public void setVipIdSet(List<String> vipIdSet) {
        this.vipIdSet = vipIdSet;
    }

}