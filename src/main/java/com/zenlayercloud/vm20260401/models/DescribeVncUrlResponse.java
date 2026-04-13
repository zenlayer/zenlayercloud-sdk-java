package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeVncUrlResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * VNC地址URL。
     */
    public String url;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}