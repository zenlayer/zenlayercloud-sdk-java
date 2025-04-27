package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class QueryDataCenterPortPricesResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    public List<DatacenterPortPrice> prices;

}
