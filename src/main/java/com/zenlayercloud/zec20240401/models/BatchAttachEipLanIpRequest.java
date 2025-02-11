package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

public class BatchAttachEipLanIpRequest extends TeaModel {
    @Validation(required = true)
    public String nicId;

    @Validation(required = true)
    public String lanIp;

    @Validation(required = true)
    public List<String> eipIds;
}
