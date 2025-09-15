package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 切换子网堆栈类型的请求参数。
 */
public class ModifySubnetStackTypeRequest extends TeaModel {


    /**
     * 要操作的子网的ID
     */
    public String subnetId;

    /**
     * 子网堆栈类型。
     * 目前只支持`IPv4_IPv6`
     */
    public String stackType;

    /**
     * IPv6的类型
     */
    public String ipv6Type;

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getStackType() {
        return this.stackType;
    }

    public void setStackType(String stackType) {
        this.stackType = stackType;
    }

    public String getIpv6Type() {
        return this.ipv6Type;
    }

    public void setIpv6Type(String ipv6Type) {
        this.ipv6Type = ipv6Type;
    }

}