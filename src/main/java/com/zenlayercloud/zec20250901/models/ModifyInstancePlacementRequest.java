package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyInstancePlacementRequest extends TeaModel {


    /**
     * 实例ID。
     */
    public String instanceId;

    /**
     * 置放组ID。
     * 为空表示从当前置放组移除。
     */
    public String placementGroupId;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getPlacementGroupId() {
        return this.placementGroupId;
    }

    public void setPlacementGroupId(String placementGroupId) {
        this.placementGroupId = placementGroupId;
    }

}