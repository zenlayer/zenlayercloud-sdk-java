package com.zenlayercloud.ccs20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 导入密钥对的响应信息。
 */
public class ImportKeyPairResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 密钥对ID
     */
    public String keyId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

}