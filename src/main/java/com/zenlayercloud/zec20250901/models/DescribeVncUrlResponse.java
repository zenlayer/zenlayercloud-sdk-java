package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 获取实例VNC地址的响应结果。
 */
public class DescribeVncUrlResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * VNC地址URL
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