package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 云硬盘从实例解绑的响应信息。
 */
public class DetachDisksResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 解绑失败的云硬盘
     */
    public List<String> failedDiskIds;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getFailedDiskIds() {
        return this.failedDiskIds;
    }

    public void setFailedDiskIds(List<String> failedDiskIds) {
        this.failedDiskIds = failedDiskIds;
    }

}