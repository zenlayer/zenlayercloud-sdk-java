package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DeleteSubnetsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 删除失败的子网详情列表。
     * 若全量成功则为空。
     */
    public List<DeleteSubnetsFailedItem> failedSubnets;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<DeleteSubnetsFailedItem> getFailedSubnets() {
        return this.failedSubnets;
    }

    public void setFailedSubnets(List<DeleteSubnetsFailedItem> failedSubnets) {
        this.failedSubnets = failedSubnets;
    }

}