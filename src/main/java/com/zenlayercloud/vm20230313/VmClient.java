/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;
import com.zenlayercloud.vm20230313.models.*;

import java.util.Map;

/**
 * @author sherlock
 * @version $ Id: VmClient.java, v 0.1  sherlock Exp $
 * @date 2023-03-13 14:43:09
 */
public class VmClient extends AbstractClient {

    private static final String VERSION  = "2023-03-13";
    private static final String endpoint = "console.zenlayer.com";
    private static final String path     = "/api/v2/vm";

    public VmClient(Credential credential, Config config) {
        super(credential, config, Common.isUnset(config.endpoint) ? endpoint : config.endpoint, VERSION, path);
    }

    public VmClient(Credential credential) {
        this(credential, new Config());
    }

    public DescribeZonesResponse describeZones(DescribeZonesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeZones", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DescribeZonesResponse());
    }

    public DescribeImageResponse describeImages(DescribeImageRequest request) {
        Map<String, ?> rspStr = callApi(request, "DescribeImage", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DescribeImageResponse());
    }

    public DescribeImagesResponse describeImages(DescribeImagesRequest request) {
        Map<String, ?> rspStr = callApi(request, "DescribeImages", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DescribeImagesResponse());
    }

    public DescribeImageQuotaResponse describeImageQuota(DescribeImageQuotaRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeImageQuota", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DescribeImageQuotaResponse());
    }

    public CreateImageResponse createImage(CreateImageRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateImage", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new CreateImageResponse());
    }

    public ModifyImagesAttributesResponse modifyImagesAttributes(ModifyImagesAttributesRequest request) {
        Map<String, ?> rspStr = callApi(request, "ModifyImagesAttributes", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyImagesAttributesResponse());
    }

    public DeleteImagesResponse deleteImages(DeleteImagesRequest request) {
        Map<String, ?> rspStr = callApi(request, "DeleteImages", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DeleteImagesResponse());
    }

    public DescribeSecurityGroupResponse describeSecurityGroups(DescribeSecurityGroupsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeSecurityGroups", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeSecurityGroupResponse());
    }

    public ModifySecurityGroupsAttributeResponse modifySecurityGroupsAttribute(ModifySecurityGroupsAttributeRequest request) {
        Map<String, ?> resp = super.callApi(request, "ModifySecurityGroupsAttribute", new RuntimeOptions());
        return TeaModel.toModel(resp, new ModifySecurityGroupsAttributeResponse());
    }

