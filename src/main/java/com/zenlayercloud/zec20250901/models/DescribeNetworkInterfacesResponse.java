package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 网卡列表的响应结果。
 */
public class DescribeNetworkInterfacesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的数据总数
     */
    public Integer totalCount;

    /**
     * 网卡的结果集
     */
    public List<NicInfo> dataSet;

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

    public List<NicInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<NicInfo> dataSet) {
        this.dataSet = dataSet;
    }

}