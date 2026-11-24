package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class AssociateSubnetIpv6CidrBlocksRequest extends TeaModel {


    /**
     * 子网的ID。
     * 仅支持IPv6类型为公网(`Public`)的子网。
     * 可通过调用 **DescribeSubnets** 获取。
     */
    public String subnetId;

    /**
     * 要添加的IPv6网段列表。
     * 单个子网的IPv6网段数量上限由配额`ZEC_CIDR_IPv6_Blocks_per_subnet`控制，默认为10个，可申请提升；该配额统计的是子网已有网段与本次添加网段的**总数**。
     */
    public List<Ipv6CidrBlockItem> ipv6CidrBlocks;

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public List<Ipv6CidrBlockItem> getIpv6CidrBlocks() {
        return this.ipv6CidrBlocks;
    }

    public void setIpv6CidrBlocks(List<Ipv6CidrBlockItem> ipv6CidrBlocks) {
        this.ipv6CidrBlocks = ipv6CidrBlocks;
    }

}