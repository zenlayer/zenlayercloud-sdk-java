package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class ModifyEipsBlockThresholdResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 修改失败的EIP详情列表。
     * 若全部成功则为空。
     */
    public List<ModifyEipsBlockThresholdFailedItem> failedEips;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<ModifyEipsBlockThresholdFailedItem> getFailedEips() {
        return this.failedEips;
    }

    public void setFailedEips(List<ModifyEipsBlockThresholdFailedItem> failedEips) {
        this.failedEips = failedEips;
    }

}