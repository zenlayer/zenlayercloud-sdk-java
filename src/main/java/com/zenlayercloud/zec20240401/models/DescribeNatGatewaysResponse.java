package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeNatGatewaysResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 满足过滤条件的NAT网关总数
     */
    public Integer totalCount;

    /**
     * 返回的NAT网关列表
     */
    public List<NatGateway> dataSet;

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

    public List<NatGateway> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<NatGateway> dataSet) {
        this.dataSet = dataSet;
    }

}