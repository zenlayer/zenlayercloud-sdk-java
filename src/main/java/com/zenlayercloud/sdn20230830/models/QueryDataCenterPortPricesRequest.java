package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class QueryDataCenterPortPricesRequest extends TeaModel {
    public List<String> dcIds;

    public String portType;

    public Boolean buildCrossConnectWithAssisted;
}