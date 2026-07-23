package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * BGP 变配参数。
 */
public class BgpConfigParam extends TeaModel {


    /**
     * BGP inbound 路由类型。
     * type=BGP_ROUTE_TYPE 时必填。
     */
    public String routeType;

    /**
     * ASN 列表。
     * type=BGP_ASN_AS_SET 时与 `asSetList` 二选一。
     * `asn` 创建后不支持修改。
     */
    public List<Long> asnList;

    /**
     * AS-SET 列表。
     * type=BGP_ASN_AS_SET 时与 `asnList` 二选一。
     * `asn` 创建后不支持修改。
     */
    public List<String> asSetList;

    /**
     * BGP MD5 密码（长度 8–64）。
     * type=BGP_PASSWORD 时必填。
     */
    public String password;

    public String getRouteType() {
        return this.routeType;
    }

    public void setRouteType(String routeType) {
        this.routeType = routeType;
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

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}