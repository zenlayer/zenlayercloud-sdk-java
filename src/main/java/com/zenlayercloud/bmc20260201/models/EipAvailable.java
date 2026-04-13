package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * 购买EIP资源区域。
 */
public class EipAvailable extends TeaModel {


    /**
     * EIP所属的可用区ID。
     */
    public String zoneId;

    /**
     * EIP是否售卖。
     * 取值范围：
     * <ul><li>SELL：表示EIP可购买，且库存>10台。</li><li>SELL_SHORTAGE: 表示可购买，但是库存<10台。</li><li>SOLD_OUT：表示EIP已售罄。</li></ul>
     */
    public String status;

    /**
     * IP掩码。
     */
    public Integer netmask;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getNetmask() {
        return this.netmask;
    }

    public void setNetmask(Integer netmask) {
        this.netmask = netmask;
    }

}