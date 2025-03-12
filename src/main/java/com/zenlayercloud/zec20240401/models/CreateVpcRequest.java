package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

public class CreateVpcRequest extends TeaModel {
    public String name;

    public String cidrBlock;

    public Integer mtu;

    public Boolean enablePriIpv6;

    public String resourceGroupId;
}
