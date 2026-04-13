package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifyVpcsAttributeRequest extends TeaModel {


    /**
     * VPC名称。
     * 范围1到64个字符。仅支持输入字母、数字、-和英文句点(.)。
     */
    public String vpcName;

    /**
     * 一个或多个待操作的VPC ID。
     * 可通过DescribeVpcs接口返回值中的vpcId获取。
     * 每次请求批量VPC的上限为100。
     */
    public List<String> vpcIds;

    public String getVpcName() {
        return this.vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public List<String> getVpcIds() {
        return this.vpcIds;
    }

    public void setVpcIds(List<String> vpcIds) {
        this.vpcIds = vpcIds;
    }

}