package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述Vpc列表的响应结果。
 */
public class DescribeVpcsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 匹配筛选条件的vpc总数量
     */
    public Integer totalCount;

    /**
     * 返回分页的vpc集合数据
     */
    public List<VpcInfo> dataSet;

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

    public List<VpcInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<VpcInfo> dataSet) {
        this.dataSet = dataSet;
    }

}