package com.zenlayercloud.ccs20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 导入密钥对的请求参数。
 */
public class ImportKeyPairRequest extends TeaModel {


    /**
     * 密钥对名称。
     * 可由数字，大小写字母和-组成，长度不超过32个字符，不能和账号下其他的密钥对重名。
     * 示例值：my_key, my-key
     */
    public String keyName;

    /**
     * 密钥对描述信息。
     * 不超过255个字符
     */
    public String keyDescription;

    /**
     * 密钥对的公钥内容，OpenSSH 格式。
     * 公钥内容至多传5个公钥，通过分隔。
     * 示例值：ssh-rsa XXXXXXXXXXXX key
     */
    public String publicKey;

    public String getKeyName() {
        return this.keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getKeyDescription() {
        return this.keyDescription;
    }

    public void setKeyDescription(String keyDescription) {
        this.keyDescription = keyDescription;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

}