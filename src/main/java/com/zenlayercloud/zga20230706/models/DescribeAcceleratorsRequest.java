/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-07-06 22:13:38
 * @version $ Id: DescribeAcceleratorsRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeAcceleratorsRequest extends TeaModel {

    public List<String> acceleratorIds;
    public String       acceleratorName;
    public String       acceleratorStatus;
    public String       accelerateRegionId;
    public String       vip;
    public String       domain;
    public String       origin;
    public String       originRegionId;
    public String       cname;
    public String       resourceGroupId;
    public Integer      pageSize;
    public Integer      pageNum;
}
