package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class CreateVpcRequest extends TeaModel {


    /**
     * VPC的节点ID。
     */
    public String vpcRegionId;

    /**
     * VPC的CIDR。
     */
    public String cidrBlock;

    /**
     * VPC的名称。
     * 范围1到64个字符。仅支持输入字母、数字、-和英文句点(.)。
     */
    public String vpcName;

    /**
     * VPC所在的资源组ID。
     * 如果不指定，则会放入默认资源组， 如果用户没有默认资源组权限， 则请求将会失败。
     */
    public String resourceGroupId;

    /**
     * 创建VPC时关联的标签。
     * 注意: 关联标签键不能重复。
     */
    public TagAssociation tags;

    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

    public void setVpcRegionId(String vpcRegionId) {
        this.vpcRegionId = vpcRegionId;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public String getVpcName() {
        return this.vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

}