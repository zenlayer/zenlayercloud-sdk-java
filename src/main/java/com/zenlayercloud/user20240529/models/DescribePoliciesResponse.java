package com.zenlayercloud.user20240529.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribePoliciesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 访问策略列表的数据。
     */
    public List<Policy> policies;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<Policy> getPolicies() {
        return this.policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

}