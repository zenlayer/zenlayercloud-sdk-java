package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class DescribeAvailableResourcesRequest extends TeaModel {


    /**
     * 实例计费类型。
     * PREPAID：预付费，即包年包月。 POSTPAID：后付费。
     */
    public String instanceChargeType;

    /**
     * 实例机型ID。
     */
    public String instanceTypeId;

    /**
     * 可用区ID。
     */
    public String zoneId;

    /**
     * 售卖的状态。
     * <ul><li>SELL：表示实例可购买，且库存>10。</li><li>SELL_SHORTAGE: 表示可购买，但是库存<10台。</li><li>SOLD_OUT：表示实例已售罄。</li></ul>
     */
    public String sellStatus;

    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public void setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
    }

    public String getInstanceTypeId() {
        return this.instanceTypeId;
    }

    public void setInstanceTypeId(String instanceTypeId) {
        this.instanceTypeId = instanceTypeId;
    }

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