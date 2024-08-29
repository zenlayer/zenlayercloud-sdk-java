package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

public class CreateVpcRequest extends TeaModel {
    @Validation(required = true)
    public String name;

    @Validation(required = true)
    public String cidrBlock;

    @Validation(required = true)
    public Integer mtu;

    @Validation
    public Boolean enablePriIpv6;

    @Validation
    public String resourceGroupId;
}
