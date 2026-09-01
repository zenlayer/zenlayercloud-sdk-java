package com.zenlayercloud.zsp20260801.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeTicketsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的数据总数。
     */
    public Integer totalCount;

    /**
     * 工单结果集。
     */
    public List<TicketItem> dataSet;

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

    public List<TicketItem> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<TicketItem> dataSet) {
        this.dataSet = dataSet;
    }

}