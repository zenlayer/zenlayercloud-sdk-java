package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;
import java.util.Set;

public class ModifyVpcsAttributeRequest extends TeaModel {
    /**
     * 一个或多个待操作的VPC ID。
     * 每次请求批量实例的上限为100。
     */
    @Validation(maxLength = 100, required = true)
    public Set<String> vpcIds;

    @Validation(required = true)
    public String name;

}
