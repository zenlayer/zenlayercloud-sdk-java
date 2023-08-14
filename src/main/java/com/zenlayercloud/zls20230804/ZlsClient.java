/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zls20230804;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;
import com.zenlayercloud.zls20230804.models.DescribeLogsRequest;
import com.zenlayercloud.zls20230804.models.DescribeLogsResponse;

import java.util.Map;


public class ZlsClient extends AbstractClient {

    private static final String VERSION  = "2023-08-04";
    private static final String endpoint = "console.zenlayer.com";
    private static final String path     = "/api/v2/zls";

    public ZlsClient(Credential credential, Config config) {
        super(credential, config, Common.isUnset(config.endpoint) ? endpoint : config.endpoint, VERSION, path);
    }

    public ZlsClient(Credential credential) {
        this(credential, new Config());
    }

    public DescribeLogsResponse describeLogs(DescribeLogsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeLogs", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DescribeLogsResponse());
    }

}
