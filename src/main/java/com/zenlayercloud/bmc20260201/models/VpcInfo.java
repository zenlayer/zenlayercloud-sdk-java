package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * Vpc Info的信息。
 */
public class VpcInfo extends TeaModel {


    /**
     * VPC唯一ID。
     */
    public String vpcId;

    /**
     * VPC的节点ID。
     */
    public String vpcRegionId;

    /**
     * VPC的节点名称。
     */
    public String vpcRegionName;

    /**
     * VPC的名称。
     */
    public String vpcName;

    /**
     * VPC的CIDR。
     */
    public String cidrBlock;

    /**
     * 创建时间。
     * 格式为：YYYY-MM-ddTHH:mm:ssZ。
     */
    public String createTime;

    /**
     * VPC的状态。
     */
    public String vpcStatus;

    /**
     * 资源组ID。
     */
    public String resourceGroupId;

    /**
     * 资源组名称。
     */
    public String resourceGroupName;

    /**
     * 资源关联的标签信息。
     */
    public Tags tags;

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

    public void setVpcRegionId(String vpcRegionId) {
        this.vpcRegionId = vpcRegionId;
    }

    public String getVpcRegionName() {
        return this.vpcRegionName;
    }

    public void setVpcRegionName(String vpcRegionName) {
        this.vpcRegionName = vpcRegionName;
    }

    public String getVpcName() {
        return this.vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getVpcStatus() {
        return this.vpcStatus;
    }

    public void setVpcStatus(String vpcStatus) {
        this.vpcStatus = vpcStatus;
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