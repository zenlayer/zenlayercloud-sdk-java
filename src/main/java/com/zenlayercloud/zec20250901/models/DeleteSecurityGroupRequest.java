package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class DeleteSecurityGroupRequest extends TeaModel {


    /**
     * 要删除的安全组ID
     */
    public String securityGroupId;

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

}