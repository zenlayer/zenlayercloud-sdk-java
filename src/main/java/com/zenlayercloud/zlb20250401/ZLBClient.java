/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.zlb20250401;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.zlb20250401.models.*;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;

import java.util.Map;


public class ZLBClient extends AbstractClient {
    private static final String VERSION = "2025-04-01";
    private static final String ENDPOINT = "console.zenlayer.com";
    private static final String PATH = "/api/v2/zlb";

    public ZLBClient(Credential credential, Config config) {
        super(credential, config,
            config.getEndpoint() != null ? config.getEndpoint() : ENDPOINT,
            VERSION, PATH);
    }

    public DescribeListenersResponse describeListeners(DescribeListenersRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeListeners",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeListenersResponse());
    }

    public CreateListenerResponse createListener(CreateListenerRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateListener",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateListenerResponse());
    }

    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteListener",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteListenerResponse());
    }

    public ModifyListenerResponse modifyListener(ModifyListenerRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyListener",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyListenerResponse());
    }

    public DescribeLoadBalancerRegionsResponse describeLoadBalancerRegions(DescribeLoadBalancerRegionsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeLoadBalancerRegions",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeLoadBalancerRegionsResponse());
    }

    public RegisterBackendResponse registerBackend(RegisterBackendRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "RegisterBackend",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new RegisterBackendResponse());
    }

    public DeregisterBackendResponse deregisterBackend(DeregisterBackendRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeregisterBackend",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeregisterBackendResponse());
    }

    public ModifyBackendResponse modifyBackend(ModifyBackendRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyBackend",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyBackendResponse());
    }

    public DescribeBackendsResponse describeBackends(DescribeBackendsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeBackends",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeBackendsResponse());
    }

    public ModifyLoadBalancersAttributeResponse modifyLoadBalancersAttribute(ModifyLoadBalancersAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyLoadBalancersAttribute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyLoadBalancersAttributeResponse());
    }

    public DescribeLoadBalancersResponse describeLoadBalancers(DescribeLoadBalancersRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeLoadBalancers",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeLoadBalancersResponse());
    }

    public RestoreLoadBalancerResponse restoreLoadBalancer(RestoreLoadBalancerRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "RestoreLoadBalancer",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new RestoreLoadBalancerResponse());
    }

    public TerminateLoadBalancerResponse terminateLoadBalancer(TerminateLoadBalancerRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "TerminateLoadBalancer",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new TerminateLoadBalancerResponse());
    }

    public CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateLoadBalancer",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateLoadBalancerResponse());
    }

    public InquiryPriceCreateLoadBalancerResponse inquiryPriceCreateLoadBalancer(InquiryPriceCreateLoadBalancerRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "InquiryPriceCreateLoadBalancer",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new InquiryPriceCreateLoadBalancerResponse());
    }

}