package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DeleteCloudRouterEdgePointRequest extends TeaModel {


    /**
     * 连接点所在的三层网络 ID。
     */
    public String cloudRouterId;

    /**
     * 要移除的连接点 ID。
     */
    public String edgePointId;

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

}