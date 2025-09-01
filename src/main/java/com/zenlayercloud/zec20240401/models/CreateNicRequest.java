package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.math.BigDecimal;

public class CreateNicRequest extends TeaModel {
    @Validation(required = true)
    public String name;

    @Validation(required = true)
    public String subnetId;

    public BigDecimal packageSize;

    public Integer bandwidth;

    public String internetChargeType;

    public String resourceGroupId;

    public String clusterId;

    public MarketingInfo marketingOptions;
}
