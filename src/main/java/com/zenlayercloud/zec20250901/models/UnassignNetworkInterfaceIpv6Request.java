package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class UnassignNetworkInterfaceIpv6Request extends TeaModel {


    /**
     * 要删除IPv6的网卡ID。
     */
    public String nicId;

    public String getNicId() {
        return this.nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

}