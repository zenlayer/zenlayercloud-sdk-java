/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

/**
 * @author sherlock
 * @version $ Id: CreateImageRequest.java, v 0.1  sherlock Exp $
 * @date 2023-03-08 14:37:57
 */
public class CreateImageRequest extends TeaModel {
    public String instanceId;
    public String imageName;
    public String imageDescription;
}
