package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class InquiryPriceCreateInstanceResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 规格的价格。
     */
    public PriceItem specPrice;

    /**
     * GPU规格的价格。
     */
    public PriceItem gpuPrice;

    /**
     * 公网IPv4的保留价格。仅当`internetChargeType`有值时返回。
     */
    public PriceItem ipv4Price;

    /**
     * 公网IPv4的带宽价格。仅当`internetChargeType`有值时返回。
     */
    public PriceItem ipv4BandwidthPrice;

    /**
     * 各流量方向的IPv4带宽价格明细。仅当`internetChargeType`有值时返回。PathBasedBandwidthIP 线路返回多项（ipv4BandwidthPrice 为 null）；其他线路返回单项（trafficType=ALL）。
     */
    public List<BandwidthPriceResponseItem> ipv4BandwidthPrices;

    /**
     * 公网IPv6的价格。仅当`internetChargeType`有值时返回。
     */
    public PriceItem ipv6Price;

    /**
     * 公网IPv6的带宽价格。仅当`internetChargeType`有值时返回。
     */
    public PriceItem ipv6BandwidthPrice;

    /**
     * 系统盘的价格。
     */
    public PriceItem systemDiskPrice;

    /**
     * 数据盘的价格。
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

    public List<BandwidthPriceResponseItem> getIpv4BandwidthPrices() {
        return this.ipv4BandwidthPrices;
    }

    public void setIpv4BandwidthPrices(List<BandwidthPriceResponseItem> ipv4BandwidthPrices) {
        this.ipv4BandwidthPrices = ipv4BandwidthPrices;
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