package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DeleteByoAsnRequest extends TeaModel {


    /**
     * 待删除的 BYO ASN 的ID。
     */
    public String byoAsnId;

    public String getByoAsnId() {
        return this.byoAsnId;
    }

    public void setByoAsnId(String byoAsnId) {
        this.byoAsnId = byoAsnId;
    }

}