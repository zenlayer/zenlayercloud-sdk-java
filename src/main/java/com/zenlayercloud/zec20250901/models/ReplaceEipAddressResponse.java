package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 替换弹性公网IP的响应结果。
 */
public class ReplaceEipAddressResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 替换失败的IP的ID集合
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