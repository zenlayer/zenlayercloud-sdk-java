/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author sherlock
 * @version $ Id: DescribeImagesRequest.java, v 0.1  sherlock Exp $
 * @date 2023-03-08 14:37:57
 */
public class DescribeImagesRequest extends TeaModel {
    public List<String> imageIds;
    public String       imageName;
    public String       zoneId;
    public String       category;
    public String       imageType;
    public String       osType;
    public String       imageStatus;
    public Integer      pageNum;
    public Integer      pageSize;

}
