package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class AllocateEipAddressesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * EIP 的ID列表。
     * 当通过本接口来创建EIP时会返回该参数，表示一个或多个EIP ID。返回EIP ID列表并不代表EIP创建成功，可根据 DescribeEipAddresses 接口查询对应EIP ID的状态来判断创建是否完成；如果EIP状态由CREATING(创建中)变为AVAILABLE，则为创建成功。
     */
    public List<String> eipIdSet;

    /**
     * 订单编号。
     * 当eipChargeType为PREPAID时会返回。
     */
    public String orderNumber;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getEipIdSet() {
        return this.eipIdSet;
    }

    public void setEipIdSet(List<String> eipIdSet) {
        this.eipIdSet = eipIdSet;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

}