package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class CreateSubnetsRequest extends TeaModel {


    /**
     * 需要添加子网的VPC ID。
     * 批量创建的子网均属于同一个VPC。
     */
    public String vpcId;

    /**
     * 待创建的子网列表。
     * 单次请求最多支持创建10个子网。
     * 该批次内的子网要么全部创建成功，要么全部不创建。
     */
    public List<SubnetCreateItem> subnets;

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public List<SubnetCreateItem> getSubnets() {
        return this.subnets;
    }

    public void setSubnets(List<SubnetCreateItem> subnets) {
        this.subnets = subnets;
    }

}