package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 删除网卡的请求参数。
 */
public class DeleteNetworkInterfaceRequest extends TeaModel {


    /**
     * 要删除的网卡ID
     */
    public String nicId;

    public String getNicId() {
        return this.nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

}