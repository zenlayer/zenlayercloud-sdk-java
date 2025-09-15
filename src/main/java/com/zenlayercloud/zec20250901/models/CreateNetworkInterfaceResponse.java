package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 创建辅助网卡的响应结果。
 */
public class CreateNetworkInterfaceResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 创建的辅助网卡ID
     */
    public String nicId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getNicId() {
        return this.nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

}