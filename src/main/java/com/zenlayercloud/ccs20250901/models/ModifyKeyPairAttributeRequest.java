package com.zenlayercloud.ccs20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 修改一个密钥对的属性的请求参数。
 */
public class ModifyKeyPairAttributeRequest extends TeaModel {


    /**
     * 密钥对ID。
     * 示例值：key-xxxxxxxx
     */
    public String keyId;

    /**
     * 密钥对描述信息。
     * 不超过255个字符
     */
    public String keyDescription;

    public String getKeyId() {
        return this.keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getKeyDescription() {
        return this.keyDescription;
    }

    public void setKeyDescription(String keyDescription) {
        this.keyDescription = keyDescription;
    }

}