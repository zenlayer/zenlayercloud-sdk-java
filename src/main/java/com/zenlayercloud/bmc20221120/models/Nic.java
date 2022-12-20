/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author Zif
 * @date 2022/12/20
 */
public class Nic extends TeaModel {

    /**
     * 网卡配置的公网网卡名称
     * 公网网卡名只能是数字和大小写字母，且字母必须开头，长度限制为4-10。
     */
    @Validation(pattern = "^[a-zA-Z][a-zA-Z0-9]{3,9}$", minLength = 4, maxLength = 10)
    public String wanName;

    /**
     * 网卡配置的内网网卡名称
     * 内网网卡名只能是数字和大小写字母，且字母必须开头，长度限制为4-10
     */
    @Validation(pattern = "^[a-zA-Z][a-zA-Z0-9]{3,9}$", minLength = 4, maxLength = 10)
    public String lanName;

}
