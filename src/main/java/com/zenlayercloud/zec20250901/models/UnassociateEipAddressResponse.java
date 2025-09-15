package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 将弹性公网IP（EIP）从绑定的云产品上解绑的响应结果。
 */
public class UnassociateEipAddressResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 操作失败的弹性IP的ID集合
     */
    public List<String> failedEipIds;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getFailedEipIds() {
        return this.failedEipIds;
    }

    public void setFailedEipIds(List<String> failedEipIds) {
        this.failedEipIds = failedEipIds;
    }

}