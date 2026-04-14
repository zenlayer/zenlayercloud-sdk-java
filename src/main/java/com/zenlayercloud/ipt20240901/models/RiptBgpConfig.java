package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * BGP相关配置。
 */
public class RiptBgpConfig extends TeaModel {


    /**
     * 入站路由类型。
     */
    public String routeType;

    /**
     * 宣告出站路由的ASN号。
     */
    public Long asn;

    /**
     * 加密认证秘钥。
     */
    public String password;

    /**
     * 宣告出站路由的ASN号列表。
     */
    public List<Long> asnList;

    /**
     * 宣告出站路由的AS-SET列表。
     */
    public List<String> asSetList;

    public String getRouteType() {
        return this.routeType;
    }

    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    public Long getAsn() {
        return this.asn;
    }

    public void setAsn(Long asn) {
        this.asn = asn;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Long> getAsnList() {
        return this.asnList;
    }

    public void setAsnList(List<Long> asnList) {
        this.asnList = asnList;
    }

    public List<String> getAsSetList() {
        return this.asSetList;
    }

    public void setAsSetList(List<String> asSetList) {
        this.asSetList = asSetList;
    }

}