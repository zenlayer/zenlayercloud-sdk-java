/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author sherlock
 * @version $ Id: ModifyImagesAttributesRequest.java, v 0.1  sherlock Exp $
 * @date 2023-03-08 14:37:57
 */
public class ModifyImagesAttributesRequest extends TeaModel {
    public List<String> imageIds;
    public String       imageDescription;
}
