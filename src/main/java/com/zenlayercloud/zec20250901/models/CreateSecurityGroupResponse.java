package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 创建安全组的响应信息。
 */
public class CreateSecurityGroupResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 创建的安全组ID
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