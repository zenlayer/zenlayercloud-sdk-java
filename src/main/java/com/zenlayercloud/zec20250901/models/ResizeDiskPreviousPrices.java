package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 扩容前各计费项当前生效的价格。
 */
public class ResizeDiskPreviousPrices extends TeaModel {


    /**
     * 扩容前云硬盘的价格。
     */
    public PriceItem diskPrice;

    /**
     * 扩容前对应实例的规格价格。
     * 仅系统盘扩容且实例类型为VM时返回。
     */
    public PriceItem specPrice;

    /**
     * 扩容前对应实例的GPU价格。
     * 仅系统盘扩容且实例类型为GPU时返回。
     */
    public PriceItem gpuPrice;

    /**
     * 扩容前对应实例的加速卡价格。
     * 仅系统盘扩容且实例类型为加速卡时返回。
     */
    public PriceItem acceleratorPrice;

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

}