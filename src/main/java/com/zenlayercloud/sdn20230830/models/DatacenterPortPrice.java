package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

public class DatacenterPortPrice extends TeaModel {
    public Price price;

    public Price crossConnectPrice;

    public Price crossConnectOneTimeConstructionPrice;

    public Integer stock;

    public String dcId;
}
