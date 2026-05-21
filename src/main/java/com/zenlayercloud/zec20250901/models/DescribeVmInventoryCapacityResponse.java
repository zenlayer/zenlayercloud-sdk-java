package com.zenlayercloud.zec20250901.models;

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
     * 库存容量档位说明，描述各档位对应的可售核数范围。
     */
    public String remark;

    /**
     * 各节点库存容量列表。
     */
    public List<VmRegionCapacityItem> dataSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<VmRegionCapacityItem> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<VmRegionCapacityItem> dataSet) {
        this.dataSet = dataSet;
    }

}