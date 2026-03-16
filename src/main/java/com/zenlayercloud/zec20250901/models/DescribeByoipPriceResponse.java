package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeByoipPriceResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * BYOIP 价格列表。
     */
    public List<PriceItem> byoipPrices;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<PriceItem> getByoipPrices() {
        return this.byoipPrices;
    }

    public void setByoipPrices(List<PriceItem> byoipPrices) {
        this.byoipPrices = byoipPrices;
    }

}