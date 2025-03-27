package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

public class QueryPrivateConnectBandwidthPriceRequest extends TeaModel {

    public String sourceDcId;

    public String destinationDcId;

    public String internetType;

    public Integer bandwidthMbps;
}
