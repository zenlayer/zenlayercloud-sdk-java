package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 要添加的IPv6网段。
 */
public class Ipv6CidrBlockItem extends TeaModel {


    /**
     * 公网IPv6 CIDR ID，将从该CIDR中切分网段。
     * 必须与子网在同一节点。
     * 如果不指定，将从系统默认IP池里分配，且每个子网最多只能有1个来自系统默认IP池的网段。
     * 可通过调用 **DescribeIpv6Cidrs** 获取。
     */
    public String ipv6CidrBlockId;

    /**
     * 要添加的网段数量。
     * 默认为1。
     * 指定`ipv6CidrBlockId`时，不能超过该CIDR剩余可切分的网段数；未指定`ipv6CidrBlockId`时只能为1。
     */
    public Integer amount;

    /**
     * 分配给虚拟机（VM）的IPv6前缀长度。
     * 未传时默认为96。
     * 最小必须大于或等于网段的前缀长度（指定`ipv6CidrBlockId`时为该CIDR的子网前缀；从系统默认IP池分配时为64），最大不能超过96。
     */
    public Integer ipv6MaskLength;

    public String getIpv6CidrBlockId() {
        return this.ipv6CidrBlockId;
    }

    public void setIpv6CidrBlockId(String ipv6CidrBlockId) {
        this.ipv6CidrBlockId = ipv6CidrBlockId;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getIpv6MaskLength() {
        return this.ipv6MaskLength;
    }

    public void setIpv6MaskLength(Integer ipv6MaskLength) {
        this.ipv6MaskLength = ipv6MaskLength;
    }

}