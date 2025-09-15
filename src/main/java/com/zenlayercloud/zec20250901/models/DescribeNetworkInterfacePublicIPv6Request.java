package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class DescribeNetworkInterfacePublicIPv6Request extends TeaModel {


    /**
     * 网卡ID
     */
    public String nicId;

    public String getNicId() {
        return this.nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

}