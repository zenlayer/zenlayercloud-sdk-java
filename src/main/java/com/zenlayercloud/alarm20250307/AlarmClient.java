/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.alarm20250307;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.alarm20250307.models.DescribeIpBlockEventsRequest;
import com.zenlayercloud.alarm20250307.models.DescribeIpBlockEventsResponse;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;

import java.util.Map;

/**
 * @author wolfgang
 * @version $ Id: AlarmClient.java, v 0.1  wolfang Exp $
 * @date 2024-04-01 12:12:01
 */
public class AlarmClient extends AbstractClient {

    private static final String VERSION  = "2025-03-07";
    private static final String endpoint = "console.zenlayer.com";
    private static final String path     = "/api/v2/alarm";

    public AlarmClient(Credential credential, Config config) {
        super(credential, config, Common.isUnset(config.endpoint) ? endpoint : config.endpoint, VERSION, path);
    }

    public AlarmClient(Credential credential) {
        this(credential, new Config());
    }

    public DescribeIpBlockEventsResponse describeIpBlockEvents(DescribeIpBlockEventsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeIpBlockEvents", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeIpBlockEventsResponse());
    }
}
