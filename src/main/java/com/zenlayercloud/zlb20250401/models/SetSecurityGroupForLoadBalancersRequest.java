package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class SetSecurityGroupForLoadBalancersRequest extends TeaModel {


    /**
     * 要更换的安全组Id。
     * 可以通过[DescribeSecurityGroups](../../zec/security-group/describesecuritygroups.md)接口获取
     */
    public String securityGroupId;

    /**
     * 要更换安全组的负载均衡ID集合
     */
    public List<String> loadBalancerIds;

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public List<String> getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    public void setLoadBalancerIds(List<String> loadBalancerIds) {
        this.loadBalancerIds = loadBalancerIds;
    }

}