package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifySubnetsAttributeRequest extends TeaModel {


    /**
     * 一个或多个待操作的Subnet ID。
     * 可通过DescribeSubnets接口返回值中的SubnetId获取。
     * 每次请求批量Subnet的上限为100。
     */
    public List<String> subnetIds;

    /**
     * Subnet名称。
     * 范围1到64个字符。
     * 仅支持输入字母、数字、-和英文句点(.)。
     */
    public String subnetName;

    public List<String> getSubnetIds() {
        return this.subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public String getSubnetName() {
        return this.subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

}