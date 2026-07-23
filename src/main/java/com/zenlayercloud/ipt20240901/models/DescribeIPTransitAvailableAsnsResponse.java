package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeIPTransitAvailableAsnsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 可用 ASN 列表。
     */
    public List<AsnInfo> dataSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<AsnInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<AsnInfo> dataSet) {
        this.dataSet = dataSet;
    }

}