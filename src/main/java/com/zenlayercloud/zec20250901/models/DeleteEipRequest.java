package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 删除弹性公网IP的请求参数。
 */
public class DeleteEipRequest extends TeaModel {


    /**
     * 要删除弹性公网IP的ID
     */
    public String eipId;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

}