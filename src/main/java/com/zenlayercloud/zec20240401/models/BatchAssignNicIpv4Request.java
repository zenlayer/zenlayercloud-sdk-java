package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.Set;

public class BatchAssignNicIpv4Request extends TeaModel {
    @Validation(required = true)
    public String nicId;

    @Validation(required = true)
    public Set<String> ipAddresses;
}
