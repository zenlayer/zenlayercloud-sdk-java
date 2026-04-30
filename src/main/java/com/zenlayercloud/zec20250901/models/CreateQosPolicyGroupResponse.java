package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class CreateQosPolicyGroupResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 新建QoS策略组ID。
     */
    public String qosPolicyGroupId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getQosPolicyGroupId() {
        return this.qosPolicyGroupId;
    }

    public void setQosPolicyGroupId(String qosPolicyGroupId) {
        this.qosPolicyGroupId = qosPolicyGroupId;
    }

}