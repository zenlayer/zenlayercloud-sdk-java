package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述DHCP选项集的信息。
 */
public class DhcpOptionsSet extends TeaModel {


    /**
     * DHCP选项集ID。
     */
    public String dhcpOptionsSetId;

    /**
     * DHCP选项集的名称。
     * 长度为1～64个字符。
     */
    public String dhcpOptionsSetName;

    /**
     * DNS服务器IP。
     * 最多传入4个DNS服务器Ipv4，DNS服务器IP之间用半角逗号（,）隔开。
     */
    public String domainNameServers;

    /**
     * DNS服务器IP。
     * 最多传入4个DNS服务器Ipv6，DNS服务器IP之间用半角逗号（,）隔开。
     */
    public String ipv6DomainNameServers;

    /**
     * IPv4 DHCP选项集的租赁时间。
     * 单位：h。
     */
    public String leaseTime;

    /**
     * IPv6 DHCP选项集的租赁时间。
     * 单位：h。
     */
    public String ipv6LeaseTime;

    /**
     * 创建时间。
     * 按照ISO8601标准表示，使用UTC时间，格式为：YYYY-MM-ddTHH:mm:ssZ。
     */
    public String createTime;

    /**
     * DHCP选项集 描述信息。
     */
    public String description;

    /**
     * 实例所属的资源组ID。
     */
    public String resourceGroupId;

    /**
     * 实例所属的资源组名称。
     */
    public String resourceGroupName;

    /**
     * 实例关联的标签。
     */
    public Tags tags;

    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    public void setDhcpOptionsSetId(String dhcpOptionsSetId) {
        this.dhcpOptionsSetId = dhcpOptionsSetId;
    }

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

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}