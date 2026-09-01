/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.zsp20260801;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.zsp20260801.models.*;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;
import com.zenlayercloud.common.TokenCredential;

import java.util.Map;


public class ZspClient extends AbstractClient {
    private static final String VERSION = "2026-08-01";
    private static final String ENDPOINT = "console.zenlayer.com";
    private static final String PATH = "/api/v2/zsp";

    public ZspClient(Credential credential, Config config) {
        super(credential, config,
            config.getEndpoint() != null ? config.getEndpoint() : ENDPOINT,
            VERSION, PATH);
    }

    public ZspClient(TokenCredential credential, Config config) {
        super(credential, config,
            config.getEndpoint() != null ? config.getEndpoint() : ENDPOINT,
            VERSION, PATH);
    }

        /**
         * 查询当前团队提交的工单列表。
         */
    public DescribeTicketsResponse describeTickets(DescribeTicketsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeTickets",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeTicketsResponse());
    }

        /**
         * 创建一个工单。
         */
    public CreateTicketResponse createTicket(CreateTicketRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateTicket",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateTicketResponse());
    }

        /**
         * 查询指定工单的详细信息与沟通记录。
         */
    public DescribeTicketDetailResponse describeTicketDetail(DescribeTicketDetailRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeTicketDetail",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeTicketDetailResponse());
    }

        /**
         * 查询当前团队一小时内是否还可以创建工单。
         */
    public DescribeTicketCreationQuotaResponse describeTicketCreationQuota(DescribeTicketCreationQuotaRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeTicketCreationQuota",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeTicketCreationQuotaResponse());
    }

}