/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.ipt20240901;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;
import com.zenlayercloud.ipt20240901.models.CreateIPTransitRequest;
import com.zenlayercloud.ipt20240901.models.CreateIPTransitResponse;
import com.zenlayercloud.ipt20240901.models.DeleteIPTransitRequest;
import com.zenlayercloud.ipt20240901.models.DeleteIPTransitResponse;
import com.zenlayercloud.ipt20240901.models.DescribeIPTransitDatacentersRequest;
import com.zenlayercloud.ipt20240901.models.DescribeIPTransitDatacentersResponse;
import com.zenlayercloud.ipt20240901.models.DescribeIPTransitTrafficRequest;
import com.zenlayercloud.ipt20240901.models.DescribeIPTransitTrafficResponse;
import com.zenlayercloud.ipt20240901.models.DescribeIPTransitsRequest;
import com.zenlayercloud.ipt20240901.models.DescribeIPTransitsResponse;
import com.zenlayercloud.ipt20240901.models.InquiryCreateIPTransitPriceRequest;
import com.zenlayercloud.ipt20240901.models.InquiryCreateIPTransitPriceResponse;
import com.zenlayercloud.ipt20240901.models.ModifyIPTransitBandwidthRequest;
import com.zenlayercloud.ipt20240901.models.ModifyIPTransitBandwidthResponse;
import com.zenlayercloud.ipt20240901.models.ModifyIPTransitsAttributeRequest;
import com.zenlayercloud.ipt20240901.models.ModifyIPTransitsAttributeResponse;

import java.util.Map;

public class IptClient extends AbstractClient {

    private static final String VERSION  = "2024-09-01";
    private static final String endpoint = "console.zenlayer.com";
    private static final String path     = "/api/v2/ipt";

    public IptClient(Credential credential, Config config) {
        super(credential, config, Common.isUnset(config.endpoint) ? endpoint : config.endpoint, VERSION, path);
    }

    public IptClient(Credential credential) {
        this(credential, new Config());
    }

    public DescribeIPTransitsResponse describeIPTransits(DescribeIPTransitsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeIPTransits", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeIPTransitsResponse());
    }

    public DescribeIPTransitDatacentersResponse describeIPTransitDatacenters(DescribeIPTransitDatacentersRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeIPTransitDatacenters", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeIPTransitDatacentersResponse());
    }

    public CreateIPTransitResponse createIPTransit(CreateIPTransitRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateIPTransit", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateIPTransitResponse());
    }

    public DeleteIPTransitResponse deleteIPTransit(DeleteIPTransitRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeleteIPTransit", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DeleteIPTransitResponse());
    }

    public ModifyIPTransitsAttributeResponse modifyIPTransitsAttribute(ModifyIPTransitsAttributeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyIPTransitsAttribute", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyIPTransitsAttributeResponse());
    }

    public DescribeIPTransitTrafficResponse describeIPTransitTraffic(DescribeIPTransitTrafficRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeIPTransitTraffic", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeIPTransitTrafficResponse());
    }

    public ModifyIPTransitBandwidthResponse modifyIPTransitBandwidth(ModifyIPTransitBandwidthRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyIPTransitBandwidth", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyIPTransitBandwidthResponse());
    }

    public InquiryCreateIPTransitPriceResponse inquiryCreateIPTransitPrice(InquiryCreateIPTransitPriceRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "InquiryCreateIPTransitPrice", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new InquiryCreateIPTransitPriceResponse());
    }
}
