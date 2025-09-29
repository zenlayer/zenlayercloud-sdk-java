package com.zenlayercloud.ccs20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述了密钥对的基本信息的响应信息。
 */
public class DescribeKeyPairsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 符合条件的数据总数
     */
    public Integer totalCount;

    /**
     * 密钥对结果集
     */
    public List<KeyPair> dataSet;

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

    public List<KeyPair> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<KeyPair> dataSet) {
        this.dataSet = dataSet;
    }

}