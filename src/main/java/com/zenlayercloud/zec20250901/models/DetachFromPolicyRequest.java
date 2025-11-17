package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 防护对象取消关联防护策略的请求参数
 */
public class DetachFromPolicyRequest extends TeaModel {


    /**
     * 防护策略ID
     */
    public String policyId;

    /**
     * 防护对象列表
     */
    public List<String> ipv4IdList;

    public String getPolicyId() {
        return this.policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public List<String> getIpv4IdList() {
        return this.ipv4IdList;
    }

    public void setIpv4IdList(List<String> ipv4IdList) {
        this.ipv4IdList = ipv4IdList;
    }

}