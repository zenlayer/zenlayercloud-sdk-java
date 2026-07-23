package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeIPTransitAvailableCidrBlocksRequest extends TeaModel {


    /**
     * 目标数据中心 ID。
     * 传入 `ipUuid` 时可不传，将从该 IP 块所在数据中心自动推导。
     */
    public String iptDcId;

    /**
     * 路由类型。
     * 不同路由类型下可用掩码范围不同；不传则返回全量掩码。
     */
    public String routingType;

    /**
     * ZBG 区域 ID。
     * ZBG 场景下必传。
     */
    public String zbgRegionId;

    /**
     * IP 地址 UUID。
     * 传入后接口会自动推导所属数据中心和路由类型，仅返回掩码长度不小于当前 IP 块的可选项。
     */
    public String ipUuid;

    public String getIptDcId() {
        return this.iptDcId;
    }

    public void setIptDcId(String iptDcId) {
        this.iptDcId = iptDcId;
    }

    public String getRoutingType() {
        return this.routingType;
    }

    public void setRoutingType(String routingType) {
        this.routingType = routingType;
    }

    public String getZbgRegionId() {
        return this.zbgRegionId;
    }

    public void setZbgRegionId(String zbgRegionId) {
        this.zbgRegionId = zbgRegionId;
    }

    public String getIpUuid() {
        return this.ipUuid;
    }

    public void setIpUuid(String ipUuid) {
        this.ipUuid = ipUuid;
    }

}