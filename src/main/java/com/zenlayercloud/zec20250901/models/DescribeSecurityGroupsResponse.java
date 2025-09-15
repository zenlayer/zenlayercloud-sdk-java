package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询安全组列表的响应结果。
 */
public class DescribeSecurityGroupsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的数据总数
     */
    public Integer totalCount;

    /**
     * 安全组的结果数据
     */
    public List<SecurityGroupInfo> dataSet;

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

    public List<SecurityGroupInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<SecurityGroupInfo> dataSet) {
        this.dataSet = dataSet;
    }

}