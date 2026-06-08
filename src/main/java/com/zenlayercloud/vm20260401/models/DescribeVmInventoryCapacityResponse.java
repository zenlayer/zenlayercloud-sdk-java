package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeVmInventoryCapacityResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 可用区库存集合。
     */
    public List<VmInventoryCapacityInfo> dataSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<VmInventoryCapacityInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<VmInventoryCapacityInfo> dataSet) {
        this.dataSet = dataSet;
    }

}