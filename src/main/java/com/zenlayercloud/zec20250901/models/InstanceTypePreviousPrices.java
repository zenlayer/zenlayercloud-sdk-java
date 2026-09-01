package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 变更前各计费项当前生效的价格。
 */
public class InstanceTypePreviousPrices extends TeaModel {


    /**
     * 变更前规格的价格。
     */
    public PriceItem specPrice;

    /**
     * 变更前 GPU 规格的价格。
     */
    public PriceItem gpuPrice;

    /**
     * 变更前加速卡规格的价格。
     */
    public PriceItem acceleratorPrice;

    /**
     * 变更前系统盘的价格。
     */
    public PriceItem systemDiskPrice;

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

}