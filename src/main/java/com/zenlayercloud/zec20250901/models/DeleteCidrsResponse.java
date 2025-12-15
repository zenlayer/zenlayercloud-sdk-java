package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 删除CIDR的响应结果。
 */
public class DeleteCidrsResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 操作失败的CIDR ID列表
     */
    public List<String> failedCidrIds;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getFailedCidrIds() {
        return this.failedCidrIds;
    }

    public void setFailedCidrIds(List<String> failedCidrIds) {
        this.failedCidrIds = failedCidrIds;
    }

}