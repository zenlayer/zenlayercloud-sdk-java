/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author wolfgang
 * @date 2023-10-07 14:52:56
 * @version $ Id: DescribeKeyPairsRequest.java, v 0.1  wolfgang Exp $
 */
public class DescribeKeyPairsRequest extends TeaModel {
    public List<String> keyIds;
    public String       keyName;
    public Integer      pageSize;
    public Integer      pageNum;

}
