package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

public class DeleteRouteRequest extends TeaModel {
    @Validation(required = true)
    public String vpcId;

    @Validation(required = true)
    public String routeId;
}
