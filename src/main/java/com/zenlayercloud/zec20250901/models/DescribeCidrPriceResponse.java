package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 查询CIDR价格的响应信息。
 */
public class DescribeCidrPriceResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * CIDR的价格信息
     */
    public PriceItem cidrPrice;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public PriceItem getCidrPrice() {
        return this.cidrPrice;
    }

    public void setCidrPrice(PriceItem cidrPrice) {
        this.cidrPrice = cidrPrice;
    }

}