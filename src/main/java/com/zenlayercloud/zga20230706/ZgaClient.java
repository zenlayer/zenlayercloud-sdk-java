/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;

import com.zenlayercloud.zga20230706.models.CloseAcceleratorAccessControlRequest;
import com.zenlayercloud.zga20230706.models.CloseAcceleratorAccessControlResponse;
import com.zenlayercloud.zga20230706.models.CreateAcceleratorRequest;
import com.zenlayercloud.zga20230706.models.CreateAcceleratorResponse;
import com.zenlayercloud.zga20230706.models.CreateCertificateRequest;
import com.zenlayercloud.zga20230706.models.CreateCertificateResponse;
import com.zenlayercloud.zga20230706.models.DeleteAcceleratorRequest;
import com.zenlayercloud.zga20230706.models.DeleteAcceleratorResponse;
import com.zenlayercloud.zga20230706.models.DeleteCertificateRequest;
import com.zenlayercloud.zga20230706.models.DeleteCertificateResponse;
import com.zenlayercloud.zga20230706.models.DescribeAccelerateRegionsRequest;
import com.zenlayercloud.zga20230706.models.DescribeAccelerateRegionsResponse;
import com.zenlayercloud.zga20230706.models.DescribeAcceleratorsAlertsRequest;
import com.zenlayercloud.zga20230706.models.DescribeAcceleratorsAlertsResponse;
import com.zenlayercloud.zga20230706.models.DescribeAcceleratorLogsRequest;
import com.zenlayercloud.zga20230706.models.DescribeAcceleratorLogsResponse;
import com.zenlayercloud.zga20230706.models.DescribeAcceleratorTrafficRequest;
import com.zenlayercloud.zga20230706.models.DescribeAcceleratorTrafficResponse;
import com.zenlayercloud.zga20230706.models.DescribeAcceleratorsRequest;
import com.zenlayercloud.zga20230706.models.DescribeAcceleratorsResponse;
import com.zenlayercloud.zga20230706.models.DescribeCertificatesRequest;
import com.zenlayercloud.zga20230706.models.DescribeCertificatesResponse;
import com.zenlayercloud.zga20230706.models.DescribeOriginRegionsResponse;
import com.zenlayercloud.zga20230706.models.ModifyAcceleratorAccRegionRequest;
import com.zenlayercloud.zga20230706.models.ModifyAcceleratorAccRegionResponse;
import com.zenlayercloud.zga20230706.models.ModifyAcceleratorAccessControlRequest;
import com.zenlayercloud.zga20230706.models.ModifyAcceleratorAccessControlResponse;
import com.zenlayercloud.zga20230706.models.ModifyAcceleratorCertificateRequest;
import com.zenlayercloud.zga20230706.models.ModifyAcceleratorCertificateResponse;
import com.zenlayercloud.zga20230706.models.ModifyAcceleratorDomainRequest;
import com.zenlayercloud.zga20230706.models.ModifyAcceleratorDomainResponse;
import com.zenlayercloud.zga20230706.models.ModifyAcceleratorHealthCheckRequest;
import com.zenlayercloud.zga20230706.models.ModifyAcceleratorHealthCheckResponse;
import com.zenlayercloud.zga20230706.models.ModifyAcceleratorNameRequest;
import com.zenlayercloud.zga20230706.models.ModifyAcceleratorNameResponse;
import com.zenlayercloud.zga20230706.models.ModifyAcceleratorOriginRequest;
import com.zenlayercloud.zga20230706.models.ModifyAcceleratorOriginResponse;
import com.zenlayercloud.zga20230706.models.ModifyAcceleratorProtocolOptsRequest;
import com.zenlayercloud.zga20230706.models.ModifyAcceleratorProtocolOptsResponse;
import com.zenlayercloud.zga20230706.models.ModifyAcceleratorRuleRequest;
import com.zenlayercloud.zga20230706.models.ModifyAcceleratorRuleResponse;
import com.zenlayercloud.zga20230706.models.OpenAcceleratorAccessControlRequest;
import com.zenlayercloud.zga20230706.models.OpenAcceleratorAccessControlResponse;
import com.zenlayercloud.zga20230706.models.PauseAcceleratorRequest;
import com.zenlayercloud.zga20230706.models.PauseAcceleratorResponse;
import com.zenlayercloud.zga20230706.models.RedeployAcceleratorRequest;
import com.zenlayercloud.zga20230706.models.RedeployAcceleratorResponse;
import com.zenlayercloud.zga20230706.models.StartAcceleratorRequest;
import com.zenlayercloud.zga20230706.models.StartAcceleratorResponse;

import java.util.Map;

/**
 * @author sherlock
 * @version $ Id: VmClient.java, v 0.1 sherlock Exp $
 * @date 2023-03-13 14:43:09
 */
public class ZgaClient extends AbstractClient {

    private static final String VERSION = "2023-07-06";
    private static final String endpoint = "console.zenlayer.com";
    private static final String path = "/api/v2/zga";

