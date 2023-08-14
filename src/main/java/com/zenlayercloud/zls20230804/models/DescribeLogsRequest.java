/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zls20230804.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-08-04 13:54:53
 * @version $ Id: DescribeLogsRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeLogsRequest extends TeaModel {

    public String       startTime;
    public String       endTime;
    public String       resUid;
    public String       resEvent;
    public String       clientIP;
    public Integer      size;
    public List<Object> cursor;
}
