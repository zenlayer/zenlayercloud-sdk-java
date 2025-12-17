package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述安全组的基本信息。
 */
public class SecurityGroupInfo extends TeaModel {


    /**
     * 安全组ID
     */
    public String securityGroupId;

    /**
     * 安全组名称
     */
    public String securityGroupName;

    /**
     * 范围。
     * 目前只有全球范围(`Global`)
     */
    public String scope;

    /**
     * 创建时间
     */
    public String createTime;

    /**
     * 关联的VPC ID列表
     */
    public List<String> vpcIds;

    /**
     * 是否是默认安全组
     */
    public Boolean isDefault;

    /**
     * 关联安全组的网卡ID列表
     */
    public List<String> nicIdList;

    /**
     * 关联安全组的NAT网关ID列表
     */
    public List<String> natIdList;

    /**
     * 关联安全组的负载均衡ID列表
     */
    public List<String> loadBalancerIdList;

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public void setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
    }

    public String getScope() {
        return this.scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<String> getVpcIds() {
        return this.vpcIds;
    }

    public void setVpcIds(List<String> vpcIds) {
        this.vpcIds = vpcIds;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public List<String> getNicIdList() {
        return this.nicIdList;
    }

    public void setNicIdList(List<String> nicIdList) {
        this.nicIdList = nicIdList;
    }

    public List<String> getNatIdList() {
        return this.natIdList;
    }

    public void setNatIdList(List<String> natIdList) {
        this.natIdList = natIdList;
    }

    public List<String> getLoadBalancerIdList() {
        return this.loadBalancerIdList;
    }

    public void setLoadBalancerIdList(List<String> loadBalancerIdList) {
        this.loadBalancerIdList = loadBalancerIdList;
    }

}