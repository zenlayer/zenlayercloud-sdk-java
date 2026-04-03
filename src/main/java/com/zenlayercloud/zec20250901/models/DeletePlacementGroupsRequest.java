package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DeletePlacementGroupsRequest extends TeaModel {


    /**
     * 要删除的置放组ID列表。
     */
    public List<String> placementGroupIds;

    public List<String> getPlacementGroupIds() {
        return this.placementGroupIds;
    }

    public void setPlacementGroupIds(List<String> placementGroupIds) {
        this.placementGroupIds = placementGroupIds;
    }

}