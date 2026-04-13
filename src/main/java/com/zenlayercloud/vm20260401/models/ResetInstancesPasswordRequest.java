package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ResetInstancesPasswordRequest extends TeaModel {


    /**
     * 虚拟机实例ID集合。
     */
    public List<String> instanceIds;

    /**
     * 实例登录密码。
     */
    public String password;

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}