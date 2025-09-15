package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 网卡绑定内网IPv4的请求参数。
 */
public class AssignNetworkInterfaceIpv4Request extends TeaModel {


    /**
     * 需要绑定的网卡ID
     */
    public String nicId;

    /**
     * 绑定的内网IP地址。
     * 该地址必须属于子网的CIDR内，且未被使用
     */
    public String ipAddress;

    public String getNicId() {
        return this.nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

}