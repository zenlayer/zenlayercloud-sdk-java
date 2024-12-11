package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

public class ConfigEgressIpRequest extends TeaModel {
    @Validation(required = true)
    public String cidrId;

    @Validation(required = true)
    public String publicIp;
}
