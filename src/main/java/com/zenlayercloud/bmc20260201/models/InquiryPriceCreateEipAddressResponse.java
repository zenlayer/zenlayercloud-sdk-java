package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class InquiryPriceCreateEipAddressResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * EIP价格。
     */
    public PriceItem eipPrice;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public PriceItem getEipPrice() {
        return this.eipPrice;
    }

    public void setEipPrice(PriceItem eipPrice) {
        this.eipPrice = eipPrice;
    }

}