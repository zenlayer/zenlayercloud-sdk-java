/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author wolfgang
 * @date 2022-11-09 20:21:03
 * @version $ Id: CreateInstanceRequest.java, v 0.1  wolfgang Exp $
 */
public class CreateInstancesResponse extends TeaModel {
    public List<String> instanceIdSet;
    public String       orderNumber;
}
