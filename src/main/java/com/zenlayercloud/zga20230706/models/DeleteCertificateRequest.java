/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-07-06 22:04:54
 * @version $ Id: DeleteCertificateRequest.java, v 0.1  alicat.xu Exp $
 */
public class DeleteCertificateRequest extends TeaModel {

    @Validation(required = true)
    public String certificateId;
}
