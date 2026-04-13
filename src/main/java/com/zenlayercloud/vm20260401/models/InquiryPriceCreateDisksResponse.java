package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class InquiryPriceCreateDisksResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 云硬盘价格。
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