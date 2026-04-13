package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * 可用的Ipv4 Cidr Block资源。
 */
public class AvailableIpv4Resource extends TeaModel {


    /**
     * Cidr Block所属的可用区ID。
     */
    public String zoneId;

    /**
     * 掩码。
     */
    public Integer netmask;

    /**
     * 售卖的状态。
     * <ul><li>SELL：表示实例可购买，且库存>10。</li><li>SELL_SHORTAGE: 表示可购买，但是库存<10台。</li><li>SOLD_OUT：表示实例已售罄。</li></ul>
     */
    public String sellStatus;

    /**
     * CIDR地址块的类型。
     */
    public String cidrType;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public Integer getNetmask() {
        return this.netmask;
    }

    public void setNetmask(Integer netmask) {
        this.netmask = netmask;
    }

    public String getSellStatus() {
        return this.sellStatus;
    }

    public void setSellStatus(String sellStatus) {
        this.sellStatus = sellStatus;
    }

    public String getCidrType() {
        return this.cidrType;
    }

    public void setCidrType(String cidrType) {
        this.cidrType = cidrType;
    }

}