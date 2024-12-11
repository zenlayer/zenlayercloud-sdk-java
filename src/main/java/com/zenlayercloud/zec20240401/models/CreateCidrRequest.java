package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

public class CreateCidrRequest extends TeaModel {
    @Validation(required = true)
    public String regionId;

    @Validation(required = true)
    public String chargeType;

    public String resourceGroupId;

    public ChargePrePaid instanceChargePrepaid;

    @Validation(required = true)
    public String networkType;

    @Validation(required = true)
    public NetmaskInfo netmask;

}
