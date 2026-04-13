package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * 可用的Ipv6 Cidr Block资源。
 */
public class AvailableIpv6Resource extends TeaModel {


    /**
     * Cidr Block所属的可用区ID。
     */
    public String zoneId;

    /**
     * 售卖的状态。
     * <ul><li>SELL：表示实例可购买，且库存>10。</li><li>SELL_SHORTAGE: 表示可购买，但是库存<10台。</li><li>SOLD_OUT：表示实例已售罄。</li></ul>
     */
    public String sellStatus;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getSellStatus() {
        return this.sellStatus;
    }

    public void setSellStatus(String sellStatus) {
        this.sellStatus = sellStatus;
    }

}