package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class CreateInstancesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 订单编号。
     */
    public String orderNumber;

    /**
     * 虚拟机实例ID列表。
     * 当通过本接口来创建实例时会返回该参数，表示一个或多个实例ID。
     * 返回实例ID列表并不代表实例创建成功，可根据 DescribeInstances 接口查询返回的dataSet中对应实例的状态来判断创建是否完成：如果实例状态由DEPLOYING(部署中)或PENDING（待创建）变为RUNNING(运行中)，则为创建成功；如果实例找不到或状态变为CREATE_FAILED，表示创建失败。
     */
    public List<String> instanceIdSet;

    /**
     * 随机器创建的数据盘ID集合。
     * 如果请求中没有指定数据盘，返回空数组。
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