package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

public class QueryDataCenterPortPriceRequest extends TeaModel {
    public String dcId;

    public String portType;

    public Boolean buildCrossConnectWithAssisted;

}
