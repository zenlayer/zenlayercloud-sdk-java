package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 防护策略详情的请求参数
 */
public class DescribePolicyDetailRequest extends TeaModel {


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