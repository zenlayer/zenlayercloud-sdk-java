package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

public class CreateSubnetRequest extends TeaModel {
    @Validation(required = true)
    public String vpcId;

    @Validation(required = true)
    public String regionId;

    @Validation(required = true)
    public String stackType;

    @Validation
    public String ipv6Type;

    @Validation(required = true)
    public String name;

    @Validation(required = true)
    public String cidrBlock;
}
