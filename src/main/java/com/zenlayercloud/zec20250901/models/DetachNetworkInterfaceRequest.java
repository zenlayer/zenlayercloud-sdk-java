package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 解绑网卡的请求参数。
 */
public class DetachNetworkInterfaceRequest extends TeaModel {


    /**
     * 需要操作的网卡ID
     */
    public String nicId;

    public String getNicId() {
        return this.nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

}