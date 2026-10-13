package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class DescribeInstanceIpmiUrlResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * IPMI控制台访问地址。
     * 登录用户名固定为operator，密码为通过 ~~ResetInstanceIpmiPassword~~ 设置的密码。
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