    public DescribeInstanceAvailableSecurityGroupResourcesResponse describeInstanceAvailableSecurityGroupResources(
            DescribeInstanceAvailableSecurityGroupResourcesRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeInstanceAvailableSecurityGroupResources", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeInstanceAvailableSecurityGroupResourcesResponse());
    }

    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) {
        Map<String, ?> resp = super.callApi(request, "CreateSecurityGroup", new RuntimeOptions());
        return TeaModel.toModel(resp, new CreateSecurityGroupResponse());
    }

    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) {
        Map<String, ?> resp = super.callApi(request, "DeleteSecurityGroup", new RuntimeOptions());
        return TeaModel.toModel(resp, new DeleteSecurityGroupResponse());
    }

    public AuthorizeSecurityGroupRulesResponse authorizeSecurityGroupRules(AuthorizeSecurityGroupRulesRequest request) {
        Map<String, ?> resp = super.callApi(request, "AuthorizeSecurityGroupRules", new RuntimeOptions());
        return TeaModel.toModel(resp, new AuthorizeSecurityGroupRulesResponse());
    }

    public ConfigureSecurityGroupRulesResponse configureSecurityGroupRules(ConfigureSecurityGroupRulesRequest request) {
        Map<String, ?> resp = super.callApi(request, "ConfigureSecurityGroupRules", new RuntimeOptions());
        return TeaModel.toModel(resp, new ConfigureSecurityGroupRulesResponse());
    }

    public AuthorizeSecurityGroupRuleResponse authorizeSecurityGroupRule(AuthorizeSecurityGroupRuleRequest request) {
        Map<String, ?> resp = super.callApi(request, "AuthorizeSecurityGroupRule", new RuntimeOptions());
        return TeaModel.toModel(resp, new AuthorizeSecurityGroupRuleResponse());
    }

    public RevokeSecurityGroupRulesResponse revokeSecurityGroupRules(RevokeSecurityGroupRulesRequest request) {
        Map<String, ?> resp = super.callApi(request, "RevokeSecurityGroupRules", new RuntimeOptions());
        return TeaModel.toModel(resp, new RevokeSecurityGroupRulesResponse());
    }

    public AssociateSecurityGroupInstanceResponse associateSecurityGroupInstance(AssociateSecurityGroupInstanceRequest request) {
        Map<String, ?> resp = super.callApi(request, "AssociateSecurityGroupInstance", new RuntimeOptions());
        return TeaModel.toModel(resp, new AssociateSecurityGroupInstanceResponse());
    }

    public UnAssociateSecurityGroupInstanceResponse unAssociateSecurityGroupInstance(UnAssociateSecurityGroupInstanceRequest request) {
        Map<String, ?> resp = super.callApi(request, "UnAssociateSecurityGroupInstance", new RuntimeOptions());
        return TeaModel.toModel(resp, new UnAssociateSecurityGroupInstanceResponse());
    }

    public ModifyDisksResourceGroupResponse modifyDisksResourceGroup(ModifyDisksResourceGroupRequest request) {
        Map<String, ?> resp = super.callApi(request, "ModifyDisksResourceGroup", new RuntimeOptions());
        return TeaModel.toModel(resp, new ModifyDisksResourceGroupResponse());
    }

    public CreateDisksResponse createDisks(CreateDisksRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateDisks", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateDisksResponse());
    }

    /**
     * 将一个云硬盘扩容到指定大小。

     */
    public ResizeDiskResponse resizeDisk(ResizeDiskRequest request) {
        Map<String, ?> rsp = super.callApi(request, "ResizeDisk", new RuntimeOptions());
        return TeaModel.toModel(rsp, new ResizeDiskResponse());
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

    public DescribeDiskCategoryResponse describeDiskCategory(DescribeDiskCategoryRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeDiskCategory", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeDiskCategoryResponse());
    }

    public CreateVpcResponse createVpc(CreateVpcRequest request) {
        Map<String, ?> resp = super.callApi(request, "CreateVpc", new RuntimeOptions());
        return TeaModel.toModel(resp, new CreateVpcResponse());
    }

    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) {
        Map<String, ?> resp = super.callApi(request, "DeleteVpc", new RuntimeOptions());
        return TeaModel.toModel(resp, new DeleteVpcResponse());
    }

    public ModifyVpcsAttributeResponse modifyVpcsAttribute(ModifyVpcsAttributeRequest request) {
        Map<String, ?> resp = super.callApi(request, "ModifyVpcsAttribute", new RuntimeOptions());
        return TeaModel.toModel(resp, new ModifyVpcsAttributeResponse());
    }

    public DescribeVpcsResponse describeVpcs(DescribeVpcsRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeVpcs", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeVpcsResponse());
    }

    public CreateVpcSubnetResponse createVpcSubnet(CreateVpcSubnetRequest request) {
        Map<String, ?> resp = super.callApi(request, "CreateVpcSubnet", new RuntimeOptions());
        return TeaModel.toModel(resp, new CreateVpcSubnetResponse());
    }

    public ModifyVpcSubnetsAttributeResponse modifyVpcSubnetsAttribute(ModifyVpcSubnetsAttributeRequest request) {
        Map<String, ?> resp = super.callApi(request, "ModifyVpcSubnetsAttribute", new RuntimeOptions());
        return TeaModel.toModel(resp, new ModifyVpcSubnetsAttributeResponse());
    }

    public DescribeVpcSubnetsResponse describeVpcSubnets(DescribeVpcSubnetsRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeVpcSubnets", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeVpcSubnetsResponse());
    }

    public DeleteVpcSubnetResponse deleteVpcSubnet(DeleteVpcSubnetRequest request) {
        Map<String, ?> resp = super.callApi(request, "DeleteVpcSubnet", new RuntimeOptions());
        return TeaModel.toModel(resp, new DeleteVpcSubnetResponse());
    }

    public CreateSubnetResponse createSubnet(CreateSubnetRequest request) {
        Map<String, ?> resp = super.callApi(request, "CreateSubnet", new RuntimeOptions());
        return TeaModel.toModel(resp, new CreateSubnetResponse());
    }

    public DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request) {
        Map<String, ?> resp = super.callApi(request, "DeleteSubnet", new RuntimeOptions());
        return TeaModel.toModel(resp, new DeleteSubnetResponse());
    }

    public ModifySubnetsAttributeResponse modifySubnetsAttribute(ModifySubnetsAttributeRequest request) {
        Map<String, ?> resp = super.callApi(request, "ModifySubnetsAttribute", new RuntimeOptions());
        return TeaModel.toModel(resp, new ModifySubnetsAttributeResponse());
    }

    public DescribeSubnetsResponse describeSubnets(DescribeSubnetsRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeSubnets", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeSubnetsResponse());
    }

    public DescribeZoneInstanceConfigInfosResponse describeZoneInstanceConfigInfos(DescribeZoneInstanceConfigInfosRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeZoneInstanceConfigInfos", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeZoneInstanceConfigInfosResponse());
    }

    public InquiryPriceCreateInstanceResponse inquiryPriceCreateInstance(InquiryPriceCreateInstanceRequest request) {
        Map<String, ?> resp = super.callApi(request, "InquiryPriceCreateInstance", new RuntimeOptions());
        return TeaModel.toModel(resp, new InquiryPriceCreateInstanceResponse());
    }


    public CreateInstancesResponse createInstances(CreateInstancesRequest request) {
        Map<String, ?> resp = super.callApi(request, "CreateInstances", new RuntimeOptions());
        return TeaModel.toModel(resp, new CreateInstancesResponse());
    }

    public DescribeInstancesResponse describeInstances(
            DescribeInstancesRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeInstances", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeInstancesResponse());
    }

    public DescribeInstancesStatusResponse describeInstancesStatus(
            DescribeInstancesStatusRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeInstancesStatus", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeInstancesStatusResponse());
    }

    public StartInstancesResponse startInstances(StartInstancesRequest request) {
        Map<String, ?> resp = super.callApi(request, "StartInstances", new RuntimeOptions());
        return TeaModel.toModel(resp, new StartInstancesResponse());
    }

    public StopInstancesResponse stopInstances(StopInstancesRequest request) {
        Map<String, ?> resp = super.callApi(request, "StopInstances", new RuntimeOptions());
        return TeaModel.toModel(resp, new StopInstancesResponse());
    }

    public RebootInstancesResponse rebootInstances(RebootInstancesRequest request) {
        Map<String, ?> resp = super.callApi(request, "RebootInstances", new RuntimeOptions());
        return TeaModel.toModel(resp, new RebootInstancesResponse());
    }

    public ResetInstancesPasswordResponse resetInstancesPassword(ResetInstancesPasswordRequest request) {
        Map<String, ?> resp = super.callApi(request, "ResetInstancesPassword", new RuntimeOptions());
        return TeaModel.toModel(resp, new ResetInstancesPasswordResponse());
    }

    public ResetInstanceResponse resetInstance(ResetInstanceRequest request) {
        Map<String, ?> resp = super.callApi(request, "ResetInstance", new RuntimeOptions());
        return TeaModel.toModel(resp, new ResetInstanceResponse());
    }

    public TerminateInstanceResponse terminateInstance(TerminateInstanceRequest request) {
        Map<String, ?> resp = super.callApi(request, "TerminateInstance", new RuntimeOptions());
        return TeaModel.toModel(resp, new TerminateInstanceResponse());
    }

    public ReleaseInstancesResponse releaseInstances(ReleaseInstancesRequest request) {
        Map<String, ?> resp = super.callApi(request, "ReleaseInstances", new RuntimeOptions());
        return TeaModel.toModel(resp, new ReleaseInstancesResponse());
    }

    public ModifyInstancesAttributeResponse modifyInstancesAttribute(ModifyInstancesAttributeRequest request) {
        Map<String, ?> resp = super.callApi(request, "ModifyInstancesAttribute", new RuntimeOptions());
        return TeaModel.toModel(resp, new ModifyInstancesAttributeResponse());
    }

    public InquiryPriceInstanceBandwidthResponse inquiryPriceInstanceBandwidth(InquiryPriceInstanceBandwidthRequest request) {
        Map<String, ?> resp = super.callApi(request, "InquiryPriceInstanceBandwidth", new RuntimeOptions());
        return TeaModel.toModel(resp, new InquiryPriceInstanceBandwidthResponse());
    }

    public ModifyInstanceBandwidthResponse modifyInstanceBandwidth(ModifyInstanceBandwidthRequest request) {
        Map<String, ?> resp = super.callApi(request, "ModifyInstanceBandwidth", new RuntimeOptions());
        return TeaModel.toModel(resp, new ModifyInstanceBandwidthResponse());
    }

    public CancelInstanceBandwidthDowngradeResponse cancelInstanceBandwidthDowngrade(CancelInstanceBandwidthDowngradeRequest request) {
        Map<String, ?> resp = super.callApi(request, "CancelInstanceBandwidthDowngrade", new RuntimeOptions());
        return TeaModel.toModel(resp, new CancelInstanceBandwidthDowngradeResponse());
    }

    public InquiryPriceInstanceTrafficPackageResponse inquiryPriceInstanceTrafficPackage(InquiryPriceInstanceTrafficPackageRequest request) {
        Map<String, ?> resp = super.callApi(request, "InquiryPriceInstanceTrafficPackage", new RuntimeOptions());
        return TeaModel.toModel(resp, new InquiryPriceInstanceTrafficPackageResponse());
    }

    public ModifyInstanceTrafficPackageResponse modifyInstanceTrafficPackage(ModifyInstanceTrafficPackageRequest request) {
        Map<String, ?> resp = super.callApi(request, "ModifyInstanceTrafficPackage", new RuntimeOptions());
        return TeaModel.toModel(resp, new ModifyInstanceTrafficPackageResponse());
    }

    public CancelInstanceTrafficPackageDowngradeResponse cancelInstanceTrafficPackageDowngrade(
            CancelInstanceTrafficPackageDowngradeRequest request) {
        Map<String, ?> resp = super.callApi(request, "CancelInstanceTrafficPackageDowngrade", new RuntimeOptions());
        return TeaModel.toModel(resp, new CancelInstanceTrafficPackageDowngradeResponse());
    }

    public DescribeInstanceInternetStatusResponse describeInstanceInternetStatus(DescribeInstanceInternetStatusRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeInstanceInternetStatus", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeInstanceInternetStatusResponse());
    }

    public ModifyInstancesResourceGroupResponse modifyInstancesResourceGroup(ModifyInstancesResourceGroupRequest request) {
        Map<String, ?> resp = super.callApi(request, "ModifyInstancesResourceGroup", new RuntimeOptions());
        return TeaModel.toModel(resp, new ModifyInstancesResourceGroupResponse());
    }

    public DescribeInstanceTrafficResponse describeInstanceTraffic(DescribeInstanceTrafficRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeInstanceTraffic", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeInstanceTrafficResponse());
    }

    public DescribeInstanceCpuMonitorResponse describeInstanceCpuMonitor(DescribeInstanceCpuMonitorRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeInstanceCpuMonitor", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeInstanceCpuMonitorResponse());
    }

    public ModifyInstanceTypeResponse modifyInstanceType(ModifyInstanceTypeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyInstanceType", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyInstanceTypeResponse());
    }

    public CancelInstanceDowngradeResponse cancelInstanceDowngrade(CancelInstanceDowngradeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CancelInstanceDowngrade", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CancelInstanceDowngradeResponse());
    }

    public DescribeInstanceTypeStatusResponse describeInstanceTypeStatus(DescribeInstanceTypeStatusRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeInstanceTypeStatus", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeInstanceTypeStatusResponse());
    }

    public DescribeKeyPairsResponse describeKeyPairs(DescribeKeyPairsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeKeyPairs", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeKeyPairsResponse());
    }

    public ImportKeyPairResponse importKeyPair(ImportKeyPairRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ImportKeyPair", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ImportKeyPairResponse());
    }

    public ModifyKeyPairAttributeResponse modifyKeyPairAttribute(ModifyKeyPairAttributeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyKeyPairAttribute", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyKeyPairAttributeResponse());
    }

    public DeleteKeyPairsResponse deleteKeyPairs(DeleteKeyPairsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeleteKeyPairs", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DeleteKeyPairsResponse());
    }

}
