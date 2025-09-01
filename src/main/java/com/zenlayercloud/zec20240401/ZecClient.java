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
import com.zenlayercloud.zec20240401.models.ResetInstancePasswordRequest;
import com.zenlayercloud.zec20240401.models.ResetInstancePasswordResponse;

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

    /**
     * 修改子网属性。
     * 包括名称，CIDR等。

     */
    public ModifySubnetAttributeResponse modifySubnetAttribute(ModifySubnetAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
                request,
                "ModifySubnetAttribute",
                new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifySubnetAttributeResponse());
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

    public ReleaseDiskResponse releaseDisk(ReleaseDiskRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ReleaseDisk", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ReleaseDiskResponse());
    }

    public RenewDiskResponse renewDisk(RenewDiskRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "RenewDisk", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new RenewDiskResponse());
    }

    /**
     * 将一个云硬盘扩容到指定大小。

     */
    public ResizeDiskResponse resizeDisk(ResizeDiskRequest request) {
        Map<String, ?> rsp = super.callApi(request, "ResizeDisk", new RuntimeOptions());
        return TeaModel.toModel(rsp, new ResizeDiskResponse());
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

    public DescribeEipRemoteRegionsResponse describeEipRemoteRegions(DescribeEipRemoteRegionsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeEipRemoteRegions", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeEipRemoteRegionsResponse());
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


    /**
     * 修改弹性公网IP属性。

     */
    public ModifyEipAttributeResponse modifyEipAttribute(ModifyEipAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
                request,
                "ModifyEipAttribute",
                new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyEipAttributeResponse());
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

    public AssociateEipAddressResponse associateEipAddress(AssociateEipAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AssociateEipAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AssociateEipAddressResponse());
    }


    /**
     * 弹性公网IP（EIP）更换绑定模式。

     */
    public ChangeEipBindTypeResponse changeEipBindType(ChangeEipBindTypeRequest request) {
        Map<String, ?> rsp = super.callApi(request, "ChangeEipBindType", new RuntimeOptions());
        return TeaModel.toModel(rsp, new ChangeEipBindTypeResponse());
    }

    public UnAssociateEipAddressResponse unAssociateEipAddress(UnassociateEipAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "UnassociateEipAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new UnAssociateEipAddressResponse());
    }

    public ReplaceEipAddressResponse replaceEipAddress(ReplaceEipAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ReplaceEipAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ReplaceEipAddressResponse());
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

    public CreateBorderGatewayResponse createBorderGateway(CreateBorderGatewayRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateBorderGateway", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateBorderGatewayResponse());
    }

    public DeleteBorderGatewayResponse deleteBorderGateway(DeleteBorderGatewayRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeleteBorderGateway", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DeleteBorderGatewayResponse());
    }

    public DescribeBorderGatewaysResponse describeBorderGateways(DescribeBorderGatewaysRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeBorderGateways", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeBorderGatewaysResponse());
    }

    public ModifyBorderGatewaysAttributeResponse modifyBorderGatewaysAttribute(ModifyBorderGatewaysAttributeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyBorderGatewaysAttribute", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyBorderGatewaysAttributeResponse());
    }

    public ModifyBorderGatewayAsnResponse modifyBorderGatewayAsn(ModifyBorderGatewayAsnRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyBorderGatewayAsn", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyBorderGatewayAsnResponse());
    }

    public DescribeAvailableNatsResponse describeAvailableNats(DescribeAvailableNatsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeAvailableNats", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeAvailableNatsResponse());
    }

    public AssignBorderGatewayResponse assignBorderGateway(AssignBorderGatewayRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AssignBorderGateway", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AssignBorderGatewayResponse());
    }

    public UnassignBorderGatewayResponse unassignBorderGateway(UnassignBorderGatewayRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "UnassignBorderGateway", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new UnassignBorderGatewayResponse());
    }

    public AssignBorderGatewayRouteResponse assignBorderGatewayRoute(AssignBorderGatewayRouteRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AssignBorderGatewayRoute", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AssignBorderGatewayRouteResponse());
    }


    public UnassignBorderGatewayRouteResponse unassignBorderGatewayRoute(UnassignBorderGatewayRouteRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "UnassignBorderGatewayRoute", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new UnassignBorderGatewayRouteResponse());
    }

    /**
     * 创建NAT网关。

     */
    public CreateNatGatewayResponse createNatGateway(CreateNatGatewayRequest request) {
        Map<String, ?> rsp = super.callApi(request, "CreateNatGateway", new RuntimeOptions());
        return TeaModel.toModel(rsp, new CreateNatGatewayResponse());
    }

    /**
     * 查询NAT网关列表。

     */
    public DescribeNatGatewaysResponse describeNatGateways(DescribeNatGatewaysRequest request) {
        Map<String, ?> rsp = super.callApi(request, "DescribeNatGateways", new RuntimeOptions());
        return TeaModel.toModel(rsp, new DescribeNatGatewaysResponse());
    }

    /**
     * 查询NAT网关详情规则表。

     */
    public DescribeNatGatewayDetailResponse describeNatGatewayDetail(DescribeNatGatewayDetailRequest request) {
        Map<String, ?> rsp = super.callApi(request, "DescribeNatGatewayDetail", new RuntimeOptions());
        return TeaModel.toModel(rsp, new DescribeNatGatewayDetailResponse());
    }

    /**
     * 删除一个指定的NAT网关。

     */
    public DeleteNatGatewayResponse deleteNatGateway(DeleteNatGatewayRequest request) {
        Map<String, ?> rsp = super.callApi(request, "DeleteNatGateway", new RuntimeOptions());
        return TeaModel.toModel(rsp, new DeleteNatGatewayResponse());
    }

    /**
     * 续费一个指定的NAT网关。

     */
    public RenewNatGatewayResponse renewNatGateway(RenewNatGatewayRequest request) {
        Map<String, ?> rsp = super.callApi(request, "RenewNatGateway", new RuntimeOptions());
        return TeaModel.toModel(rsp, new RenewNatGatewayResponse());
    }

    /**
     * 查询创建NAT网关的价格。

     */
    public InquiryPriceCreateNatGatewayResponse inquiryPriceCreateNatGateway(InquiryPriceCreateNatGatewayRequest request) {
        Map<String, ?> rsp = super.callApi(request, "InquiryPriceCreateNatGateway", new RuntimeOptions());
        return TeaModel.toModel(rsp, new InquiryPriceCreateNatGatewayResponse());
    }

    /**
     * 创建SNAT规则。

     */
    public CreateSnatEntryResponse createSnatEntry(CreateSnatEntryRequest request) {
        Map<String, ?> rsp = super.callApi(request, "CreateSnatEntry", new RuntimeOptions());
        return TeaModel.toModel(rsp, new CreateSnatEntryResponse());
    }

    /**
     * 修改SNAT规则。

     */
    public ModifySnatEntryResponse modifySnatEntry(ModifySnatEntryRequest request) {
        Map<String, ?> rsp = super.callApi(request, "ModifySnatEntry", new RuntimeOptions());
        return TeaModel.toModel(rsp, new ModifySnatEntryResponse());
    }

    /**
     * 删除SNAT规则。

     */
    public DeleteSnatEntryResponse deleteSnatEntry(DeleteSnatEntryRequest request) {
        Map<String, ?> rsp = super.callApi(request, "DeleteSnatEntry", new RuntimeOptions());
        return TeaModel.toModel(rsp, new DeleteSnatEntryResponse());
    }

    /**
     * 创建DNAT规则。

     */
    public CreateDnatEntryResponse createDnatEntry(CreateDnatEntryRequest request) {
        Map<String, ?> rsp = super.callApi(request, "CreateDnatEntry", new RuntimeOptions());
        return TeaModel.toModel(rsp, new CreateDnatEntryResponse());
    }

    /**
     * 修改DNAT规则。

     */
    public ModifyDnatEntryResponse modifyDnatEntry(ModifyDnatEntryRequest request) {
        Map<String, ?> rsp = super.callApi(request, "ModifyDnatEntry", new RuntimeOptions());
        return TeaModel.toModel(rsp, new ModifyDnatEntryResponse());
    }

    /**
     * 删除DNAT规则。

     */
    public DeleteDnatEntryResponse deleteDnatEntry(DeleteDnatEntryRequest request) {
        Map<String, ?> rsp = super.callApi(request, "DeleteDnatEntry", new RuntimeOptions());
        return TeaModel.toModel(rsp, new DeleteDnatEntryResponse());
    }

    public DescribeServiceCityResponse innerDescribeServiceCityCodes(DescribeServiceCityRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeServiceCityCodes", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeServiceCityResponse());
    }

    public DescribeNatGatewayRegionsResponse describeNatGatewayRegions(DescribeNatGatewayRegionsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeNatGatewayRegions", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeNatGatewayRegionsResponse());
    }

    /**
     * 调整弹性公网IP的带宽限速。

     */
    public ModifyEipBandwidthResponse modifyEipBandwidth(ModifyEipBandwidthRequest request) {
        Map<String, ?> rsp = super.callApi(request, "ModifyEipBandwidth", new RuntimeOptions());
        return TeaModel.toModel(rsp, new ModifyEipBandwidthResponse());
    }

    /**
     * 查询弹性公网IP监控指标。

     */
    public DescribeEipMonitorDataResponse describeEipMonitorData(DescribeEipMonitorDataRequest request) {
        Map<String, ?> rsp = super.callApi(request, "DescribeEipMonitorData", new RuntimeOptions());
        return TeaModel.toModel(rsp, new DescribeEipMonitorDataResponse());
    }

    /**
     * 查询实例监控指标。

     */
    public DescribeInstanceMonitorDataResponse describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request) {
        Map<String, ?> rsp = super.callApi(request, "DescribeInstanceMonitorData", new RuntimeOptions());
        return TeaModel.toModel(rsp, new DescribeInstanceMonitorDataResponse());
    }

    /**
     * 获取可绑定NAT的边界网关。

     */
    public DescribeAvailableBorderGatewayResponse describeAvailableBorderGateway(DescribeAvailableBorderGatewayRequest request) {
        Map<String, ?> rsp = super.callApi(request, "DescribeAvailableBorderGateway", new RuntimeOptions());
        return TeaModel.toModel(rsp, new DescribeAvailableBorderGatewayResponse());
    }

    /**
     * 修改私有网络（VPC）的相关属性。

     */
    public ModifyVpcAttributeResponse modifyVpcAttribute(ModifyVpcAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(request, "ModifyVpcAttribute", new RuntimeOptions());
        return TeaModel.toModel(rsp, new ModifyVpcAttributeResponse());
    }

    /**
     * 用于对指定云盘创建快照。

     */
    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) {
        Map<String, ?> rsp = super.callApi(
                request,
                "CreateSnapshot",
                new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateSnapshotResponse());
    }

    /**
     * 用于修改指定快照的属性。

     */
    public ModifySnapshotsAttributeResponse modifySnapshotsAttribute(ModifySnapshotsAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
                request,
                "ModifySnapshotsAttribute",
                new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifySnapshotsAttributeResponse());
    }

    /**
     * 用于删除指定快照集合。

     */
    public DeleteSnapshotsResponse deleteSnapshots(DeleteSnapshotsRequest request) {
        Map<String, ?> rsp = super.callApi(
                request,
                "DeleteSnapshots",
                new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteSnapshotsResponse());
    }

    /**
     * 用于查询快照的详细信息。

     */
    public DescribeSnapshotsResponse describeSnapshots(DescribeSnapshotsRequest request) {
        Map<String, ?> rsp = super.callApi(
                request,
                "DescribeSnapshots",
                new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeSnapshotsResponse());
    }

    /**
     * 用于回滚快照到原云盘。

     */
    public ApplySnapshotResponse applySnapshot(ApplySnapshotRequest request) {
        Map<String, ?> rsp = super.callApi(
                request,
                "ApplySnapshot",
                new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ApplySnapshotResponse());
    }

    /**
     * 修改NAT网关属性。

     */
    public ModifyNatGatewaysAttributeResponse modifyNatGatewaysAttribute(ModifyNatGatewaysAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
                request,
                "ModifyNatGatewaysAttribute",
                new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyNatGatewaysAttributeResponse());
    }



    /**
     * 修改NAT网关。

     */
    public ModifyNatGatewayResponse modifyNatGateway(ModifyNatGatewayRequest request) {
        Map<String, ?> rsp = super.callApi(
                request,
                "ModifyNatGateway",
                new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyNatGatewayResponse());
    }

}
