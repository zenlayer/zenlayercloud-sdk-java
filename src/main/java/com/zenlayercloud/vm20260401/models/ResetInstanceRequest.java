package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class ResetInstanceRequest extends TeaModel {


    /**
     * 待操作的虚拟机实例ID。
     */
    public String instanceId;

    /**
     * 实例登录密码。
     */
    public String password;

    /**
     * 密钥ID。
     */
    public String keyId;

    /**
     * 指定有效的镜像ID。
     */
    public String imageId;

    /**
     * 实例显示名称。
     */
    public String instanceName;

    /**
     * 公网网卡名称。
     */
    public String wanName;

    /**
     * 内网网卡名称。
     */
    public String lanName;

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

    public String getKeyId() {
        return this.keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getWanName() {
        return this.wanName;
    }

    public void setWanName(String wanName) {
        this.wanName = wanName;
    }

    public String getLanName() {
        return this.lanName;
    }

    public void setLanName(String lanName) {
        this.lanName = lanName;
    }

}