package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeInternetAvailableAsnsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 可用 ASN 列表。
     */
    public List<InternetAsnInfo> dataSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<InternetAsnInfo> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<InternetAsnInfo> dataSet) {
        this.dataSet = dataSet;
    }

}