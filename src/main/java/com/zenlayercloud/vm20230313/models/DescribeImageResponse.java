/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author sherlock
 * @version $ Id: DescribeImagesResponse.java, v 0.1  sherlock Exp $
 * @date 2023-03-08 14:37:57
 */
public class DescribeImageResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId
     */
    public String requestId;
    public String imageId;
    public String imageName;
    public String imageType;
    public String imageSize;
    public String imageDescription;
    public String imageVersion;
    public String imageStatus;
    public String category;
    public String osType;

}
