package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeCloudRouterAvailableVpcsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的 VPC 总数量。
     */
    public Integer totalCount;

    /**
     * 可加入三层网络的 VPC 列表。
     */
    public List<CloudRouterAvailableVpc> dataSet;

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

    public List<CloudRouterAvailableVpc> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<CloudRouterAvailableVpc> dataSet) {
        this.dataSet = dataSet;
    }

}