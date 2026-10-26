package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 线路的BYOIP支持状态。
 */
public class ByoipLineAvailability extends TeaModel {


    /**
     * 网络线路类型。
     */
    public String network;

    /**
     * 支持状态。
     */
    public String status;

    public String getNetwork() {
        return this.network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}