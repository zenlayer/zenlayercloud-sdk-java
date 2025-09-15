package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询边界网关列表的响应结果。
 */
public class DescribeBorderGatewaysResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的数据总数
     */
    public Integer totalCount;

    /**
     * 边界网关的列表数据
     */
    public List<ZbgInfo> dataSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ZbgInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<ZbgInfo> dataSet) {
        this.dataSet = dataSet;
    }

}