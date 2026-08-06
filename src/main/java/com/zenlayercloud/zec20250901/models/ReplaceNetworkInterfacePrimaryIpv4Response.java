package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ReplaceNetworkInterfacePrimaryIpv4Response extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 网卡ID。
     */
    public String nicId;

    /**
     * 变更后生效的主内网IPv4地址。
     */
    public String primaryIpAddress;

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

    public String getPrimaryIpAddress() {
        return this.primaryIpAddress;
    }

    public void setPrimaryIpAddress(String primaryIpAddress) {
        this.primaryIpAddress = primaryIpAddress;
    }

}