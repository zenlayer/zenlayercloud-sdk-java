package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述路由列表的响应信息。
 */
public class DescribeRoutesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的数据总数
     */
    public Integer totalCount;

    /**
     * 路由列表数据
     */
    public List<RouteInfo> dataSet;

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

    public List<RouteInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<RouteInfo> dataSet) {
        this.dataSet = dataSet;
    }

}