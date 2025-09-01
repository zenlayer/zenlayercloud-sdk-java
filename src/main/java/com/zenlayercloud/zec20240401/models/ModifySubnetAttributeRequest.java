package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述修改子网属性的请求参数。
 */
public class ModifySubnetAttributeRequest extends TeaModel {


    /**
     * 子网的ID
     */
    public String subnetId;

    /**
     * 子网的名称。
     * 仅支持输入字母、数字、-和英文句点(.)。
     * 且必须以数字或字母开头和结尾
     */
    public String subnetName;

    /**
     * 需要修改的IPv4 CIDR Block。
     * 仅支持有IPv4堆栈类型的子网
     */
    public String cidrBlock;

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getSubnetName() {
        return this.subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

}