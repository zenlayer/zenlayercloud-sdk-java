/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zls20230804.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-08-04 13:56:36
 * @version $ Id: DescribeLogsResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeLogsResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String        requestId;
    public List<Object>  cursor;
    public List<LogInfo> dataSet;

    public static class LogInfo extends TeaModel {
        public String resUid;
        public String resType;
        public String resEvent;
        public String opsTime;
        public String eventSource;
        public String apiVersion;
        public String opsUser;
        public String clientIP;
        public String request;
        public String response;
    }
}
