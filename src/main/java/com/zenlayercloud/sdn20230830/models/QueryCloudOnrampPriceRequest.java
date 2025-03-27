package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

public class QueryCloudOnrampPriceRequest extends TeaModel {
    public String dcId;

    public String cloudType;

    public Integer vlanId;

    public String cloudRegionId;

    public Integer bandwidthMbps;
}
