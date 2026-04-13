package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifyVpcsAttributeRequest extends TeaModel {


    /**
     * 一个或多个待操作的VPC ID。
     * 可通过DescribeVpcs接口返回值中的vpcId获取。
     * 每次请求批量VPC的上限为100。
     */
    public List<String> vpcIds;

    /**
     * VPC名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-和英文句点(.)。
     * 且必须以数字或字母开头和结尾。
     */
    public String vpcName;

    public List<String> getVpcIds() {
        return this.vpcIds;
    }

    public void setVpcIds(List<String> vpcIds) {
        this.vpcIds = vpcIds;
    }

    public String getVpcName() {
        return this.vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

}