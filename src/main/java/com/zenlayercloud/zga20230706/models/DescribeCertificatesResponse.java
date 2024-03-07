/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-07-06 21:55:50
 * @version $ Id: DescribeCertificatesResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeCertificatesResponse extends TeaModel {

    public String requestId;

    public Integer totalCount;

    public List<CertificateInfo> dataSet;
}
