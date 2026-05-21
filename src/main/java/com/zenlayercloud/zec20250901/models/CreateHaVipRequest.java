package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class CreateHaVipRequest extends TeaModel {


    /**
     * HaVip所属子网ID。
     */
    public String subnetId;

    /**
     * HaVip名称。
     * 长度1到64个字符。
     */
    public String name;

    /**
     * 指定HaVip的私网IP地址。
     * 不填时系统自动分配。
     */
    public String ipAddress;

    /**
     * 安全组ID。
     * 不填时使用VPC默认安全组。
     */
    public String securityGroupId;

    /**
     * 创建HaVip时关联的标签。
     */
    public TagAssociation tags;

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

}