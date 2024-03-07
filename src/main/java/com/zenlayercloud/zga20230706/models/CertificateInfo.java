/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-07-06 21:56:37
 * @version $ Id: CertificateInfo.java, v 0.1  alicat.xu Exp $
 */
public class CertificateInfo extends TeaModel {

    public String       certificateId;
    public String       certificateLabel;
    public String       common;
    public String       fingerprint;
    public String       issuer;
    public List<String> sans;
    public String       algorithm;
    public String       createTime;
    public String       startTime;
    public String       endTime;
    public Boolean      expired;
    public String       resourceGroupId;

}
