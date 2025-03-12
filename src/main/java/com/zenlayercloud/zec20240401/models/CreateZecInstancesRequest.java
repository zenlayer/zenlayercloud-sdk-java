package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.math.BigDecimal;
import java.util.List;

public class CreateZecInstancesRequest extends TeaModel {
    @Validation(required = true)
    public String zoneId;

    @Validation(required = true)
    public String instanceType;

    @Validation(required = true)
    public String imageId;

    public String resourceGroupId;

    public String instanceName;

    public Integer instanceCount;

    public String password;

    public String keyId;

    public String internetChargeType;

    public BigDecimal trafficPackageSize;

    public Integer bandwidth;

    @Validation(required = true)
    public String subnetId;

    public SystemDisk systemDisk;

    public List<DataDisk> dataDisks;

    public String timeZone;

    public Boolean enableAgent;

    public Boolean enableIpForward;

    public String eipV4Type;

    public String clusterId;
}
