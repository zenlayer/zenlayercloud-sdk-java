/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.ipt20240901;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.ipt20240901.models.*;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;
import com.zenlayercloud.common.TokenCredential;

import java.util.Map;


public class IptClient extends AbstractClient {
    private static final String VERSION = "2024-09-01";
    private static final String ENDPOINT = "console.zenlayer.com";
    private static final String PATH = "/api/v2/ipt";

    public IptClient(Credential credential, Config config) {
        super(credential, config,
            config.getEndpoint() != null ? config.getEndpoint() : ENDPOINT,
            VERSION, PATH);
    }

    public IptClient(TokenCredential credential, Config config) {
        super(credential, config,
            config.getEndpoint() != null ? config.getEndpoint() : ENDPOINT,
            VERSION, PATH);
    }

        /**
         * 查询IP Transit可连接数据中心
         */
    public DescribeIPTransitDatacentersResponse describeIPTransitDatacenters(DescribeIPTransitDatacentersRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeIPTransitDatacenters",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeIPTransitDatacentersResponse());
    }

        /**
         * 查询IP Transit可用 ASN
         */
    public DescribeIPTransitAvailableAsnsResponse describeIPTransitAvailableAsns(DescribeIPTransitAvailableAsnsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeIPTransitAvailableAsns",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeIPTransitAvailableAsnsResponse());
    }

        /**
         * 查询IP Transit可用公网地址段
         */
    public DescribeIPTransitAvailableCidrBlocksResponse describeIPTransitAvailableCidrBlocks(DescribeIPTransitAvailableCidrBlocksRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeIPTransitAvailableCidrBlocks",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeIPTransitAvailableCidrBlocksResponse());
    }

        /**
         * iP Transit创建询价
         */
    public InquiryCreateIPTransitPriceResponse inquiryCreateIPTransitPrice(InquiryCreateIPTransitPriceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "InquiryCreateIPTransitPrice",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new InquiryCreateIPTransitPriceResponse());
    }

        /**
         * 创建IP Transit
         */
    public CreateIPTransitResponse createIPTransit(CreateIPTransitRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateIPTransit",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateIPTransitResponse());
    }

        /**
         * 查询IP Transit列表
         */
    public DescribeIPTransitsResponse describeIPTransits(DescribeIPTransitsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeIPTransits",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeIPTransitsResponse());
    }

        /**
         * 修改IP Transit带宽
         */
    public ModifyIPTransitBandwidthResponse modifyIPTransitBandwidth(ModifyIPTransitBandwidthRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyIPTransitBandwidth",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyIPTransitBandwidthResponse());
    }

        /**
         * 修改IP Transit属性
         */
    public ModifyIPTransitsAttributeResponse modifyIPTransitsAttribute(ModifyIPTransitsAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyIPTransitsAttribute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyIPTransitsAttributeResponse());
    }

        /**
         * 删除IP Transit
         */
    public DeleteIPTransitResponse deleteIPTransit(DeleteIPTransitRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteIPTransit",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteIPTransitResponse());
    }

        /**
         * 查询IP Transit流量
         */
    public DescribeIPTransitTrafficResponse describeIPTransitTraffic(DescribeIPTransitTrafficRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeIPTransitTraffic",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeIPTransitTrafficResponse());
    }

        /**
         * IP Transit变配询价
         */
    public InquiryModifyIPTransitPriceResponse inquiryModifyIPTransitPrice(InquiryModifyIPTransitPriceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "InquiryModifyIPTransitPrice",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new InquiryModifyIPTransitPriceResponse());
    }

        /**
         * 修改IP Transit配置
         */
    public ModifyIPTransitConfigResponse modifyIPTransitConfig(ModifyIPTransitConfigRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyIPTransitConfig",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyIPTransitConfigResponse());
    }

}