package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 重装一台虚拟机实例操作系统的请求参数。
 */
public class ResetInstanceRequest extends TeaModel {


    /**
     * 要重装的实例ID
     */
    public String instanceId;

    /**
     * 实例的新密码。
     * 与keyId必须指定其中的一种（Windows和Generic类型的镜像无法指定密码和key）。
     * 必须包含以下3种格式的字符：大小写字母: [a-zA-Z]数字: 0-9特殊字符: ~!@$^*-_=+
     */
    public String password;

    /**
     * 密钥ID。
     * 与password必须指定其中的一种（Windows和Generic类型的镜像无法指定密码和key）。
     * 可调用接口DescribeKeyPairs来获得最新的密钥对信息。
     * 关联密钥后，就可以通过对应的私钥来访问实例；密钥与密码不能同时指定，同时Windows操作系统不支持指定密钥。
     * 示例值：key-YWD2QFOl
     */
    public String keyId;

    /**
     * 指定重装的的镜像ID。
     * 可以通过[DescribeImages](describeimages.md)取返回信息中的`imageId`字段。
     * 如果不指定，会根据当前镜像进行重装
     */
    public String imageId;

    /**
     * 操作系统时区设置
     */
    public String timezone;

    /**
     * 是否启用 QEMU Guest 代理 (QGA)
     */
    public Boolean enableAgent;

    /**
     * 修改的实例名称
     */
    public String instanceName;

    /**
     * 初始化命令
     */
    public String userData;

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

    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Boolean getEnableAgent() {
        return this.enableAgent;
    }

    public void setEnableAgent(Boolean enableAgent) {
        this.enableAgent = enableAgent;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getUserData() {
        return this.userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

}