package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;
import java.util.Set;

public class ModifySubnetsAttributeRequest extends TeaModel {
    @Validation(maxLength = 100, required = true)
    public Set<String> subnetIds;

    @Validation(required = true)
    public String name;
}
