/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zec20240401;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;
import com.zenlayercloud.zec20240401.models.*;

import java.util.Map;

/**
 * @author wolfgang
 * @version $ Id: ZecClient.java, v 0.1  wolfang Exp $
 * @date 2024-04-01 12:12:01
 */
public class ZecClient extends AbstractClient {

    private static final String VERSION  = "2024-04-01";
    private static final String endpoint = "console.zenlayer.com";
    private static final String path     = "/api/v2/zec";

    public ZecClient(Credential credential, Config config) {
        super(credential, config, Common.isUnset(config.endpoint) ? endpoint : config.endpoint, VERSION, path);
    }

    public ZecClient(Credential credential) {
        this(credential, new Config());
    }

    public DescribeInstanceMonitorDataResponse describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeInstanceMonitorData", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DescribeInstanceMonitorDataResponse());
    }

    public CreateVpcResponse createVpc(CreateVpcRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateVpc", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateVpcResponse());
    }

    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeleteVpc", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DeleteVpcResponse());
    }

    public ModifyVpcsAttributeResponse modifyVpcsAttribute(ModifyVpcsAttributeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyVpcsAttribute", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyVpcsAttributeResponse());
    }

    public DescribeVpcsResponse describeVpcs(DescribeVpcsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeVpcs", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeVpcsResponse());
    }

    public DescribeSubnetRegionsResponse describeSubnetRegions(DescribeSubnetRegionsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeSubnetRegions", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeSubnetRegionsResponse());
    }

    public CreateSubnetResponse createSubnet(CreateSubnetRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateSubnet", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateSubnetResponse());
    }

    public DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeleteSubnet", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DeleteSubnetResponse());
    }

    public ModifySubnetsAttributeResponse modifySubnetsAttribute(ModifySubnetsAttributeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifySubnetsAttribute", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifySubnetsAttributeResponse());
    }

    public DescribeSubnetsResponse describeSubnets(DescribeSubnetsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeSubnets", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeSubnetsResponse());
    }

    public ModifySubnetStackTypeResponse modifySubnetStackType(ModifySubnetStackTypeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifySubnetStackType", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifySubnetStackTypeResponse());
    }

    public CreateRouteResponse createRoute(CreateRouteRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateRoute", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateRouteResponse());
    }

    public DeleteRouteResponse deleteRoute(DeleteRouteRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeleteRoute", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DeleteRouteResponse());
    }

    public DescribeRoutesResponse describeRoutes(DescribeRoutesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeRoutes", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeRoutesResponse());
    }
}
