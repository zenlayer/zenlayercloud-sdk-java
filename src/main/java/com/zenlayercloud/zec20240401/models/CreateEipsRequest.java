package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.math.BigDecimal;

public class CreateEipsRequest extends TeaModel {
    @Validation(required = true)
    public String regionId;

    public Integer amount;

    @Validation(required = true)
    public String name;

    @Validation(required = true)
    public String internetChargeType;

    public String eipV4Type;

    public String primaryIsp;

    public Integer bandwidth;

    public BigDecimal flowPackage;

    public String cidrId;

    public String publicIp;

    public String resourceGroupId;

    public String clusterId;

    public String peerRegionId;
}
