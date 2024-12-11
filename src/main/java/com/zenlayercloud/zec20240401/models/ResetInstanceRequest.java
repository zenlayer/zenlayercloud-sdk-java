package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

public class ResetInstanceRequest extends TeaModel {

    public String instanceId;

    public String imageId;

    public String password;

    public String keyId;

    public String timezone;

    public Boolean enableAgent;

}
