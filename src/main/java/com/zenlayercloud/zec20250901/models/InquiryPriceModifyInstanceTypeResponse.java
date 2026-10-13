package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class InquiryPriceModifyInstanceTypeResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 变更后规格的价格。
     * VM实例变配时返回，GPU/加速卡实例变配时为null。
     */
    public PriceItem specPrice;

    /**
     * 变更后GPU规格的价格。
     * GPU实例变配时返回，VM/加速卡实例变配时为null。
     */
    public PriceItem gpuPrice;

    /**
     * 变更后加速卡规格的价格。
     * 加速卡实例变配时返回，VM/GPU实例变配时为null。
     */
    public PriceItem acceleratorPrice;

    /**
     * 系统盘的价格。
     */
    public PriceItem systemDiskPrice;

    /**
     * 变更前各计费项当前生效的价格，字段与上方一一对应，用于对比出哪些计费项发生了调价。
     * 实例无订单时为null。
     */
    public InstanceTypePreviousPrices previousPrices;

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

    public PriceItem getAcceleratorPrice() {
        return this.acceleratorPrice;
    }

    public void setAcceleratorPrice(PriceItem acceleratorPrice) {
        this.acceleratorPrice = acceleratorPrice;
    }

    public PriceItem getSystemDiskPrice() {
        return this.systemDiskPrice;
    }

    public void setSystemDiskPrice(PriceItem systemDiskPrice) {
        this.systemDiskPrice = systemDiskPrice;
    }

    public InstanceTypePreviousPrices getPreviousPrices() {
        return this.previousPrices;
    }

    public void setPreviousPrices(InstanceTypePreviousPrices previousPrices) {
        this.previousPrices = previousPrices;
    }

}