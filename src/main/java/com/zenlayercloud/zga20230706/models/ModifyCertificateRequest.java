/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author otis.lin
 * @date 2024-10-10 10:56:00
 * @version $ Id: ModifyCertificateRequest.java, v 0.1  otis.lin Exp $
 */
public class ModifyCertificateRequest extends TeaModel {

    @Validation(required = true)
    public String certificateId;

    @Validation(required = true)
    public String certificateContent;

    @Validation(required = true)
    public String certificateKey;
}
