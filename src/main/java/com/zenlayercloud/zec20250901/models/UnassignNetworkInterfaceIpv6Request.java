package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class UnassignNetworkInterfaceIpv6Request extends TeaModel {


    /**
     * 要删除IPv6的网卡ID。
     * 可通过调用 ~~DescribeNetworkInterfaces~~ 获取。
     */
    public String nicId;

    public String getNicId() {
        return this.nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

}