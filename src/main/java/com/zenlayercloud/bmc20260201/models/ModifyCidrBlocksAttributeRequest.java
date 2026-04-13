package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifyCidrBlocksAttributeRequest extends TeaModel {


    /**
     * Cidr Block的名称。
     * 不得超过64个字符。
     */
    public String name;

    /**
     * 一个或多个待操作的Cidr Block ID。
     * 可通过DescribeCidrBlocks接口返回值中的cidrBlockId获取。
     * 每次请求批量实例的上限为100。
     */
    public List<String> cidrBlockIds;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCidrBlockIds() {
        return this.cidrBlockIds;
    }

    public void setCidrBlockIds(List<String> cidrBlockIds) {
        this.cidrBlockIds = cidrBlockIds;
    }

}