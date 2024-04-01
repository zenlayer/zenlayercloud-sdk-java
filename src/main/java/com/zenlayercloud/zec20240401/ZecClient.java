/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zec20240401;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;
import com.zenlayercloud.zec20240401.models.DescribeInstanceMonitorDataRequest;
import com.zenlayercloud.zec20240401.models.DescribeInstanceMonitorDataResponse;

import java.util.Map;

/**
 * @author wolfgang
 * @version $ Id: ZecClient.java, v 0.1  wolfang Exp $
 * @date 2024-04-01 12:12:01
 */
public class ZecClient extends AbstractClient {

    private static final String VERSION  = "2024-04-01";
    private static final String endpoint = "console.zenlayer.com";
    private static final String path     = "/api/v2/zec";

    public ZecClient(Credential credential, Config config) {
        super(credential, config, Common.isUnset(config.endpoint) ? endpoint : config.endpoint, VERSION, path);
    }

    public ZecClient(Credential credential) {
        this(credential, new Config());
    }

    public DescribeInstanceMonitorDataResponse describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeInstanceMonitorData", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DescribeInstanceMonitorDataResponse());
    }

}
