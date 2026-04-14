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

        /**
         * 本接口用于连接IP Transit 服务支持的数据中心。
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
         * 创建一条IP Transit 的询价。
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
         * 创建一条IP Transit。
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
         * 本接口用于查询IP Transit资源列表。
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
         * 修改一条IP Transit的带宽限速。
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
         * 修改IP Transit的基本信息，包括名称和备注。
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
         * 删除一条IP Transit。
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
         * 查询IP Transit在指定时间段内的带宽数据。
         */
    public DescribeIPTransitTrafficResponse describeIPTransitTraffic(DescribeIPTransitTrafficRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeIPTransitTraffic",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeIPTransitTrafficResponse());
    }

}