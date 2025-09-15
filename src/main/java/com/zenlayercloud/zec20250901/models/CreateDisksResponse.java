package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 创建云硬盘的响应信息。
 */
public class CreateDisksResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 创建的云硬盘ID列表
     */
    public List<String> diskIds;

    /**
     * 本次创建对应的订单编号
     */
    public String orderNumber;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getDiskIds() {
        return this.diskIds;
    }

    public void setDiskIds(List<String> diskIds) {
        this.diskIds = diskIds;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

}