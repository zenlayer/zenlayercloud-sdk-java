package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class UnassociateVpcCidrBlockRequest extends TeaModel {


    /**
     * VPC的ID。
     * 默认VPC不支持移除附属网段。
     * 可通过调用 ~~DescribeVpcs~~ 获取。
     */
    public String vpcId;

    /**
     * 要移除的附属IPv4 CIDR。
     * 必须与该VPC上已有的某个附属网段完全一致。
     * 只能移除附属网段：传入主网段会被拒绝，主网段不支持删除，只能通过 ~~ModifyVpcAttribute~~ 在原网段内放大或缩小。
     * 该附属网段下不能存在子网，否则请求会被拒绝；请先删除该网段下的所有子网。
     * 附属网段不支持修改，如需调整大小，请先移除再重新调用 ~~AssociateVpcCidrBlock~~ 添加。
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