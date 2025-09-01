package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

public class CreateCidrRequest extends TeaModel {
    @Validation(required = true)
    public String regionId;

    @Validation(required = true)
    public String eipV4Type;

    @Validation(required = true)
    public NetmaskInfo netmask;

    public String resourceGroupId;

    public MarketingInfo marketingOptions;
}
