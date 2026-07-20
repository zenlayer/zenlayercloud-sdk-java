package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 可加入三层网络的 VPC 信息。
 */
public class CloudRouterAvailableVpc extends TeaModel {


    /**
     * VPC 的 ID。
     */
    public String vpcId;

    /**
     * VPC 的名称。
     */
    public String vpcName;

    /**
     * VPC 所在的数据中心信息。
     */
    public DatacenterInfo dataCenter;

    /**
     * VPC 的 CIDR 网段。
     */
    public String cidrBlock;

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getVpcName() {
        return this.vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public DatacenterInfo getDataCenter() {
        return this.dataCenter;
    }

    public void setDataCenter(DatacenterInfo dataCenter) {
        this.dataCenter = dataCenter;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

}