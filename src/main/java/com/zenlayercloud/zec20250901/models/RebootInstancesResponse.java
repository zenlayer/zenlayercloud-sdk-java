package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 重启虚拟机实例的响应结果
 */
public class RebootInstancesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 重启操作失败的实例ID列表
     */
    public List<String> instanceIds;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

}