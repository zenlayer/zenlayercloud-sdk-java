package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

public class DescribeCidrUsedIpsRequest extends TeaModel {
    @Validation(required = true)
    public String cidrId;

    @Validation
    public String publicIp;

    @Validation
    public String instanceId;

    @Validation
    public String instanceName;

    @Validation
    public String nicId;

    @Validation
    public String nicName;

    @Validation(maximum = 1000, minimum = 1)
    public Integer pageSize;

    @Validation(minimum = 1)
    public Integer pageNum;
}
