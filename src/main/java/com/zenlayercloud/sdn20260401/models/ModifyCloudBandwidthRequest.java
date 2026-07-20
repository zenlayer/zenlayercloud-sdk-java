package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyCloudBandwidthRequest extends TeaModel {


    /**
     * 需要修改的云连接 ID。
     */
    public String cloudPortId;

    /**
     * 需要修改的带宽限速。
     * 单位 Mbps，需匹配可用带宽阶梯。
     */
    public Integer bandwidthMbps;

    public String getCloudPortId() {
        return this.cloudPortId;
    }

    public void setCloudPortId(String cloudPortId) {
        this.cloudPortId = cloudPortId;
    }

    public Integer getBandwidthMbps() {
        return this.bandwidthMbps;
    }

    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }

}