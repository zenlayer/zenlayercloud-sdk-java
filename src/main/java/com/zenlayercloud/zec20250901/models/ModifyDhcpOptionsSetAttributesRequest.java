package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyDhcpOptionsSetAttributesRequest extends TeaModel {


    /**
     * DHCP选项集ID。
     * 可通过调用 ~~DescribeDhcpOptionsSets~~ 获取。
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
     * 取值范围：**24~1176**，**87600~175200**。
     */
    public String leaseTime;

    /**
     * IPv6 DHCP选项集的租赁时间。
     * 单位：h。
     * 取值范围：**24~1176**，**87600~175200**。
     */
    public String ipv6LeaseTime;

    /**
     * DHCP选项集 描述信息。
     * 最长不超过255个字符。
     */
    public String description;

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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}