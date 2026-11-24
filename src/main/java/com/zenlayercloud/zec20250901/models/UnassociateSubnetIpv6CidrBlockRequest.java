package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class UnassociateSubnetIpv6CidrBlockRequest extends TeaModel {


    /**
     * 子网的ID。
     * 可通过调用 **DescribeSubnets** 获取。
     */
    public String subnetId;

    /**
     * 要释放的IPv6网段，例如`2001:db8::/64`。
     * 网段内不能有已分配的IPv6地址；子网至少需保留1个IPv6网段。
     * 可通过调用 **DescribeSubnets** 获取。
     */
    public String ipv6CidrBlock;

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    public void setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

}