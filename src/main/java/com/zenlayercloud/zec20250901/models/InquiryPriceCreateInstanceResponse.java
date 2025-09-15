package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class InquiryPriceCreateInstanceResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 规格的价格
     */
    public PriceItem specPrice;

    /**
     * GPU规格的价格
     */
    public PriceItem gpuPrice;

    /**
     * 公网IPv4的保留价格
     */
    public PriceItem ipv4Price;

    /**
     * 公网IPv4的带宽价格
     */
    public PriceItem ipv4BandwidthPrice;

    /**
     * IPv6的价格
     */
    public PriceItem ipv6Price;

    /**
     * IPv6的带宽价格
     */
    public PriceItem ipv6BandwidthPrice;

    /**
     * 系统盘的价格
     */
    public PriceItem systemDiskPrice;

    /**
     * 数据盘的价格
     */
    public PriceItem dataDiskPrice;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public PriceItem getSpecPrice() {
        return this.specPrice;
    }

    public void setSpecPrice(PriceItem specPrice) {
        this.specPrice = specPrice;
    }

    public PriceItem getGpuPrice() {
        return this.gpuPrice;
    }

    public void setGpuPrice(PriceItem gpuPrice) {
        this.gpuPrice = gpuPrice;
    }

    public PriceItem getIpv4Price() {
        return this.ipv4Price;
    }

    public void setIpv4Price(PriceItem ipv4Price) {
        this.ipv4Price = ipv4Price;
    }

    public PriceItem getIpv4BandwidthPrice() {
        return this.ipv4BandwidthPrice;
    }

    public void setIpv4BandwidthPrice(PriceItem ipv4BandwidthPrice) {
        this.ipv4BandwidthPrice = ipv4BandwidthPrice;
    }

    public PriceItem getIpv6Price() {
        return this.ipv6Price;
    }

    public void setIpv6Price(PriceItem ipv6Price) {
        this.ipv6Price = ipv6Price;
    }

    public PriceItem getIpv6BandwidthPrice() {
        return this.ipv6BandwidthPrice;
    }

    public void setIpv6BandwidthPrice(PriceItem ipv6BandwidthPrice) {
        this.ipv6BandwidthPrice = ipv6BandwidthPrice;
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

}