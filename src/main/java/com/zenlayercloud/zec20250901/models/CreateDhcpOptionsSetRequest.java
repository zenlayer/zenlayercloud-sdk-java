package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class CreateDhcpOptionsSetRequest extends TeaModel {


    /**
     * DHCP 选项集的名称。
     * 长度为1～64个字符
     */
    public String dhcpOptionsSetName;

    /**
     * DNS 服务器 IP。
     * 最多传入 4 个 DNS 服务器 Ipv4，DNS 服务器 IP 之间用半角逗号（,）隔开
     */
    public String domainNameServers;

    /**
     * DNS 服务器 IP。
     * 最多传入 4 个 DNS 服务器 Ipv6，DNS 服务器 IP 之间用半角逗号（,）隔开
     */
    public String ipv6DomainNameServers;

    /**
     * IPv4 DHCP 选项集的租赁时间。
     * 单位：h。
     * 取值范围：**24~1176**，**87600~175200**
     */
    public String leaseTime;

    /**
     * IPv6 DHCP 选项集的租赁时间。
     * 单位：h。
     * 取值范围：**24~1176**，**87600~175200**
     */
    public String ipv6LeaseTime;

    /**
     * 创建DHCP 选项集时关联的标签。
     * 注意：·关联`标签键`不能重复
     */
    public TagAssociation tags;

    /**
     * 资源组ID。
     * 如果不指定，则会创建在默认资源组
     */
    public String resourceGroupId;

    /**
     * DHCP选项集 描述信息。
     * 最长不超过255个字符
     */
    public String description;

    public String getDhcpOptionsSetName() {
        return this.dhcpOptionsSetName;
    }

    public void setDhcpOptionsSetName(String dhcpOptionsSetName) {
        this.dhcpOptionsSetName = dhcpOptionsSetName;
    }

    public String getDomainNameServers() {
        return this.domainNameServers;
    }

    public void setDomainNameServers(String domainNameServers) {
        this.domainNameServers = domainNameServers;
    }

    public String getIpv6DomainNameServers() {
        return this.ipv6DomainNameServers;
    }

    public void setIpv6DomainNameServers(String ipv6DomainNameServers) {
        this.ipv6DomainNameServers = ipv6DomainNameServers;
    }

    public String getLeaseTime() {
        return this.leaseTime;
    }

    public void setLeaseTime(String leaseTime) {
        this.leaseTime = leaseTime;
    }

    public String getIpv6LeaseTime() {
        return this.ipv6LeaseTime;
    }

    public void setIpv6LeaseTime(String ipv6LeaseTime) {
        this.ipv6LeaseTime = ipv6LeaseTime;
    }

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}