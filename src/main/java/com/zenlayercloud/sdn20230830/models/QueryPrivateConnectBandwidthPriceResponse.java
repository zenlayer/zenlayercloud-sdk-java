package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

public class QueryPrivateConnectBandwidthPriceResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    public Price price;

    public Integer stock;
}
