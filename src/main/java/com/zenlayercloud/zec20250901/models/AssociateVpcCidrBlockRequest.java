package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class AssociateVpcCidrBlockRequest extends TeaModel {


    /**
     * VPC的ID。
     * 默认VPC不支持添加附属网段。
     * 可通过调用 ~~DescribeVpcs~~ 获取。
     */
    public String vpcId;

    /**
     * 要添加的附属IPv4 CIDR。
     * 掩码范围为9到29，且必须填写网段的起始地址，例如`10.0.0.0/16`。
     * 不能与该VPC的主网段及已有的附属网段重叠。
     * 不能与以下保留网段重叠：`0.0.0.0/8`、`100.64.0.0/10`、`127.0.0.0/8`、`169.254.0.0/16`、`224.0.0.0/4`。
     * 单个VPC的网段数量上限由配额`ZEC_CIDR_IPv4_Blocks_per_VPC`控制，默认为5个，可申请提升。
     * 该配额统计的是主网段与附属网段的**总数**，因此默认配额下最多可添加4个附属网段。
     */
    public String cidrBlock;

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

}