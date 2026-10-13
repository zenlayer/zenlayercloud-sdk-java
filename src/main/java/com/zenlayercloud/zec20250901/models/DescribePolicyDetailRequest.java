package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribePolicyDetailRequest extends TeaModel {


    /**
     * 防护策略ID。
     * 可通过调用 ~~DescribePolicys~~ 获取。
     */
    public String policyId;

    public String getPolicyId() {
        return this.policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

}