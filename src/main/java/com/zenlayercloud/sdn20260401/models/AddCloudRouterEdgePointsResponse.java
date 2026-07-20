package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class AddCloudRouterEdgePointsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 新增的连接点 ID 列表。
     * 顺序与请求中的连接点保持一致。
     */
    public List<String> edgePointIds;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getEdgePointIds() {
        return this.edgePointIds;
    }

    public void setEdgePointIds(List<String> edgePointIds) {
        this.edgePointIds = edgePointIds;
    }

}