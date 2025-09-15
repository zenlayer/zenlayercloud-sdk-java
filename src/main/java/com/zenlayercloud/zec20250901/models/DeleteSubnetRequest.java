package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 删除子网的请求参数。
 */
public class DeleteSubnetRequest extends TeaModel {


    /**
     * 要删除的子网ID
     */
    public String subnetId;

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

}