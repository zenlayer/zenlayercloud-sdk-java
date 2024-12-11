package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.math.BigDecimal;

public class AssignNicIpv6Request extends TeaModel {
    @Validation(required = true)
    public String nicId;

    public String internetChargeType;

    public BigDecimal packageSize;
}
