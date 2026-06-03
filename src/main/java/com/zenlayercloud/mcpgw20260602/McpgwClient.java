/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.mcpgw20260602;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.mcpgw20260602.models.*;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;
import com.zenlayercloud.common.TokenCredential;

import java.util.Map;


public class McpgwClient extends AbstractClient {
    private static final String VERSION = "2026-06-02";
    private static final String ENDPOINT = "console.zenlayer.com";
    private static final String PATH = "/api/v2/mcpgw";

    public McpgwClient(Credential credential, Config config) {
        super(credential, config,
            config.getEndpoint() != null ? config.getEndpoint() : ENDPOINT,
            VERSION, PATH);
    }

    public McpgwClient(TokenCredential credential, Config config) {
        super(credential, config,
            config.getEndpoint() != null ? config.getEndpoint() : ENDPOINT,
            VERSION, PATH);
    }

        /**
         * 查询MCP网关按月计费明细
         */
    public DescribeMcpMonthlyBillingResponse describeMcpMonthlyBilling(DescribeMcpMonthlyBillingRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeMcpMonthlyBilling",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeMcpMonthlyBillingResponse());
    }

}