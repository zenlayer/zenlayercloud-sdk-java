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
     * 变更后规格的价格。VM 实例变配时返回，GPU 实例变配时为 null。
     */
    public PriceItem specPrice;

    /**
     * 变更后 GPU 规格的价格。
     * GPU 实例变配时返回，VM 实例变配时为 null。
     */
    public PriceItem gpuPrice;

    /**
     * 系统盘的价格。
     */
    public PriceItem systemDiskPrice;

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

    public PriceItem getSystemDiskPrice() {
        return this.systemDiskPrice;
    }

    public void setSystemDiskPrice(PriceItem systemDiskPrice) {
        this.systemDiskPrice = systemDiskPrice;
    }

}