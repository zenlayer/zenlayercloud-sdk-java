package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

public class ChangeNicNetworkTypeRequest extends TeaModel {
    @Validation(required = true)
    public String instanceId;

    @Validation(required = true)
    public String nicNetworkType;
}
