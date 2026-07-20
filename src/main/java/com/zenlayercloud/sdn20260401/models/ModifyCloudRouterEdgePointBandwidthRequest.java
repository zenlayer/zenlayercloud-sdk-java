package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyCloudRouterEdgePointBandwidthRequest extends TeaModel {


    /**
     * 连接点关联的三层网络 ID。
     */
    public String cloudRouterId;

    /**
     * 三层网络连接点的 ID。
     */
    public String edgePointId;

    /**
     * 需要修改的带宽限速。
     * 单位 Mbps，取值范围 1-500。
     */
    public Integer bandwidthMbps;

    public String getCloudRouterId() {
        return this.cloudRouterId;
    }

    public void setCloudRouterId(String cloudRouterId) {
        this.cloudRouterId = cloudRouterId;
    }

    public String getEdgePointId() {
        return this.edgePointId;
    }

    public void setEdgePointId(String edgePointId) {
        this.edgePointId = edgePointId;
    }

    public Integer getBandwidthMbps() {
        return this.bandwidthMbps;
    }

    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }

}