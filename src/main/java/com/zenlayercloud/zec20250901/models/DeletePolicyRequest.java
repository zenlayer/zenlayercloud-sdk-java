package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 删除防护策略的请求信息。
 */
public class DeletePolicyRequest extends TeaModel {


    /**
     * 防护策略ID
     */
    public String policyId;

    public String getPolicyId() {
        return this.policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

}