package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class CreatePlacementGroupResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 创建成功的置放组ID。
     */
    public String placementGroupId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getPlacementGroupId() {
        return this.placementGroupId;
    }

    public void setPlacementGroupId(String placementGroupId) {
        this.placementGroupId = placementGroupId;
    }

}