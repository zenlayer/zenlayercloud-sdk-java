package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 云硬盘的询价响应值。
 */
public class InquiryPriceCreateDisksResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 云硬盘的价格
     */
    public PriceItem dataDiskPrice;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public PriceItem getDataDiskPrice() {
        return this.dataDiskPrice;
    }

    public void setDataDiskPrice(PriceItem dataDiskPrice) {
        this.dataDiskPrice = dataDiskPrice;
    }

}