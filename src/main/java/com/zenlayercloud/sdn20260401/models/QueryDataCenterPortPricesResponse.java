package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class QueryDataCenterPortPricesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 数据中心端口价格列表。
     */
    public List<DatacenterPortPrice> prices;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<DatacenterPortPrice> getPrices() {
        return this.prices;
    }

    public void setPrices(List<DatacenterPortPrice> prices) {
        this.prices = prices;
    }

}