package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyHaVipAttributeRequest extends TeaModel {


    /**
     * 高可用虚拟IP的ID。
     */
    public String haVipId;

    /**
     * HaVip名称。长度1到64个字符。name 与 securityGroupId 至少提供一个。
     */
    public String name;

    /**
     * 安全组ID。若设置，则将HaVip绑定的安全组修改为指定安全组。name 与 securityGroupId 至少提供一个。
     */
    public String securityGroupId;

    public String getHaVipId() {
        return this.haVipId;
    }

    public void setHaVipId(String haVipId) {
        this.haVipId = haVipId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

}