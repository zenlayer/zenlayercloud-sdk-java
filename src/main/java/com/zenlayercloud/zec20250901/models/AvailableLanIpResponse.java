package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class AvailableLanIpResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 可与指定EIP绑定的vNIC与内网IP组合列表。
     */
    public List<PrivateIpInfo> lanIps;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<PrivateIpInfo> getLanIps() {
        return this.lanIps;
    }

    public void setLanIps(List<PrivateIpInfo> lanIps) {
        this.lanIps = lanIps;
    }

}