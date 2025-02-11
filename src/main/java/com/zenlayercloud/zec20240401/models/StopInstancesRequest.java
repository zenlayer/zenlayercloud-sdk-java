package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

public class StopInstancesRequest extends TeaModel {
    @Validation(required = true)
    public List<String> instanceIds;

    public Boolean forceShutdown;
}
