package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class InquiryPriceCreateInstanceResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 实例价格。
     */
    public PriceItem instancePrice;

    /**
     * 公网带宽价格。
     */
    public List<PriceItem> bandwidthPrice;

    /**
     * 弹性IP价格。
     */
    public PriceItem eipPrice;

    /**
     * 系统盘价格。
     */
    public PriceItem systemDiskPrice;

    /**
     * 数据盘价格。
     */
    public PriceItem dataDiskPrice;

    /**
     * 每种规格数据盘的价格。
     */
    public List<DataDisk> dataDiskPrices;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public PriceItem getInstancePrice() {
        return this.instancePrice;
    }

    public void setInstancePrice(PriceItem instancePrice) {
        this.instancePrice = instancePrice;
    }

    public List<PriceItem> getBandwidthPrice() {
        return this.bandwidthPrice;
    }

    public void setBandwidthPrice(List<PriceItem> bandwidthPrice) {
        this.bandwidthPrice = bandwidthPrice;
    }

    public PriceItem getEipPrice() {
        return this.eipPrice;
    }

    public void setEipPrice(PriceItem eipPrice) {
        this.eipPrice = eipPrice;
    }

    public PriceItem getSystemDiskPrice() {
        return this.systemDiskPrice;
    }

    public void setSystemDiskPrice(PriceItem systemDiskPrice) {
        this.systemDiskPrice = systemDiskPrice;
    }

    public PriceItem getDataDiskPrice() {
        return this.dataDiskPrice;
    }

    public void setDataDiskPrice(PriceItem dataDiskPrice) {
        this.dataDiskPrice = dataDiskPrice;
    }

    public List<DataDisk> getDataDiskPrices() {
        return this.dataDiskPrices;
    }

    public void setDataDiskPrices(List<DataDisk> dataDiskPrices) {
        this.dataDiskPrices = dataDiskPrices;
    }

}