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
import com.zenlayercloud.vm20230313.models.CancelInstanceBandwidthDowngradeRequest;
import com.zenlayercloud.vm20230313.models.CancelInstanceBandwidthDowngradeResponse;
import com.zenlayercloud.vm20230313.models.CancelInstanceTrafficPackageDowngradeRequest;
import com.zenlayercloud.vm20230313.models.CancelInstanceTrafficPackageDowngradeResponse;
import com.zenlayercloud.vm20230313.models.CreateInstancesRequest;
import com.zenlayercloud.vm20230313.models.CreateInstancesResponse;
import com.zenlayercloud.vm20230313.models.DescribeDiskCategoryRequest;
import com.zenlayercloud.vm20230313.models.DescribeDiskCategoryResponse;
import com.zenlayercloud.vm20230313.models.DescribeImageRequest;
import com.zenlayercloud.vm20230313.models.DescribeImageResponse;
import com.zenlayercloud.vm20230313.models.DescribeInstanceCpuMonitorRequest;
import com.zenlayercloud.vm20230313.models.DescribeInstanceCpuMonitorResponse;
import com.zenlayercloud.vm20230313.models.DescribeInstanceInternetStatusRequest;
import com.zenlayercloud.vm20230313.models.DescribeInstanceInternetStatusResponse;
import com.zenlayercloud.vm20230313.models.DescribeInstanceTrafficRequest;
import com.zenlayercloud.vm20230313.models.DescribeInstanceTrafficResponse;
import com.zenlayercloud.vm20230313.models.DescribeInstancesRequest;
import com.zenlayercloud.vm20230313.models.DescribeInstancesResponse;
import com.zenlayercloud.vm20230313.models.DescribeInstancesStatusRequest;
import com.zenlayercloud.vm20230313.models.DescribeInstancesStatusResponse;
import com.zenlayercloud.vm20230313.models.DescribeZoneInstanceConfigInfosRequest;
import com.zenlayercloud.vm20230313.models.DescribeZoneInstanceConfigInfosResponse;
import com.zenlayercloud.vm20230313.models.InquiryPriceCreateInstanceRequest;
import com.zenlayercloud.vm20230313.models.InquiryPriceCreateInstanceResponse;
import com.zenlayercloud.vm20230313.models.InquiryPriceInstanceBandwidthRequest;
import com.zenlayercloud.vm20230313.models.InquiryPriceInstanceBandwidthResponse;
import com.zenlayercloud.vm20230313.models.InquiryPriceInstanceTrafficPackageRequest;
import com.zenlayercloud.vm20230313.models.InquiryPriceInstanceTrafficPackageResponse;
import com.zenlayercloud.vm20230313.models.ModifyDisksResourceGroupRequest;
import com.zenlayercloud.vm20230313.models.ModifyDisksResourceGroupResponse;
import com.zenlayercloud.vm20230313.models.ModifyInstanceBandwidthRequest;
import com.zenlayercloud.vm20230313.models.ModifyInstanceBandwidthResponse;
import com.zenlayercloud.vm20230313.models.ModifyInstanceTrafficPackageRequest;
import com.zenlayercloud.vm20230313.models.ModifyInstanceTrafficPackageResponse;
import com.zenlayercloud.vm20230313.models.ModifyInstancesAttributeRequest;
import com.zenlayercloud.vm20230313.models.ModifyInstancesAttributeResponse;
import com.zenlayercloud.vm20230313.models.ModifyInstancesResourceGroupRequest;
import com.zenlayercloud.vm20230313.models.ModifyInstancesResourceGroupResponse;
import com.zenlayercloud.vm20230313.models.RebootInstancesRequest;
import com.zenlayercloud.vm20230313.models.RebootInstancesResponse;
import com.zenlayercloud.vm20230313.models.ReleaseInstancesRequest;
import com.zenlayercloud.vm20230313.models.ReleaseInstancesResponse;
import com.zenlayercloud.vm20230313.models.ResetInstanceRequest;
import com.zenlayercloud.vm20230313.models.ResetInstanceResponse;
import com.zenlayercloud.vm20230313.models.ResetInstancesPasswordRequest;
import com.zenlayercloud.vm20230313.models.ResetInstancesPasswordResponse;
import com.zenlayercloud.vm20230313.models.StartInstancesRequest;
import com.zenlayercloud.vm20230313.models.StartInstancesResponse;
import com.zenlayercloud.vm20230313.models.StopInstancesRequest;
import com.zenlayercloud.vm20230313.models.StopInstancesResponse;
import com.zenlayercloud.vm20230313.models.TerminateInstanceRequest;
import com.zenlayercloud.vm20230313.models.TerminateInstanceResponse;
import com.zenlayercloud.vm20230313.models.AssociateSecurityGroupInstanceRequest;
import com.zenlayercloud.vm20230313.models.AssociateSecurityGroupInstanceResponse;
import com.zenlayercloud.vm20230313.models.AttachDisksRequest;
import com.zenlayercloud.vm20230313.models.AttachDisksResponse;
import com.zenlayercloud.vm20230313.models.AuthorizeSecurityGroupRuleRequest;
import com.zenlayercloud.vm20230313.models.AuthorizeSecurityGroupRuleResponse;
import com.zenlayercloud.vm20230313.models.AuthorizeSecurityGroupRulesRequest;
import com.zenlayercloud.vm20230313.models.AuthorizeSecurityGroupRulesResponse;
import com.zenlayercloud.vm20230313.models.ChangeDisksAttachRequest;
import com.zenlayercloud.vm20230313.models.ChangeDisksAttachResponse;
import com.zenlayercloud.vm20230313.models.ConfigureSecurityGroupRulesRequest;
import com.zenlayercloud.vm20230313.models.ConfigureSecurityGroupRulesResponse;
import com.zenlayercloud.vm20230313.models.CreateDisksRequest;
import com.zenlayercloud.vm20230313.models.CreateDisksResponse;
import com.zenlayercloud.vm20230313.models.CreateImageRequest;
import com.zenlayercloud.vm20230313.models.CreateImageResponse;
import com.zenlayercloud.vm20230313.models.CreateSecurityGroupRequest;
import com.zenlayercloud.vm20230313.models.CreateSecurityGroupResponse;
import com.zenlayercloud.vm20230313.models.CreateSubnetRequest;
import com.zenlayercloud.vm20230313.models.CreateSubnetResponse;
import com.zenlayercloud.vm20230313.models.ReleaseDiskRequest;
import com.zenlayercloud.vm20230313.models.ReleaseDiskResponse;
import com.zenlayercloud.vm20230313.models.DeleteImagesRequest;
import com.zenlayercloud.vm20230313.models.DeleteImagesResponse;
import com.zenlayercloud.vm20230313.models.DeleteSecurityGroupRequest;
import com.zenlayercloud.vm20230313.models.DeleteSecurityGroupResponse;
import com.zenlayercloud.vm20230313.models.DeleteSubnetRequest;
import com.zenlayercloud.vm20230313.models.DeleteSubnetResponse;
import com.zenlayercloud.vm20230313.models.DescribeDisksRequest;
import com.zenlayercloud.vm20230313.models.DescribeDisksResponse;
import com.zenlayercloud.vm20230313.models.DescribeImageQuotaRequest;
import com.zenlayercloud.vm20230313.models.DescribeImageQuotaResponse;
import com.zenlayercloud.vm20230313.models.DescribeImagesRequest;
import com.zenlayercloud.vm20230313.models.DescribeImagesResponse;
import com.zenlayercloud.vm20230313.models.DescribeInstanceAvailableSecurityGroupResourcesRequest;
import com.zenlayercloud.vm20230313.models.DescribeInstanceAvailableSecurityGroupResourcesResponse;
import com.zenlayercloud.vm20230313.models.DescribeSecurityGroupResponse;
import com.zenlayercloud.vm20230313.models.DescribeSecurityGroupsRequest;
import com.zenlayercloud.vm20230313.models.DescribeSubnetsRequest;
import com.zenlayercloud.vm20230313.models.DescribeSubnetsResponse;
import com.zenlayercloud.vm20230313.models.DescribeZonesRequest;
import com.zenlayercloud.vm20230313.models.DescribeZonesResponse;
import com.zenlayercloud.vm20230313.models.DetachDisksRequest;
import com.zenlayercloud.vm20230313.models.DetachDisksResponse;
import com.zenlayercloud.vm20230313.models.InquiryPriceCreateDisksRequest;
import com.zenlayercloud.vm20230313.models.InquiryPriceCreateDisksResponse;
import com.zenlayercloud.vm20230313.models.ModifyDisksAttributesRequest;
import com.zenlayercloud.vm20230313.models.ModifyDisksAttributesResponse;
import com.zenlayercloud.vm20230313.models.ModifyImagesAttributesRequest;
import com.zenlayercloud.vm20230313.models.ModifyImagesAttributesResponse;
import com.zenlayercloud.vm20230313.models.ModifySecurityGroupsAttributeRequest;
import com.zenlayercloud.vm20230313.models.ModifySecurityGroupsAttributeResponse;
import com.zenlayercloud.vm20230313.models.ModifySubnetsAttributeRequest;
import com.zenlayercloud.vm20230313.models.ModifySubnetsAttributeResponse;
import com.zenlayercloud.vm20230313.models.RenewDiskRequest;
import com.zenlayercloud.vm20230313.models.RenewDiskResponse;
import com.zenlayercloud.vm20230313.models.RevokeSecurityGroupRulesRequest;
import com.zenlayercloud.vm20230313.models.RevokeSecurityGroupRulesResponse;
import com.zenlayercloud.vm20230313.models.TerminateDiskRequest;
import com.zenlayercloud.vm20230313.models.TerminateDiskResponse;
import com.zenlayercloud.vm20230313.models.UnAssociateSecurityGroupInstanceRequest;
import com.zenlayercloud.vm20230313.models.UnAssociateSecurityGroupInstanceResponse;

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

}
