package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 修改网卡属性的请求参数。
 */
public class ModifyNetworkInterfaceAttributeRequest extends TeaModel {


    /**
     * 需要修改的网卡ID
     */
    public String nicId;

    /**
     * 名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-/_和英文句点(.)。
     * 且必须以数字或字母开头和结尾
     */
    public String name;

    /**
     * 修改网卡绑定的目标安全组ID。
     * 目前一张网卡只能关联一个安全组。
     * 指定该字段会解绑网卡原来的安全组
     */
    public String securityGroupId;

    public String getNicId() {
        return this.nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
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