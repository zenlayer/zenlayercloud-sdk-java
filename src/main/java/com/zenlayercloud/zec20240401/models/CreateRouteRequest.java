package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

public class CreateRouteRequest extends TeaModel {

    @Validation(required = true)
    public String vpcId;

    @Validation(required = true)
    public String ipVersion;

    @Validation(required = true)
    public String routeType;

    public String sourceCidrBlock;

    @Validation(required = true)
    public String cidrBlock;

    @Validation(required = true)
    public Integer priority;

    @Validation(required = true)
    public String nextHotId;

    @Validation(required = true)
    public String name;
}
