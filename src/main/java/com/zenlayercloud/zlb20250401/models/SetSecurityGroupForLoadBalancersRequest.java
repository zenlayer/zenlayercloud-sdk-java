package com.zenlayercloud.zlb20250401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class SetSecurityGroupForLoadBalancersRequest extends TeaModel {


    /**
     * 要更换的安全组ID。
     * 可以通过调用 ~~zec:DescribeSecurityGroups~~ 获取。
     */
    public String securityGroupId;

    /**
     * 要更换安全组的负载均衡ID集合。
     * 可通过调用 ~~DescribeLoadBalancers~~ 获取。
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