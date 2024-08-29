package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

public class DeleteSubnetRequest extends TeaModel {
    @Validation(required = true)
    public String subnetId;
}
