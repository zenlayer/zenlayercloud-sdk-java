package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class AddCloudRouterEdgePointsRequest extends TeaModel {


    /**
     * 三层网络的 ID。
     */
    public String cloudRouterId;

    /**
     * 新增的边缘连接点信息。
     */
    public List<CreateCloudRouterEdgePoint> edgePoints;

    public String getCloudRouterId() {
        return this.cloudRouterId;
    }

    public void setCloudRouterId(String cloudRouterId) {
        this.cloudRouterId = cloudRouterId;
    }

    public List<CreateCloudRouterEdgePoint> getEdgePoints() {
        return this.edgePoints;
    }

    public void setEdgePoints(List<CreateCloudRouterEdgePoint> edgePoints) {
        this.edgePoints = edgePoints;
    }

}