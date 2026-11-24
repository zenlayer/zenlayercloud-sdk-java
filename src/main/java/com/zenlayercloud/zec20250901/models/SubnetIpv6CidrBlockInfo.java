package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 子网的IPv6网段信息。
 */
public class SubnetIpv6CidrBlockInfo extends TeaModel {


    /**
     * IPv6网段，例如`2001:db8::/64`。
     */
    public String cidrBlock;

    /**
     * IPv6的类型。
     */
    public String ipv6Type;

    /**
     * 是否为子网的主IPv6网段。
     * 新建网卡或实例时，IPv6地址从主网段分配。
     */
    public Boolean isPrimary;

    /**
     * 分配给虚拟机（VM）的IPv6前缀长度。
     */
    public Integer ipv6MaskLength;

    /**
     * IPv6网关地址。
     */
    public String gatewayIpAddress;

    /**
     * 公网IPv6网段的线路类型。
     * 内网IPv6网段为null。
     */
    public String isp;

    /**
     * 网段所属的IP池ID。
     * 仅公网IPv6网段有值。
     */
    public String poolId;

    /**
     * 是否来自系统默认IP池。
     * 内网IPv6网段恒为`false`。
     */
    public Boolean isDefaultPool;

    /**
     * 网段来源的公网IPv6 CIDR ID。
     * 仅当网段从指定的公网IPv6 CIDR切分时有值。
     */
    public String ipv6CidrBlockId;

    /**
     * 网段内已分配的IPv6数量（包括网卡和负载均衡占用的地址）。
     */
    public Integer usedIpv6Count;

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public String getIpv6Type() {
        return this.ipv6Type;
    }

    public void setIpv6Type(String ipv6Type) {
        this.ipv6Type = ipv6Type;
    }

    public Boolean getIsPrimary() {
        return this.isPrimary;
    }

    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public Integer getIpv6MaskLength() {
        return this.ipv6MaskLength;
    }

    public void setIpv6MaskLength(Integer ipv6MaskLength) {
        this.ipv6MaskLength = ipv6MaskLength;
    }

    public String getGatewayIpAddress() {
        return this.gatewayIpAddress;
    }

    public void setGatewayIpAddress(String gatewayIpAddress) {
        this.gatewayIpAddress = gatewayIpAddress;
    }

    public String getIsp() {
        return this.isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getPoolId() {
        return this.poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public Boolean getIsDefaultPool() {
        return this.isDefaultPool;
    }

    public void setIsDefaultPool(Boolean isDefaultPool) {
        this.isDefaultPool = isDefaultPool;
    }

    public String getIpv6CidrBlockId() {
        return this.ipv6CidrBlockId;
    }

    public void setIpv6CidrBlockId(String ipv6CidrBlockId) {
        this.ipv6CidrBlockId = ipv6CidrBlockId;
    }

    public Integer getUsedIpv6Count() {
        return this.usedIpv6Count;
    }

    public void setUsedIpv6Count(Integer usedIpv6Count) {
        this.usedIpv6Count = usedIpv6Count;
    }

}