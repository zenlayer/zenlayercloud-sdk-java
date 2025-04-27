package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

public class QueryPrivateConnectPriceRequest extends TeaModel {
    public String internetType;

    public Integer bandwidthMbps;

    public PrivateConnectEndpointInfo endpointA;

    public PrivateConnectEndpointInfo endpointZ;
}
