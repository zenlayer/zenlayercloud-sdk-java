package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class CreateIpv6BlockRequest extends TeaModel {


    /**
     * Cidr Block所属的可用区 ID。
     */
    public String zoneId;

    /**
     * Cidr Block的名称。
     * 不得超过64个字符。
     */
    public String name;

    /**
     * 购买的数量。
     */
    public Integer amount;

    /**
     * Cidr Block所属的资源组ID。
     * 如果指定的区域内存在可用的VLAN，则会忽略该参数自动使用与VLAN相同的资源组。
     */
    public String resourceGroupId;

    /**
     * 创建Cidr时关联的标签。
     * 注意: 关联标签键不能重复。
     */
    public TagAssociation tags;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
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