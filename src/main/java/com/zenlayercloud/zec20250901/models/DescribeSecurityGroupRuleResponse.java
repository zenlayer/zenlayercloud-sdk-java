package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询安全组规则的响应结果
 */
public class DescribeSecurityGroupRuleResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 入方向规则列表
     */
    public List<SecurityGroupRuleInfo> ingressRuleList;

    /**
     * 出方向规则列表
     */
    public List<SecurityGroupRuleInfo> egressRuleList;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<SecurityGroupRuleInfo> getIngressRuleList() {
        return this.ingressRuleList;
    }

    public void setIngressRuleList(List<SecurityGroupRuleInfo> ingressRuleList) {
        this.ingressRuleList = ingressRuleList;
    }

    public List<SecurityGroupRuleInfo> getEgressRuleList() {
        return this.egressRuleList;
    }

    public void setEgressRuleList(List<SecurityGroupRuleInfo> egressRuleList) {
        this.egressRuleList = egressRuleList;
    }

}