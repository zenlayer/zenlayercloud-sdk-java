package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class VerifyByoAsnRequest extends TeaModel {


    /**
     * 待校验的BYO ASN的ID。
     * 可通过调用 ~~DescribeByoAsns~~ 获取。
     */
    public String byoAsnId;

    public String getByoAsnId() {
        return this.byoAsnId;
    }

    public void setByoAsnId(String byoAsnId) {
        this.byoAsnId = byoAsnId;
    }

}