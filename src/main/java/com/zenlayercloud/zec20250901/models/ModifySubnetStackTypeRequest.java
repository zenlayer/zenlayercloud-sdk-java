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

    /**
     * 公网IPv6 CIDR ID。
     * 该字段仅当`ipv6Type`是公网(`Public`)时允许指定。
     * 如果不指定，将从系统默认IP池里分配
     */
    public String ipv6CidrBlockId;

    /**
     * 分配给虚拟机（VM）的IPv6 CIDR子网的大小。
     * 该参数仅当`ipv6CidrBlockId`时生效。
     * 当未显式传递时，默认值为96
     */
    public Integer ipv6MaskLength;

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

    public String getIpv6CidrBlockId() {
        return this.ipv6CidrBlockId;
    }

    public void setIpv6CidrBlockId(String ipv6CidrBlockId) {
        this.ipv6CidrBlockId = ipv6CidrBlockId;
    }

    public Integer getIpv6MaskLength() {
        return this.ipv6MaskLength;
    }

    public void setIpv6MaskLength(Integer ipv6MaskLength) {
        this.ipv6MaskLength = ipv6MaskLength;
    }

}