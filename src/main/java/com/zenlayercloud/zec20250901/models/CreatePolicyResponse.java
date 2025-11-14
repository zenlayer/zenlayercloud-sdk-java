package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 创建防护策略的响应结果。
 */
public class CreatePolicyResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 防护策略ID
     */
    public String policyId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getPolicyId() {
        return this.policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

}