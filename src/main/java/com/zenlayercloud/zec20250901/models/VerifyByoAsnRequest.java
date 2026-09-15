package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class VerifyByoAsnRequest extends TeaModel {


    /**
     * 待校验的 BYO ASN 的ID。
     */
    public String byoAsnId;

    public String getByoAsnId() {
        return this.byoAsnId;
    }

    public void setByoAsnId(String byoAsnId) {
        this.byoAsnId = byoAsnId;
    }

}