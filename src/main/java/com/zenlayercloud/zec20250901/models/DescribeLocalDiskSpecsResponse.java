package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeLocalDiskSpecsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 可用区可售的本地盘规格列表。
     * 返回空列表表示该可用区不售卖本地盘。
     */
    public List<LocalDiskSpec> localDiskSpecs;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<LocalDiskSpec> getLocalDiskSpecs() {
        return this.localDiskSpecs;
    }

    public void setLocalDiskSpecs(List<LocalDiskSpec> localDiskSpecs) {
        this.localDiskSpecs = localDiskSpecs;
    }

}