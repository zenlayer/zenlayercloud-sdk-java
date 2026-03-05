package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DeleteEipRequest extends TeaModel {


    /**
     * 要删除弹性公网IP的ID。
     */
    public String eipId;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

}