package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 创建虚拟机实例的响应结果。
 */
public class CreateZecInstancesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 订单编号
     */
    public String orderNumber;

    /**
     * 虚拟机实例ID列表
     */
    public List<String> instanceIdSet;

    /**
     * 随机器创建的数据盘id集合。
     * 如果请求中没有指定数据盘，返回空数组
     */
    public List<DiskWithInstance> instances;

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

    public List<String> getInstanceIdSet() {
        return this.instanceIdSet;
    }

    public void setInstanceIdSet(List<String> instanceIdSet) {
        this.instanceIdSet = instanceIdSet;
    }

    public List<DiskWithInstance> getInstances() {
        return this.instances;
    }

    public void setInstances(List<DiskWithInstance> instances) {
        this.instances = instances;
    }

}