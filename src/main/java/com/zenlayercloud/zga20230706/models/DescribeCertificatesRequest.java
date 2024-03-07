/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-07-06 21:53:31
 * @version $ Id: DescribeCertificatesRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeCertificatesRequest extends TeaModel {

    public List<String> certificateIds;
    public String       certificateLabel;
    public String       san;
    public String       resourceGroupId;
    public Boolean      expired;
    public Integer      pageSize;
    public Integer      pageNum;
}
