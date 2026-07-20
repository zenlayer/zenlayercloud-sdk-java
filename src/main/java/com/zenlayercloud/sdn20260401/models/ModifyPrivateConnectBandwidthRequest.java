package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyPrivateConnectBandwidthRequest extends TeaModel {


    /**
     * 二层网络专线 ID。
     */
    public String privateConnectId;

    /**
     * 需要修改的带宽限速。
     * 单位：Mbps。
     */
    public Integer bandwidthMbps;

    public String getPrivateConnectId() {
        return this.privateConnectId;
    }

    public void setPrivateConnectId(String privateConnectId) {
        this.privateConnectId = privateConnectId;
    }

    public Integer getBandwidthMbps() {
        return this.bandwidthMbps;
    }

    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }

}