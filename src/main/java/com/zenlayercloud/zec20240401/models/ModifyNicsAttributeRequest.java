package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

public class ModifyNicsAttributeRequest extends TeaModel {

    /**
     * Nic ID 取值可以由多个Nic ID组成一个
     * 最多支持100个ID查询
     */
    @Validation(required = true)
    public List<String> nicIds;

    /**
     * DISK名称
     */
    @Validation(required = true, minLength = 1, maxLength = 64)
    public String name;
}
