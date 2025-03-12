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
import com.zenlayercloud.zec20240401.models.AssignNicIpv4Request;
import com.zenlayercloud.zec20240401.models.AssignNicIpv4Response;
import com.zenlayercloud.zec20240401.models.AssignNicIpv6Request;
import com.zenlayercloud.zec20240401.models.AssignNicIpv6Response;
import com.zenlayercloud.zec20240401.models.AssignSecurityGroupVpcRequest;
import com.zenlayercloud.zec20240401.models.AssignSecurityGroupVpcResponse;
import com.zenlayercloud.zec20240401.models.AttachDisksRequest;
import com.zenlayercloud.zec20240401.models.AttachDisksResponse;
import com.zenlayercloud.zec20240401.models.AttachNicRequest;
import com.zenlayercloud.zec20240401.models.AttachNicResponse;
import com.zenlayercloud.zec20240401.models.AvailableLanIpRequest;
import com.zenlayercloud.zec20240401.models.AvailableLanIpResponse;
import com.zenlayercloud.zec20240401.models.BatchAssignNicIpv4Request;
import com.zenlayercloud.zec20240401.models.BatchAssignNicIpv4Response;
import com.zenlayercloud.zec20240401.models.BatchAttachEipLanIpRequest;
import com.zenlayercloud.zec20240401.models.BatchAttachEipLanIpResponse;
import com.zenlayercloud.zec20240401.models.ChangeDisksAttachRequest;
import com.zenlayercloud.zec20240401.models.ChangeDisksAttachResponse;
import com.zenlayercloud.zec20240401.models.ChangeEipInternetChargeTypeRequest;
import com.zenlayercloud.zec20240401.models.ChangeEipInternetChargeTypeResponse;
import com.zenlayercloud.zec20240401.models.ChangeNicNetworkTypeRequest;
import com.zenlayercloud.zec20240401.models.ChangeNicNetworkTypeResponse;
import com.zenlayercloud.zec20240401.models.ConfigEipEgressIpRequest;
import com.zenlayercloud.zec20240401.models.ConfigEipEgressIpResponse;
import com.zenlayercloud.zec20240401.models.ConfigureSecurityGroupRulesRequest;
import com.zenlayercloud.zec20240401.models.ConfigureSecurityGroupRulesResponse;
import com.zenlayercloud.zec20240401.models.CreateCidrRequest;
import com.zenlayercloud.zec20240401.models.CreateCidrResponse;
import com.zenlayercloud.zec20240401.models.CreateDisksRequest;
import com.zenlayercloud.zec20240401.models.CreateDisksResponse;
import com.zenlayercloud.zec20240401.models.CreateEipsRequest;
import com.zenlayercloud.zec20240401.models.CreateEipsResponse;
import com.zenlayercloud.zec20240401.models.CreateInstancesRequest;
import com.zenlayercloud.zec20240401.models.CreateInstancesResponse;
import com.zenlayercloud.zec20240401.models.CreateNicRequest;
import com.zenlayercloud.zec20240401.models.CreateNicResponse;
import com.zenlayercloud.zec20240401.models.CreateRouteRequest;
import com.zenlayercloud.zec20240401.models.CreateRouteResponse;
import com.zenlayercloud.zec20240401.models.CreateSecurityGroupRequest;
import com.zenlayercloud.zec20240401.models.CreateSecurityGroupResponse;
import com.zenlayercloud.zec20240401.models.CreateSubnetRequest;
import com.zenlayercloud.zec20240401.models.CreateSubnetResponse;
import com.zenlayercloud.zec20240401.models.CreateVpcRequest;
import com.zenlayercloud.zec20240401.models.CreateVpcResponse;
import com.zenlayercloud.zec20240401.models.CreateZecInstancesRequest;
import com.zenlayercloud.zec20240401.models.CreateZecInstancesResponse;
import com.zenlayercloud.zec20240401.models.DeleteCidrRequest;
import com.zenlayercloud.zec20240401.models.DeleteCidrResponse;
import com.zenlayercloud.zec20240401.models.DeleteEipRequest;
import com.zenlayercloud.zec20240401.models.DeleteEipResponse;
import com.zenlayercloud.zec20240401.models.DeleteNicRequest;
import com.zenlayercloud.zec20240401.models.DeleteNicResponse;
import com.zenlayercloud.zec20240401.models.DeleteRouteRequest;
import com.zenlayercloud.zec20240401.models.DeleteRouteResponse;
import com.zenlayercloud.zec20240401.models.DeleteSecurityGroupRequest;
import com.zenlayercloud.zec20240401.models.DeleteSecurityGroupResponse;
import com.zenlayercloud.zec20240401.models.DeleteSubnetRequest;
import com.zenlayercloud.zec20240401.models.DeleteSubnetResponse;
import com.zenlayercloud.zec20240401.models.DeleteVpcRequest;
import com.zenlayercloud.zec20240401.models.DeleteVpcResponse;
import com.zenlayercloud.zec20240401.models.DescribeCidrPriceRequest;
import com.zenlayercloud.zec20240401.models.DescribeCidrPriceResponse;
import com.zenlayercloud.zec20240401.models.DescribeCidrRegionsRequest;
import com.zenlayercloud.zec20240401.models.DescribeCidrRegionsResponse;
import com.zenlayercloud.zec20240401.models.DescribeCidrsRequest;
import com.zenlayercloud.zec20240401.models.DescribeCidrsResponse;
import com.zenlayercloud.zec20240401.models.DescribeDiskCategoryRequest;
import com.zenlayercloud.zec20240401.models.DescribeDiskCategoryResponse;
import com.zenlayercloud.zec20240401.models.DescribeDiskRegionsRequest;
import com.zenlayercloud.zec20240401.models.DescribeDiskRegionsResponse;
import com.zenlayercloud.zec20240401.models.DescribeDisksRequest;
import com.zenlayercloud.zec20240401.models.DescribeDisksResponse;
import com.zenlayercloud.zec20240401.models.DescribeEipInternetChargeTypesRequest;
import com.zenlayercloud.zec20240401.models.DescribeEipInternetChargeTypesResponse;
import com.zenlayercloud.zec20240401.models.DescribeEipPriceRequest;
import com.zenlayercloud.zec20240401.models.DescribeEipPriceResponse;
import com.zenlayercloud.zec20240401.models.DescribeEipRegionsRequest;
import com.zenlayercloud.zec20240401.models.DescribeEipRegionsResponse;
import com.zenlayercloud.zec20240401.models.DescribeEipTrafficRequest;
import com.zenlayercloud.zec20240401.models.DescribeEipTrafficResponse;
import com.zenlayercloud.zec20240401.models.DescribeEipsRequest;
import com.zenlayercloud.zec20240401.models.DescribeEipsResponse;
import com.zenlayercloud.zec20240401.models.DescribeImagesRequest;
import com.zenlayercloud.zec20240401.models.DescribeImagesResponse;
import com.zenlayercloud.zec20240401.models.DescribeInstanceMonitorDataRequest;
import com.zenlayercloud.zec20240401.models.DescribeInstanceMonitorDataResponse;
import com.zenlayercloud.zec20240401.models.DescribeInstancesRequest;
import com.zenlayercloud.zec20240401.models.DescribeInstancesResponse;
import com.zenlayercloud.zec20240401.models.DescribeInstancesStatusRequest;
import com.zenlayercloud.zec20240401.models.DescribeInstancesStatusResponse;
import com.zenlayercloud.zec20240401.models.DescribeKeyPairsRequest;
import com.zenlayercloud.zec20240401.models.DescribeKeyPairsResponse;
import com.zenlayercloud.zec20240401.models.DescribeNicRegionsRequest;
import com.zenlayercloud.zec20240401.models.DescribeNicRegionsResponse;
import com.zenlayercloud.zec20240401.models.DescribeNicsRequest;
import com.zenlayercloud.zec20240401.models.DescribeNicsResponse;
import com.zenlayercloud.zec20240401.models.DescribePoolsRequest;
import com.zenlayercloud.zec20240401.models.DescribePoolsResponse;
import com.zenlayercloud.zec20240401.models.DescribeRoutesRequest;
import com.zenlayercloud.zec20240401.models.DescribeRoutesResponse;
import com.zenlayercloud.zec20240401.models.DescribeSecurityGroupRuleRequest;
import com.zenlayercloud.zec20240401.models.DescribeSecurityGroupRuleResponse;
import com.zenlayercloud.zec20240401.models.DescribeSecurityGroupsRequest;
import com.zenlayercloud.zec20240401.models.DescribeSecurityGroupsResponse;
import com.zenlayercloud.zec20240401.models.DescribeSubnetRegionsRequest;
import com.zenlayercloud.zec20240401.models.DescribeSubnetRegionsResponse;
import com.zenlayercloud.zec20240401.models.DescribeSubnetsRequest;
import com.zenlayercloud.zec20240401.models.DescribeSubnetsResponse;
import com.zenlayercloud.zec20240401.models.DescribeTimeZonesRequest;
import com.zenlayercloud.zec20240401.models.DescribeTimeZonesResponse;
import com.zenlayercloud.zec20240401.models.DescribeVncUrlRequest;
import com.zenlayercloud.zec20240401.models.DescribeVncUrlResponse;
import com.zenlayercloud.zec20240401.models.DescribeVpcsRequest;
import com.zenlayercloud.zec20240401.models.DescribeVpcsResponse;
import com.zenlayercloud.zec20240401.models.DescribeZoneInstanceConfigInfosRequest;
import com.zenlayercloud.zec20240401.models.DescribeZoneInstanceConfigInfosResponse;
import com.zenlayercloud.zec20240401.models.DescribeZonesRequest;
import com.zenlayercloud.zec20240401.models.DescribeZonesResponse;
import com.zenlayercloud.zec20240401.models.DetachDisksRequest;
import com.zenlayercloud.zec20240401.models.DetachDisksResponse;
import com.zenlayercloud.zec20240401.models.DetachEipLanIpRequest;
import com.zenlayercloud.zec20240401.models.DetachEipLanIpResponse;
import com.zenlayercloud.zec20240401.models.DetachNicRequest;
import com.zenlayercloud.zec20240401.models.DetachNicResponse;
import com.zenlayercloud.zec20240401.models.InquiryPriceCreateDisksRequest;
import com.zenlayercloud.zec20240401.models.InquiryPriceCreateDisksResponse;
import com.zenlayercloud.zec20240401.models.InquiryPriceCreateInstanceRequest;
import com.zenlayercloud.zec20240401.models.InquiryPriceCreateInstanceResponse;
import com.zenlayercloud.zec20240401.models.InquiryPricePublicIpv6Request;
import com.zenlayercloud.zec20240401.models.InquiryPricePublicIpv6Response;
import com.zenlayercloud.zec20240401.models.ModifyDisksAttributesRequest;
import com.zenlayercloud.zec20240401.models.ModifyDisksAttributesResponse;
import com.zenlayercloud.zec20240401.models.ModifyDisksResourceGroupRequest;
import com.zenlayercloud.zec20240401.models.ModifyDisksResourceGroupResponse;
import com.zenlayercloud.zec20240401.models.ModifyInstanceTypeRequest;
import com.zenlayercloud.zec20240401.models.ModifyInstanceTypeResponse;
import com.zenlayercloud.zec20240401.models.ModifyInstancesAttributeRequest;
import com.zenlayercloud.zec20240401.models.ModifyInstancesAttributeResponse;
import com.zenlayercloud.zec20240401.models.ModifyInstancesResourceGroupRequest;
import com.zenlayercloud.zec20240401.models.ModifyInstancesResourceGroupResponse;
import com.zenlayercloud.zec20240401.models.ModifyNicsAttributeRequest;
import com.zenlayercloud.zec20240401.models.ModifyNicsAttributeResponse;
import com.zenlayercloud.zec20240401.models.ModifySecurityGroupsAttributeRequest;
import com.zenlayercloud.zec20240401.models.ModifySecurityGroupsAttributeResponse;
import com.zenlayercloud.zec20240401.models.ModifySubnetStackTypeRequest;
import com.zenlayercloud.zec20240401.models.ModifySubnetStackTypeResponse;
import com.zenlayercloud.zec20240401.models.ModifySubnetsAttributeRequest;
import com.zenlayercloud.zec20240401.models.ModifySubnetsAttributeResponse;
import com.zenlayercloud.zec20240401.models.ModifyVpcsAttributeRequest;
import com.zenlayercloud.zec20240401.models.ModifyVpcsAttributeResponse;
import com.zenlayercloud.zec20240401.models.RebootInstancesRequest;
import com.zenlayercloud.zec20240401.models.RebootInstancesResponse;
import com.zenlayercloud.zec20240401.models.ReleaseDiskRequest;
import com.zenlayercloud.zec20240401.models.ReleaseDiskResponse;
import com.zenlayercloud.zec20240401.models.ReleaseInstancesRequest;
import com.zenlayercloud.zec20240401.models.ReleaseInstancesResponse;
import com.zenlayercloud.zec20240401.models.RenewCidrRequest;
import com.zenlayercloud.zec20240401.models.RenewCidrResponse;
import com.zenlayercloud.zec20240401.models.RenewDiskRequest;
import com.zenlayercloud.zec20240401.models.RenewDiskResponse;
import com.zenlayercloud.zec20240401.models.RenewEipRequest;
import com.zenlayercloud.zec20240401.models.RenewEipResponse;
import com.zenlayercloud.zec20240401.models.ResetInstancePasswordRequest;
import com.zenlayercloud.zec20240401.models.ResetInstancePasswordResponse;
import com.zenlayercloud.zec20240401.models.ResetInstanceRequest;
import com.zenlayercloud.zec20240401.models.ResetInstanceResponse;
import com.zenlayercloud.zec20240401.models.StartAgentMonitorRequest;
import com.zenlayercloud.zec20240401.models.StartAgentMonitorResponse;
import com.zenlayercloud.zec20240401.models.StartInstancesRequest;
import com.zenlayercloud.zec20240401.models.StartInstancesResponse;
import com.zenlayercloud.zec20240401.models.StartIpForwardRequest;
import com.zenlayercloud.zec20240401.models.StartIpForwardResponse;
import com.zenlayercloud.zec20240401.models.StopAgentMonitorRequest;
import com.zenlayercloud.zec20240401.models.StopAgentMonitorResponse;
import com.zenlayercloud.zec20240401.models.StopInstancesRequest;
import com.zenlayercloud.zec20240401.models.StopInstancesResponse;
import com.zenlayercloud.zec20240401.models.StopIpForwardRequest;
import com.zenlayercloud.zec20240401.models.StopIpForwardResponse;
import com.zenlayercloud.zec20240401.models.TerminateDiskRequest;
import com.zenlayercloud.zec20240401.models.TerminateDiskResponse;
import com.zenlayercloud.zec20240401.models.UnAssignNicIpv4Request;
import com.zenlayercloud.zec20240401.models.UnAssignNicIpv4Response;
import com.zenlayercloud.zec20240401.models.UnAssignSecurityGroupVpcRequest;
import com.zenlayercloud.zec20240401.models.UnAssignSecurityGroupVpcResponse;

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

    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeInstances", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeInstancesResponse());
    }

    public DescribeInstancesStatusResponse describeInstancesStatus(DescribeInstancesStatusRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeInstancesStatus", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeInstancesStatusResponse());
    }

    public ModifyInstancesResourceGroupResponse modifyInstancesResourceGroup(ModifyInstancesResourceGroupRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyInstancesResourceGroup", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyInstancesResourceGroupResponse());
    }

    public ModifyInstancesAttributeResponse modifyInstancesAttribute(ModifyInstancesAttributeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyInstancesAttribute", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyInstancesAttributeResponse());
    }

    public StartInstancesResponse startInstances(StartInstancesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "StartInstances", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new StartInstancesResponse());
    }

    public StopInstancesResponse stopInstances(StopInstancesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "StopInstances", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new StopInstancesResponse());
    }

    public RebootInstancesResponse rebootInstances(RebootInstancesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "RebootInstances", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new RebootInstancesResponse());
    }

    public ResetInstancePasswordResponse resetInstancePassword(ResetInstancePasswordRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ResetInstancePassword", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ResetInstancePasswordResponse());
    }

    public ResetInstanceResponse resetInstance(ResetInstanceRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ResetInstance", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ResetInstanceResponse());
    }

    public ReleaseInstancesResponse releaseInstances(ReleaseInstancesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ReleaseInstances", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ReleaseInstancesResponse());
    }

    public ModifyInstanceTypeResponse modifyInstanceType(ModifyInstanceTypeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyInstanceType", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyInstanceTypeResponse());
    }

    public DescribeTimeZonesResponse describeTimeZones(DescribeTimeZonesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeTimeZones", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeTimeZonesResponse());
    }

    public StartIpForwardResponse startIpForward(StartIpForwardRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "StartIpForward", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new StartIpForwardResponse());
    }

    public StopIpForwardResponse stopIpForward(StopIpForwardRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "StopIpForward", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new StopIpForwardResponse());
    }

    public StartAgentMonitorResponse startAgentMonitor(StartAgentMonitorRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "StartAgentMonitor", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new StartAgentMonitorResponse());
    }

    public StopAgentMonitorResponse stopAgentMonitor(StopAgentMonitorRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "StopAgentMonitor", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new StopAgentMonitorResponse());
    }

    public DescribeVncUrlResponse describeVncUrl(DescribeVncUrlRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeVncUrl", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeVncUrlResponse());
    }

    public ChangeNicNetworkTypeResponse changeNicNetworkType(ChangeNicNetworkTypeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ChangeNicNetworkType", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ChangeNicNetworkTypeResponse());
    }

    public DescribeCidrsResponse describeCidrs(DescribeCidrsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeCidrs", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeCidrsResponse());
    }

    public DescribePoolsResponse describePools(DescribePoolsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribePools", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribePoolsResponse());
    }

    public DescribeCidrRegionsResponse describeCidrRegions(DescribeCidrRegionsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeCidrRegions", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeCidrRegionsResponse());
    }

    public DescribeCidrPriceResponse describeCidrPrice(DescribeCidrPriceRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeCidrPrice", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeCidrPriceResponse());
    }

    public CreateCidrResponse createCidr(CreateCidrRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateCidr", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateCidrResponse());
    }

    public DeleteCidrResponse deleteCidr(DeleteCidrRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeleteCidr", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DeleteCidrResponse());
    }

    public RenewCidrResponse renewCidr(RenewCidrRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "RenewCidr", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new RenewCidrResponse());
    }

    public AvailableLanIpResponse availableLanIp(AvailableLanIpRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AvailableLanIp", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AvailableLanIpResponse());
    }

    public DescribeDiskRegionsResponse describeDiskRegions(DescribeDiskRegionsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeDiskRegions", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeDiskRegionsResponse());
    }

    public CreateDisksResponse createDisks(CreateDisksRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateDisks", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateDisksResponse());
    }

    public DescribeDisksResponse describeDisks(DescribeDisksRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeDisks", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeDisksResponse());
    }

    public AttachDisksResponse attachDisks(AttachDisksRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AttachDisks", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AttachDisksResponse());
    }

    public ChangeDisksAttachResponse changeDisksAttach(ChangeDisksAttachRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ChangeDisksAttach", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ChangeDisksAttachResponse());
    }

    public DetachDisksResponse detachDisks(DetachDisksRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DetachDisks", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DetachDisksResponse());
    }

    public ModifyDisksAttributesResponse modifyDisksAttributes(ModifyDisksAttributesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyDisksAttributes", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyDisksAttributesResponse());
    }

    public InquiryPriceCreateDisksResponse inquiryPriceCreateDisks(InquiryPriceCreateDisksRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "InquiryPriceCreateDisks", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new InquiryPriceCreateDisksResponse());
    }

    public TerminateDiskResponse terminateDisk(TerminateDiskRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "TerminateDisk", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new TerminateDiskResponse());
    }

    public ReleaseDiskResponse releaseDisk(ReleaseDiskRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ReleaseDisk", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ReleaseDiskResponse());
    }

    public RenewDiskResponse renewDisk(RenewDiskRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "RenewDisk", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new RenewDiskResponse());
    }

    public ModifyDisksResourceGroupResponse modifyDisksResourceGroup(ModifyDisksResourceGroupRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyDisksResourceGroup", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyDisksResourceGroupResponse());
    }

    public DescribeDiskCategoryResponse describeDiskCategory(DescribeDiskCategoryRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeDiskCategory", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeDiskCategoryResponse());
    }

    public DescribeSecurityGroupsResponse describeSecurityGroups(DescribeSecurityGroupsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeSecurityGroups", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeSecurityGroupsResponse());
    }

    public ModifySecurityGroupsAttributeResponse modifySecurityGroupsAttribute(ModifySecurityGroupsAttributeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifySecurityGroupsAttribute", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifySecurityGroupsAttributeResponse());
    }

    public DescribeSecurityGroupRuleResponse describeSecurityGroupRule(DescribeSecurityGroupRuleRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeSecurityGroupRule", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeSecurityGroupRuleResponse());
    }

    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateSecurityGroup", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateSecurityGroupResponse());
    }

    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeleteSecurityGroup", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DeleteSecurityGroupResponse());
    }

    public ConfigureSecurityGroupRulesResponse configureSecurityGroupRules(ConfigureSecurityGroupRulesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ConfigureSecurityGroupRules", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ConfigureSecurityGroupRulesResponse());
    }

    public AssignSecurityGroupVpcResponse assignSecurityGroupVpc(AssignSecurityGroupVpcRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AssignSecurityGroupVpc", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AssignSecurityGroupVpcResponse());
    }

    public UnAssignSecurityGroupVpcResponse unAssignSecurityGroupVpc(UnAssignSecurityGroupVpcRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "UnAssignSecurityGroupVpc", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new UnAssignSecurityGroupVpcResponse());
    }

    public DescribeNicsResponse describeNetworkInterfaces(DescribeNicsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeNetworkInterfaces", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeNicsResponse());
    }

    public ModifyNicsAttributeResponse modifyNetworkInterfacesAttribute(ModifyNicsAttributeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyNetworkInterfacesAttribute", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyNicsAttributeResponse());
    }

    public CreateNicResponse createNetworkInterface(CreateNicRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateNetworkInterface", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateNicResponse());
    }

    public DeleteNicResponse deleteNetworkInterface(DeleteNicRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeleteNetworkInterface", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DeleteNicResponse());
    }

    public AttachNicResponse attachNetworkInterface(AttachNicRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AttachNetworkInterface", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AttachNicResponse());
    }

    public AssignNicIpv6Response assignNetworkInterfaceIpv6(AssignNicIpv6Request request) {
        Map<String, ?> rspStr = super.callApi(request, "AssignNetworkInterfaceIpv6", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AssignNicIpv6Response());
    }

    public UnAssignNicIpv4Response unassignNetworkInterfaceIpv4(UnAssignNicIpv4Request request) {
        Map<String, ?> rspStr = super.callApi(request, "UnassignNetworkInterfaceIpv4", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new UnAssignNicIpv4Response());
    }

    public AssignNicIpv4Response assignNetworkInterfaceIpv4(AssignNicIpv4Request request) {
        Map<String, ?> rspStr = super.callApi(request, "AssignNetworkInterfaceIpv4", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AssignNicIpv4Response());
    }

    public BatchAssignNicIpv4Response batchAssignNetworkInterfaceIpv4(BatchAssignNicIpv4Request request) {
        Map<String, ?> rspStr = super.callApi(request, "BatchAssignNetworkInterfaceIpv4", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new BatchAssignNicIpv4Response());
    }

    public DetachNicResponse detachNetworkInterface(DetachNicRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DetachNetworkInterface", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DetachNicResponse());
    }

    public DescribeNicRegionsResponse describeNetworkInterfaceRegions(DescribeNicRegionsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeNetworkInterfaceRegions", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeNicRegionsResponse());
    }

    public InquiryPricePublicIpv6Response inquiryPricePublicIpv6(InquiryPricePublicIpv6Request request) {
        Map<String, ?> rspStr = super.callApi(request, "InquiryPricePublicIpv6", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new InquiryPricePublicIpv6Response());
    }

    public CreateZecInstancesResponse createZecInstances(CreateZecInstancesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateZecInstances", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateZecInstancesResponse());
    }

    public CreateInstancesResponse createInstances(CreateInstancesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateInstances", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateInstancesResponse());
    }

    public DescribeZoneInstanceConfigInfosResponse describeZoneInstanceConfigInfos(DescribeZoneInstanceConfigInfosRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeZoneInstanceConfigInfos", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeZoneInstanceConfigInfosResponse());
    }

    public DescribeZonesResponse describeZones(DescribeZonesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeZones", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeZonesResponse());
    }

    public DescribeImagesResponse describeImages(DescribeImagesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeImages", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeImagesResponse());
    }

    public DescribeKeyPairsResponse describeKeyPairs(DescribeKeyPairsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeKeyPairs", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeKeyPairsResponse());
    }

    public DescribeEipRegionsResponse describeEipRegions(DescribeEipRegionsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeEipRegions", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeEipRegionsResponse());
    }

    public DescribeEipInternetChargeTypesResponse describeEipInternetChargeTypes(DescribeEipInternetChargeTypesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeEipInternetChargeTypes", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeEipInternetChargeTypesResponse());
    }

    public DescribeEipsResponse describeEips(DescribeEipsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeEips", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeEipsResponse());
    }

    public CreateEipsResponse createEips(CreateEipsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateEips", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateEipsResponse());
    }

    public DeleteEipResponse deleteEip(DeleteEipRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeleteEip", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DeleteEipResponse());
    }

    public RenewEipResponse renewEip(RenewEipRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "RenewEip", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new RenewEipResponse());
    }

    public BatchAttachEipLanIpResponse batchAttachEipLanIp(BatchAttachEipLanIpRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "BatchAttachEipLanIp", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new BatchAttachEipLanIpResponse());
    }

    public DetachEipLanIpResponse detachEipLanIp(DetachEipLanIpRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DetachEipLanIp", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DetachEipLanIpResponse());
    }

    public ConfigEipEgressIpResponse configEipEgressIp(ConfigEipEgressIpRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ConfigEipEgressIp", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ConfigEipEgressIpResponse());
    }

    public DescribeEipPriceResponse describeEipPrice(DescribeEipPriceRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeEipPrice", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeEipPriceResponse());
    }

    public ChangeEipInternetChargeTypeResponse changeEipInternetChargeType(ChangeEipInternetChargeTypeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ChangeEipInternetChargeType", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ChangeEipInternetChargeTypeResponse());
    }

    public InquiryPriceCreateInstanceResponse inquiryPriceCreateInstance(InquiryPriceCreateInstanceRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "InquiryPriceCreateInstance", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new InquiryPriceCreateInstanceResponse());
    }

    public DescribeEipTrafficResponse describeEipTraffic(DescribeEipTrafficRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeEipTraffic", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeEipTrafficResponse());
    }
}
