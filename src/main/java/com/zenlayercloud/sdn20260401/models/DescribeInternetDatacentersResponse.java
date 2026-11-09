package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeInternetDatacentersResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 可连接数据中心结果集。
     */
    public List<InternetDatacenter> supportSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<InternetDatacenter> getSupportSet() {
        return this.supportSet;
    }

    public void setSupportSet(List<InternetDatacenter> supportSet) {
        this.supportSet = supportSet;
    }

}