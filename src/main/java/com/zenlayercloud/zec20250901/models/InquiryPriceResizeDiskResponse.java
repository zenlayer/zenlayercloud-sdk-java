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
     * 仅当云硬盘为系统盘且实例类型为 VM 时返回。
     */
    public PriceItem specPrice;

    /**
     * 系统盘扩容时，对应实例的 GPU 价格。
     * 仅当云硬盘为系统盘且实例类型为 GPU 时返回。
     */
    public PriceItem gpuPrice;

    /**
     * 扩容后云硬盘的性能配置信息。
     */
    public DiskPerfItem diskPerf;

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

    public DiskPerfItem getDiskPerf() {
        return this.diskPerf;
    }

    public void setDiskPerf(DiskPerfItem diskPerf) {
        this.diskPerf = diskPerf;
    }

}