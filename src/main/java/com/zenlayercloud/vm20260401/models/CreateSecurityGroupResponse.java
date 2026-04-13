package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class CreateSecurityGroupResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 安全组ID。
     */
    public String securityGroupId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

}