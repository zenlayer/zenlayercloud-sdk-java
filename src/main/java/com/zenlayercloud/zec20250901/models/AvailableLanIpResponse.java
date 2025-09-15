package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询可供弹性公网IP绑定的网卡及内网IP信息。
 */
public class AvailableLanIpResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 可以绑定的网卡及内网信息
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