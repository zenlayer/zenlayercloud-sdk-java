package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DeletePlacementGroupsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 删除失败的置放组ID列表。
     * 若全量成功则为空。
     */
    public List<String> failedPlacementGroupIds;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getFailedPlacementGroupIds() {
        return this.failedPlacementGroupIds;
    }

    public void setFailedPlacementGroupIds(List<String> failedPlacementGroupIds) {
        this.failedPlacementGroupIds = failedPlacementGroupIds;
    }

}