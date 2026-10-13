package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class InquiryPriceResizeDiskResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 扩容后云硬盘的价格。
     */
    public PriceItem diskPrice;

    /**
     * 系统盘扩容时，对应实例的规格价格。
     * 仅当云硬盘为系统盘且实例类型为VM时返回。
     */
    public PriceItem specPrice;

    /**
     * 系统盘扩容时，对应实例的GPU价格。
     * 仅当云硬盘为系统盘且实例类型为GPU时返回。
     */
    public PriceItem gpuPrice;

    /**
     * 系统盘扩容时，对应实例的加速卡价格。
     * 仅当云硬盘为系统盘且实例类型为加速卡时返回。
     */
    public PriceItem acceleratorPrice;

    /**
     * 扩容后云硬盘的性能配置信息。
     */
    public DiskPerfItem diskPerf;

    /**
     * 扩容前各计费项当前生效的价格，字段与上方一一对应，用于对比出哪些计费项发生了调价。
     * 无订单时为null。
     */
    public ResizeDiskPreviousPrices previousPrices;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public PriceItem getDiskPrice() {
        return this.diskPrice;
    }

    public void setDiskPrice(PriceItem diskPrice) {
        this.diskPrice = diskPrice;
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

    public DiskPerfItem getDiskPerf() {
        return this.diskPerf;
    }

    public void setDiskPerf(DiskPerfItem diskPerf) {
        this.diskPerf = diskPerf;
    }

    public ResizeDiskPreviousPrices getPreviousPrices() {
        return this.previousPrices;
    }

    public void setPreviousPrices(ResizeDiskPreviousPrices previousPrices) {
        this.previousPrices = previousPrices;
    }

}