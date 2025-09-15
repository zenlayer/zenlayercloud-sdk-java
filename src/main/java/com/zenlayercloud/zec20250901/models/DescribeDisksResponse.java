package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述快照列表的响应信息。
 */
public class DescribeDisksResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的数据总数
     */
    public Long totalCount;

    /**
     * 云盘的结果集
     */
    public List<DiskInfo> dataSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public List<DiskInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<DiskInfo> dataSet) {
        this.dataSet = dataSet;
    }

}