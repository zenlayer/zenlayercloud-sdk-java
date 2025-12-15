package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询内网跨区域带宽列表响应。
 */
public class DescribeCrossRegionBandwidthResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 匹配筛选条件的内网跨区域带宽的总数量
     */
    public Integer totalCount;

    /**
     * 返回分页的内网跨区域带宽的集合数据
     */
    public List<CrossRegionBandwidthInfo> dataSet;

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

    public List<CrossRegionBandwidthInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<CrossRegionBandwidthInfo> dataSet) {
        this.dataSet = dataSet;
    }

}