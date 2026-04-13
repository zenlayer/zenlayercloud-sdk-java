package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class DeleteSecurityGroupRequest extends TeaModel {


    /**
     * 安全组ID。
     */
    public String securityGroupId;

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

}