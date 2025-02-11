package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.math.BigDecimal;

public class InquiryPricePublicIpv6Request extends TeaModel {
    @Validation(required = true)
    public String regionId;

    public BigDecimal packageSize;

    public Integer bandwidth;
}
