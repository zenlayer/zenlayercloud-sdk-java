package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

public class ResetInstanceRequest extends TeaModel {
    @Validation(required = true)
    public String instanceId;

    public String imageId;

    public String password;

    public String keyId;

    public String timezone;

    public Boolean enableAgent;

}
