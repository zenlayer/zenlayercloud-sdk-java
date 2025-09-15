package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 重置虚拟机实例密码的请求参数。
 */
public class ResetInstancePasswordRequest extends TeaModel {


    /**
     * 待操作的实例ID
     */
    public String instanceId;

    /**
     * 密码。
     * 必须是8-16位。
     * 必须包含以下3种格式的字符：大小写字母: [a-zA-Z]数字: 0-9特殊字符: ~!@$^*-_=+
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