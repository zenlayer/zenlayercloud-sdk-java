/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-07-07 14:38:37
 * @version $ Id: AccessControl.java, v 0.1  alicat.xu Exp $
 */
public class AccessControl extends TeaModel {

    public Boolean enable;

    public List<AccessControlRule> rules;
}
