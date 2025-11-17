package com.zenlayercloud.zos20251010.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeCommandInvocationsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 命令执行记录列表
     */
    public List<CommandInvocation> dataSet;

    /**
     * 匹配条件的命令执行记录总数
     */
    public Integer totalCount;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<CommandInvocation> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<CommandInvocation> dataSet) {
        this.dataSet = dataSet;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

}