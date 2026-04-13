package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class AssociateSecurityGroupInstanceRequest extends TeaModel {


    /**
     * 安全组ID。
     */
    public String securityGroupId;

    /**
     * 实例ID。
     */
    public String instanceId;

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

}