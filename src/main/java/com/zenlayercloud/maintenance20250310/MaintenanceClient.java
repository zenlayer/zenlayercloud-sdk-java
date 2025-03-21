/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.maintenance20250310;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;
import com.zenlayercloud.maintenance20250310.models.DescribeMaintenanceAlertsRequest;
import com.zenlayercloud.maintenance20250310.models.DescribeMaintenanceAlertsResponse;

import java.util.Map;

/**
 * @author wolfgang
 * @version $ Id: MaintenanceClient.java, v 0.1  wolfang Exp $
 * @date 2024-04-01 12:12:01
 */
public class MaintenanceClient extends AbstractClient {

    private static final String VERSION  = "2025-03-10";
    private static final String endpoint = "console.zenlayer.com";
    private static final String path     = "/api/v2/maintenance";

    public MaintenanceClient(Credential credential, Config config) {
        super(credential, config, Common.isUnset(config.endpoint) ? endpoint : config.endpoint, VERSION, path);
    }

    public MaintenanceClient(Credential credential) {
        this(credential, new Config());
    }

    public DescribeMaintenanceAlertsResponse describeMaintenanceAlerts(DescribeMaintenanceAlertsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeMaintenanceAlerts", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeMaintenanceAlertsResponse());
    }
}
