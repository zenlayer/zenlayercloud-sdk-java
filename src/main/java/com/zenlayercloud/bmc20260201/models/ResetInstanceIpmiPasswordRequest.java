package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class ResetInstanceIpmiPasswordRequest extends TeaModel {


    /**
     * 实例ID。
     */
    public String instanceId;

    /**
     * IPMI控制台密码。
     * 必须以字母开头，长度为8-16个字符，可包含字母、数字以及特殊字符!@#+_,.。
     * 登录IPMI控制台的用户名固定为operator。
     */
    public String password;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}