    public ZgaClient(Credential credential, Config config) {
        super(credential, config, Common.isUnset(config.endpoint) ? endpoint : config.endpoint, VERSION, path);
    }

    public ZgaClient(Credential credential) {
        this(credential, new Config());
    }

    public DescribeOriginRegionsResponse describeOriginRegions() {
        Map<String, ?> rspStr = super.callApi(new TeaModel(), "DescribeOriginRegions", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DescribeOriginRegionsResponse());
    }

    public DescribeAccelerateRegionsResponse describeAccelerateRegions(DescribeAccelerateRegionsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeAccelerateRegions", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DescribeAccelerateRegionsResponse());
    }

    public DescribeCertificatesResponse describeCertificates(DescribeCertificatesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeCertificates", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DescribeCertificatesResponse());
    }

    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateCertificate", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new CreateCertificateResponse());
    }

    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeleteCertificate", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DeleteCertificateResponse());
    }

    public DescribeAcceleratorsResponse describeAccelerators(DescribeAcceleratorsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeAccelerators", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DescribeAcceleratorsResponse());
    }

    public CreateAcceleratorResponse createAccelerator(CreateAcceleratorRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateAccelerator", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new CreateAcceleratorResponse());
    }

    public DeleteAcceleratorResponse deleteAccelerator(DeleteAcceleratorRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeleteAccelerator", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DeleteAcceleratorResponse());
    }

    public StartAcceleratorResponse startAccelerator(StartAcceleratorRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "StartAccelerator", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new StartAcceleratorResponse());
    }

    public RedeployAcceleratorResponse redeployAccelerator(RedeployAcceleratorRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "RedeployAccelerator", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new RedeployAcceleratorResponse());
    }

    public PauseAcceleratorResponse pauseAccelerator(PauseAcceleratorRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "PauseAccelerator", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new PauseAcceleratorResponse());
    }

    public ModifyAcceleratorDomainResponse modifyAcceleratorDomain(ModifyAcceleratorDomainRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyAcceleratorDomain", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new ModifyAcceleratorDomainResponse());
    }

    public ModifyAcceleratorNameResponse modifyAcceleratorName(ModifyAcceleratorNameRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyAcceleratorName", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new ModifyAcceleratorNameResponse());
    }

    public ModifyAcceleratorOriginResponse modifyAcceleratorOrigin(ModifyAcceleratorOriginRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyAcceleratorOrigin", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new ModifyAcceleratorOriginResponse());
    }

    public ModifyAcceleratorAccRegionResponse modifyAcceleratorAccRegion(ModifyAcceleratorAccRegionRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyAcceleratorAccRegion", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new ModifyAcceleratorAccRegionResponse());
    }

    public ModifyAcceleratorRuleResponse modifyAcceleratorRule(ModifyAcceleratorRuleRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyAcceleratorRule", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new ModifyAcceleratorRuleResponse());
    }

    public ModifyAcceleratorProtocolOptsResponse modifyAcceleratorProtocolOpts(
            ModifyAcceleratorProtocolOptsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyAcceleratorProtocolOpts", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new ModifyAcceleratorProtocolOptsResponse());
    }

    public ModifyAcceleratorCertificateResponse modifyAcceleratorCertificate(
            ModifyAcceleratorCertificateRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyAcceleratorCertificate", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new ModifyAcceleratorCertificateResponse());
    }

    public ModifyAcceleratorHealthCheckResponse modifyAcceleratorHealthCheck(
            ModifyAcceleratorHealthCheckRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyAcceleratorHealthCheck", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new ModifyAcceleratorHealthCheckResponse());
    }

    public ModifyAcceleratorAccessControlResponse modifyAcceleratorAccessControl(
            ModifyAcceleratorAccessControlRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyAcceleratorAccessControl", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new ModifyAcceleratorAccessControlResponse());
    }

    public OpenAcceleratorAccessControlResponse openAcceleratorAccessControl(
            OpenAcceleratorAccessControlRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "OpenAcceleratorAccessControl", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new OpenAcceleratorAccessControlResponse());
    }

    public CloseAcceleratorAccessControlResponse closeAcceleratorAccessControl(
            CloseAcceleratorAccessControlRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CloseAcceleratorAccessControl", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new CloseAcceleratorAccessControlResponse());
    }

    public DescribeAcceleratorsAlertsResponse describeAcceleratorsAlerts(
            DescribeAcceleratorsAlertsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeAcceleratorsAlerts", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DescribeAcceleratorsAlertsResponse());
    }

    public DescribeAcceleratorLogsResponse describeAcceleratorLogs(
            DescribeAcceleratorLogsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeAcceleratorLogs", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DescribeAcceleratorLogsResponse());
    }

    public DescribeAcceleratorTrafficResponse describeAcceleratorTraffic(
            DescribeAcceleratorTrafficRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeAcceleratorTraffic", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DescribeAcceleratorTrafficResponse());
    }
}
