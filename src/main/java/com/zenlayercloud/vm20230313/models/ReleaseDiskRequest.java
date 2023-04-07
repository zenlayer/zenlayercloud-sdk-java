/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-23 15:02:01
 * @version $ Id: DeleteDisksRequest.java, v 0.1  alicat.xu Exp $
 */
public class ReleaseDiskRequest extends TeaModel {

    /**
     * DISK ID
     */
    @Validation(required = true)
    public String diskId;
}
