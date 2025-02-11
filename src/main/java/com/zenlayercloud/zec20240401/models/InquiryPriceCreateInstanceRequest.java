package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.math.BigDecimal;

public class InquiryPriceCreateInstanceRequest extends TeaModel {
    @Validation(required = true)
    public String zoneId;

    @Validation(required = true)
    public String instanceType;

    @Validation(required = true)
    public String eipV4Type;

    @Validation(required = true)
    public String internetChargeType;

    public BigDecimal trafficPackageSize;

    public Integer bandwidth;

    public Integer instanceCount;

    @Validation(required = true)
    public SystemDisk systemDisk;

    public DataDisk dataDisk;
}
