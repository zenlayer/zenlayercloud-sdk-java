package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeIPTransitDatacentersResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 结果集。
     */
    public List<IPTransitDatacenter> supportSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<IPTransitDatacenter> getSupportSet() {
        return this.supportSet;
    }

    public void setSupportSet(List<IPTransitDatacenter> supportSet) {
        this.supportSet = supportSet;
    }

}