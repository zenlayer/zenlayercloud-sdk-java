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
import com.zenlayercloud.zec20240401.models.AttachDisksRequest;
import com.zenlayercloud.zec20240401.models.AttachDisksResponse;
import com.zenlayercloud.zec20240401.models.ChangeDisksAttachRequest;
import com.zenlayercloud.zec20240401.models.ChangeDisksAttachResponse;
import com.zenlayercloud.zec20240401.models.CreateDisksRequest;
import com.zenlayercloud.zec20240401.models.CreateDisksResponse;
import com.zenlayercloud.zec20240401.models.CreateSubnetRequest;
import com.zenlayercloud.zec20240401.models.CreateSubnetResponse;
import com.zenlayercloud.zec20240401.models.CreateVpcRequest;
import com.zenlayercloud.zec20240401.models.CreateVpcResponse;
import com.zenlayercloud.zec20240401.models.DeleteSubnetRequest;
import com.zenlayercloud.zec20240401.models.DeleteSubnetResponse;
import com.zenlayercloud.zec20240401.models.DeleteVpcRequest;
import com.zenlayercloud.zec20240401.models.DeleteVpcResponse;
import com.zenlayercloud.zec20240401.models.DescribeDiskCategoryRequest;
import com.zenlayercloud.zec20240401.models.DescribeDiskCategoryResponse;
import com.zenlayercloud.zec20240401.models.DescribeDisksRequest;
import com.zenlayercloud.zec20240401.models.DescribeDisksResponse;
import com.zenlayercloud.zec20240401.models.DescribeInstancesStatusRequest;
import com.zenlayercloud.zec20240401.models.DescribeInstancesStatusResponse;
import com.zenlayercloud.zec20240401.models.DescribeSubnetsRequest;
import com.zenlayercloud.zec20240401.models.DescribeSubnetsResponse;
import com.zenlayercloud.zec20240401.models.DescribeVpcsRequest;
import com.zenlayercloud.zec20240401.models.DescribeVpcsResponse;
import com.zenlayercloud.zec20240401.models.DetachDisksRequest;
import com.zenlayercloud.zec20240401.models.DetachDisksResponse;
import com.zenlayercloud.zec20240401.models.InquiryPriceCreateDisksRequest;
import com.zenlayercloud.zec20240401.models.InquiryPriceCreateDisksResponse;
import com.zenlayercloud.zec20240401.models.ModifyDisksAttributesRequest;
import com.zenlayercloud.zec20240401.models.ModifyDisksAttributesResponse;
import com.zenlayercloud.zec20240401.models.ModifyInstancesAttributeRequest;
import com.zenlayercloud.zec20240401.models.ModifyInstancesAttributeResponse;
import com.zenlayercloud.zec20240401.models.ModifyInstancesResourceGroupRequest;
import com.zenlayercloud.zec20240401.models.ModifyInstancesResourceGroupResponse;
import com.zenlayercloud.zec20240401.models.ModifySubnetsAttributeRequest;
import com.zenlayercloud.zec20240401.models.ModifySubnetsAttributeResponse;
import com.zenlayercloud.zec20240401.models.ModifyVpcsAttributeRequest;
import com.zenlayercloud.zec20240401.models.ModifyVpcsAttributeResponse;
import com.zenlayercloud.zec20240401.models.RebootInstancesRequest;
import com.zenlayercloud.zec20240401.models.RebootInstancesResponse;
import com.zenlayercloud.zec20240401.models.ResetInstanceRequest;
import com.zenlayercloud.zec20240401.models.ResetInstanceResponse;
import com.zenlayercloud.zec20240401.models.ResetInstancesPasswordRequest;
import com.zenlayercloud.zec20240401.models.ResetInstancesPasswordResponse;
import com.zenlayercloud.zec20240401.models.StartInstancesRequest;
import com.zenlayercloud.zec20240401.models.StartInstancesResponse;
import com.zenlayercloud.zec20240401.models.StopInstancesRequest;
import com.zenlayercloud.zec20240401.models.StopInstancesResponse;

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

    public RebootInstancesResponse rebootInstances(RebootInstancesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "RebootInstances", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new RebootInstancesResponse());
    }

    public ResetInstanceResponse resetInstance(ResetInstanceRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ResetInstance", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ResetInstanceResponse());
    }

    public ResetInstancesPasswordResponse resetInstancesPassword(ResetInstancesPasswordRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ResetInstancesPassword", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ResetInstancesPasswordResponse());
    }

    public StartInstancesResponse startInstances(StartInstancesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "StartInstances", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new StartInstancesResponse());
    }

    public StopInstancesResponse stopInstances(StopInstancesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "StopInstances", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new StopInstancesResponse());
    }


    public DescribeCidrsResponse describeCidrs(DescribeCidrsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeCidrs", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeCidrsResponse());
    }

    public DescribeCidrRegionsResponse describeCidrRegions(DescribeCidrRegionsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeCidrRegions", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeCidrRegionsResponse());
    }

    public DescribeOwnCidrPriceResponse describeOwnCidrPrice(DescribeOwnCidrPriceRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeOwnCidrPrice", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeOwnCidrPriceResponse());
    }

    public DescribeCidrPriceResponse describeCidrPrice(DescribeCidrPriceRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeCidrPrice", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeCidrPriceResponse());
    }

    public DescribeCidrUsedIpsResponse describeCidrUsedIps(DescribeCidrUsedIpsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeCidrUsedIps", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeCidrUsedIpsResponse());
    }

    public CreateOwnCidrResponse createOwnCidr(CreateOwnCidrRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateOwnCidr", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateOwnCidrResponse());
    }

    public CreateCidrResponse createCidr(CreateCidrRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateCidr", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateCidrResponse());
    }

    public DeleteCidrResponse deleteCidr(SingleCidrRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeleteCidr", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DeleteCidrResponse());
    }

    public RenewCidrResponse renewCidr(SingleCidrRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "RenewCidr", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new RenewCidrResponse());
    }

    public UnAssignCidrIpResponse unAssignCidrIp(UnAssignCidrIpRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "UnAssignCidrIp", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new UnAssignCidrIpResponse());
    }

    public AssignCidrIpResponse assignCidrIp(AssignCidrIpRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AssignCidrIp", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AssignCidrIpResponse());
    }

    public BatchAssignCidrIpResponse batchAssignCidrIp(BatchAssignCidrIpRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "BatchAssignCidrIp", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new BatchAssignCidrIpResponse());
    }

    public AvailableCidrIpResponse availableCidrIp(AvailableCidrIpRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AvailableCidrIp", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AvailableCidrIpResponse());
    }

    public ConfigEgressIpResponse configEgressIp(ConfigEgressIpRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ConfigEgressIp", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ConfigEgressIpResponse());
    }

    public DescribeOwnCidrsResponse describeOwnCidrs(DescribeOwnCidrsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeOwnCidrs", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeOwnCidrsResponse());
    }

    public AvailableLanIpResponse availableLanIp(SingleCidrRequest request) {
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
}
