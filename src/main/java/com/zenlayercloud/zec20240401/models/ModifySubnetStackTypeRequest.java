package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

public class ModifySubnetStackTypeRequest extends TeaModel {
    @Validation(required = true)
    public String subnetId;

    @Validation(required = true)
    public String stackType;

    @Validation(required = true)
    public String ipv6Type;
}
