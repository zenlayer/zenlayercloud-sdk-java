package com.zenlayercloud.zos20251010.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeCommandsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 命令列表
     */
    public List<Command> dataSet;

    /**
     * 匹配条件的命令总数
     */
    public Integer totalCount;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<Command> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<Command> dataSet) {
        this.dataSet = dataSet;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

}