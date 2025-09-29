package com.zenlayercloud.ccs20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述了密钥对的基本信息。
 */
public class KeyPair extends TeaModel {


    /**
     * 密钥对ID。
     * 示例值：key-xxxxxxxx
     */
    public String keyId;

    /**
     * 密钥对名称
     */
    public String keyName;

    /**
     * 密钥对的公钥内容。
     * OpenSSH 格式。
     * 示例值：ssh-rsa XXXXXXXXXXXX key_xxx
     */
    public String publicKey;

    /**
     * 密钥对描述信息
     */
    public String keyDescription;

    /**
     * 创建时间。
     * 格式为：YYYY-MM-ddTHH:mm:ssZ
     */
    public String createTime;

    public String getKeyId() {
        return this.keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getKeyName() {
        return this.keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getKeyDescription() {
        return this.keyDescription;
    }

    public void setKeyDescription(String keyDescription) {
        this.keyDescription = keyDescription;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}