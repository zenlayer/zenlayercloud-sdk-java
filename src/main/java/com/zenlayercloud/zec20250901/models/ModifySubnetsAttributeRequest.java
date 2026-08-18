package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class ModifySubnetsAttributeRequest extends TeaModel {


    /**
     * 需要修改的子网ID列表。
     */
    public List<String> subnetIds;

    /**
     * 子网名称。
     * 长度为2到63个字符，必须以数字或字母开头和结尾，仅支持字母、数字、连字符(-)和英文句点(.)。
     */
    public String name;

    public List<String> getSubnetIds() {
        return this.subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}