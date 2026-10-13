package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class AttachToPolicyRequest extends TeaModel {


    /**
     * 防护策略ID。
     * 可通过调用 ~~DescribePolicys~~ 获取。
     */
    public String policyId;

    /**
     * 防护对象列表。
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