/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author wolfgang
 * @date 2023-10-12 11:44:27
 * @version $ Id: DescribeKeyPairsResponse.java, v 0.1  wolfgang Exp $
 */
public class DescribeKeyPairsResponse extends TeaModel {

    public String        requestId;
    public List<KeyPair> dataSet;
    public Integer       totalCount;
}
