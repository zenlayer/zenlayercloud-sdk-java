/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.bmc20221120.models.AllocateDdosIpAddressesRequest;
import com.zenlayercloud.bmc20221120.models.AllocateDdosIpAddressesResponse;
import com.zenlayercloud.bmc20221120.models.AllocateEipAddressesRequest;
import com.zenlayercloud.bmc20221120.models.AllocateEipAddressesResponse;
import com.zenlayercloud.bmc20221120.models.AssociateDdosIpAddressRequest;
import com.zenlayercloud.bmc20221120.models.AssociateDdosIpAddressResponse;
import com.zenlayercloud.bmc20221120.models.AssociateEipAddressRequest;
import com.zenlayercloud.bmc20221120.models.AssociateEipAddressResponse;
import com.zenlayercloud.bmc20221120.models.AssociateSubnetInstancesRequest;
import com.zenlayercloud.bmc20221120.models.AssociateSubnetInstanceResponse;
import com.zenlayercloud.bmc20221120.models.AssociateVpcSubnetRequest;
import com.zenlayercloud.bmc20221120.models.AssociateVpcSubnetResponse;
import com.zenlayercloud.bmc20221120.models.BindCidrBlockIpsRequest;
import com.zenlayercloud.bmc20221120.models.BindCidrBlockIpsResponse;
import com.zenlayercloud.bmc20221120.models.CancelInstanceBandwidthDowngradeRequest;
import com.zenlayercloud.bmc20221120.models.CancelInstanceBandwidthDowngradeResponse;
import com.zenlayercloud.bmc20221120.models.CancelInstanceTrafficPackageDowngradeRequest;
import com.zenlayercloud.bmc20221120.models.CancelInstanceTrafficPackageDowngradeResponse;
import com.zenlayercloud.bmc20221120.models.CreateInstancesRequest;
import com.zenlayercloud.bmc20221120.models.CreateInstancesResponse;
import com.zenlayercloud.bmc20221120.models.CreateIpv4BlockRequest;
import com.zenlayercloud.bmc20221120.models.CreateIpv4BlockResponse;
import com.zenlayercloud.bmc20221120.models.CreateIpv6BlockRequest;
import com.zenlayercloud.bmc20221120.models.CreateIpv6BlockResponse;
import com.zenlayercloud.bmc20221120.models.InquiryPriceCreateDdosIpAddressResponse;
import com.zenlayercloud.bmc20221120.models.DescribeAvailableIpv4ResourcesRequest;
import com.zenlayercloud.bmc20221120.models.DescribeAvailableIpv4ResourcesResponse;
import com.zenlayercloud.bmc20221120.models.DescribeAvailableIpv6ResourcesRequest;
import com.zenlayercloud.bmc20221120.models.DescribeAvailableIpv6ResourcesResponse;
import com.zenlayercloud.bmc20221120.models.DescribeAvailableResourcesRequest;
import com.zenlayercloud.bmc20221120.models.DescribeAvailableResourcesResponse;
import com.zenlayercloud.bmc20221120.models.DescribeCidrBlockIpsRequest;
import com.zenlayercloud.bmc20221120.models.DescribeCidrBlockIpsResponse;
import com.zenlayercloud.bmc20221120.models.DescribeCidrBlocksRequest;
import com.zenlayercloud.bmc20221120.models.DescribeCidrBlocksResponse;
import com.zenlayercloud.bmc20221120.models.DescribeDdosIpAddressesResponse;
import com.zenlayercloud.bmc20221120.models.DescribeDdosIpAddressesRequest;
import com.zenlayercloud.bmc20221120.models.DescribeDdosIpAvailableResourcesRequest;
import com.zenlayercloud.bmc20221120.models.DescribeDdosIpAvailableResourcesResponse;
import com.zenlayercloud.bmc20221120.models.DescribeEipAddressesResponse;
import com.zenlayercloud.bmc20221120.models.DescribeEipAddressesRequest;
import com.zenlayercloud.bmc20221120.models.DescribeEipAvailableResourcesRequest;
import com.zenlayercloud.bmc20221120.models.DescribeEipAvailableResourcesResponse;
import com.zenlayercloud.bmc20221120.models.DescribeImagesRequest;
import com.zenlayercloud.bmc20221120.models.DescribeImagesResponse;
import com.zenlayercloud.bmc20221120.models.DescribeInstanceAvailableCidrBlockRequest;
import com.zenlayercloud.bmc20221120.models.DescribeInstanceAvailableCidrBlockResponse;
import com.zenlayercloud.bmc20221120.models.DescribeInstanceInternetStatusRequest;
import com.zenlayercloud.bmc20221120.models.DescribeInstanceInternetStatusResponse;
import com.zenlayercloud.bmc20221120.models.DescribeInstanceTypesRequest;
import com.zenlayercloud.bmc20221120.models.DescribeInstanceTypesResponse;
import com.zenlayercloud.bmc20221120.models.DescribeInstancesRequest;
import com.zenlayercloud.bmc20221120.models.DescribeInstancesResponse;
import com.zenlayercloud.bmc20221120.models.DescribeZonesRequest;
import com.zenlayercloud.bmc20221120.models.DescribeZonesResponse;
import com.zenlayercloud.bmc20221120.models.InquiryPriceCreateEipAddressResponse;
import com.zenlayercloud.bmc20221120.models.InquiryPriceInstanceBandwidthResponse;
import com.zenlayercloud.bmc20221120.models.InquiryPriceInstanceBandwidthRequest;
import com.zenlayercloud.bmc20221120.models.InquiryPriceInstanceTrafficPackageResponse;
import com.zenlayercloud.bmc20221120.models.InquiryPriceInstanceTrafficPackageRequest;
import com.zenlayercloud.bmc20221120.models.InquiryPriceCreateDdosIpAddressRequest;
import com.zenlayercloud.bmc20221120.models.InquiryPriceCreateEipAddressRequest;
import com.zenlayercloud.bmc20221120.models.InquiryPriceCreateInstanceRequest;
import com.zenlayercloud.bmc20221120.models.InquiryPriceCreateInstanceResponse;
import com.zenlayercloud.bmc20221120.models.InquiryPriceCreateIpv4BlockRequest;
import com.zenlayercloud.bmc20221120.models.InquiryPriceCreateIpv4BlockResponse;
import com.zenlayercloud.bmc20221120.models.DescribeInstanceAvailableDdosIpResourcesRequest;
import com.zenlayercloud.bmc20221120.models.DescribeInstanceAvailableDdosIpResourcesResponse;
import com.zenlayercloud.bmc20221120.models.DescribeInstanceAvailableEipResourcesRequest;
import com.zenlayercloud.bmc20221120.models.DescribeInstanceAvailableEipResourcesResponse;
import com.zenlayercloud.bmc20221120.models.ModifyCidrBlocksAttributeRequest;
import com.zenlayercloud.bmc20221120.models.ModifyCidrBlocksAttributeResponse;
import com.zenlayercloud.bmc20221120.models.ModifyDdosIpAddressesResourceGroupRequest;
import com.zenlayercloud.bmc20221120.models.ModifyDdosIpAddressesResourceGroupResponse;
import com.zenlayercloud.bmc20221120.models.ModifyEipAddressesResourceGroupRequest;
import com.zenlayercloud.bmc20221120.models.ModifyEipAddressesResourceGroupResponse;
import com.zenlayercloud.bmc20221120.models.ModifyInstanceBandwidthRequest;
import com.zenlayercloud.bmc20221120.models.ModifyInstanceBandwidthResponse;
import com.zenlayercloud.bmc20221120.models.ModifyInstanceTrafficPackageRequest;
import com.zenlayercloud.bmc20221120.models.ModifyInstanceTrafficPackageResponse;
import com.zenlayercloud.bmc20221120.models.ModifyInstancesAttributeRequest;
import com.zenlayercloud.bmc20221120.models.ModifyInstancesAttributeResponse;
import com.zenlayercloud.bmc20221120.models.ModifyInstancesResourceGroupRequest;
import com.zenlayercloud.bmc20221120.models.ModifyInstancesResourceGroupResponse;
import com.zenlayercloud.bmc20221120.models.RebootInstancesRequest;
import com.zenlayercloud.bmc20221120.models.RebootInstancesResponse;
import com.zenlayercloud.bmc20221120.models.ReinstallInstanceRequest;
import com.zenlayercloud.bmc20221120.models.ReinstallInstanceResponse;
import com.zenlayercloud.bmc20221120.models.ReleaseCidrBlocksRequest;
import com.zenlayercloud.bmc20221120.models.ReleaseCidrBlocksResponse;
import com.zenlayercloud.bmc20221120.models.ReleaseDdosIpAddressesRequest;
import com.zenlayercloud.bmc20221120.models.ReleaseDdosIpAddressesResponse;
import com.zenlayercloud.bmc20221120.models.ReleaseEipAddressesRequest;
import com.zenlayercloud.bmc20221120.models.ReleaseEipAddressesResponse;
import com.zenlayercloud.bmc20221120.models.ReleaseInstancesRequest;
import com.zenlayercloud.bmc20221120.models.ReleaseInstancesResponse;
import com.zenlayercloud.bmc20221120.models.RenewCidrBlockRequest;
import com.zenlayercloud.bmc20221120.models.RenewCidrBlockResponse;
import com.zenlayercloud.bmc20221120.models.RenewDdosIpAddressRequest;
import com.zenlayercloud.bmc20221120.models.RenewDdosIpAddressResponse;
import com.zenlayercloud.bmc20221120.models.RenewEipAddressRequest;
import com.zenlayercloud.bmc20221120.models.RenewEipAddressResponse;
import com.zenlayercloud.bmc20221120.models.RenewInstanceRequest;
import com.zenlayercloud.bmc20221120.models.RenewInstanceResponse;
import com.zenlayercloud.bmc20221120.models.StartInstancesRequest;
import com.zenlayercloud.bmc20221120.models.StartInstancesResponse;
import com.zenlayercloud.bmc20221120.models.StopInstancesRequest;
import com.zenlayercloud.bmc20221120.models.StopInstancesResponse;
import com.zenlayercloud.bmc20221120.models.TeminateInstanceRequest;
import com.zenlayercloud.bmc20221120.models.TerminateCidrBlockRequest;
import com.zenlayercloud.bmc20221120.models.TerminateCidrBlockResponse;
import com.zenlayercloud.bmc20221120.models.TerminateDdosIpAddressRequest;
import com.zenlayercloud.bmc20221120.models.TerminateDdosIpAddressResponse;
import com.zenlayercloud.bmc20221120.models.TerminateEipAddressRequest;
import com.zenlayercloud.bmc20221120.models.TerminateEipAddressResponse;
import com.zenlayercloud.bmc20221120.models.TerminateInstanceResponse;
import com.zenlayercloud.bmc20221120.models.UnAssociateDdosIpAddressRequest;
import com.zenlayercloud.bmc20221120.models.UnAssociateDdosIpAddressResponse;
import com.zenlayercloud.bmc20221120.models.UnAssociateEipAddressRequest;
import com.zenlayercloud.bmc20221120.models.UnAssociateEipAddressResponse;
import com.zenlayercloud.bmc20221120.models.UnAssociateSubnetInstanceRequest;
import com.zenlayercloud.bmc20221120.models.UnAssociateSubnetInstanceResponse;
import com.zenlayercloud.bmc20221120.models.UnbindCidrBlockIpsRequest;
import com.zenlayercloud.bmc20221120.models.UnbindCidrBlockIpsResponse;
import com.zenlayercloud.bmc20221120.models.CreateSubnetRequest;
import com.zenlayercloud.bmc20221120.models.CreateVpcRequest;
import com.zenlayercloud.bmc20221120.models.DeleteSubnetRequest;
import com.zenlayercloud.bmc20221120.models.DeleteVpcRequest;
import com.zenlayercloud.bmc20221120.models.DescribeSubnetAvailableResourcesRequest;
import com.zenlayercloud.bmc20221120.models.DescribeSubnetsRequest;
import com.zenlayercloud.bmc20221120.models.DescribeVpcAvailableRegionsRequest;
import com.zenlayercloud.bmc20221120.models.DescribeVpcsRequest;
import com.zenlayercloud.bmc20221120.models.ModifySubnetsAttributeRequest;
import com.zenlayercloud.bmc20221120.models.ModifyVpcsAttributeRequest;
import com.zenlayercloud.bmc20221120.models.CreateSubnetResponse;
import com.zenlayercloud.bmc20221120.models.CreateVpcResponse;
import com.zenlayercloud.bmc20221120.models.DeleteSubnetResponse;
import com.zenlayercloud.bmc20221120.models.DeleteVpcResponse;
import com.zenlayercloud.bmc20221120.models.DescribeSubnetAvailableResourcesResponse;
import com.zenlayercloud.bmc20221120.models.DescribeSubnetsResponse;
import com.zenlayercloud.bmc20221120.models.DescribeVpcsResponse;
import com.zenlayercloud.bmc20221120.models.ModifySubnetsAttributeResponse;
import com.zenlayercloud.bmc20221120.models.ModifyVpcsAttributeResponse;
import com.zenlayercloud.bmc20221120.models.DescribeVpcAvailableRegionsResponse;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;

import java.util.Map;

/**
 * @author wolfgang
 * @date 2022-11-09 19:13:40
 * @version $ Id: BmcClient.java, v 0.1  wolfgang Exp $
 */
public class BmcClient extends AbstractClient {

    private static final String VERSION  = "2022-11-20";
    private static final String endpoint = "console.zenlayer.com";
    private static final String path     = "/api/v2/bmc";

    public BmcClient(Credential credential, Config config) {
        super(credential, config, Common.isUnset(config.endpoint) ? endpoint : config.endpoint, VERSION, path);
    }

    public BmcClient(Credential credential) {
        this(credential, new Config());
    }

    public DescribeZonesResponse describeZones(DescribeZonesRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeZones", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeZonesResponse());
    }

    public CreateInstancesResponse createInstances(CreateInstancesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateInstances", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new CreateInstancesResponse());
    }

    public DescribeImagesResponse describeImages(DescribeImagesRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeImages", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeImagesResponse());
    }

    public DescribeInstanceTypesResponse describeInstanceTypes(DescribeInstanceTypesRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeInstanceTypes", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeInstanceTypesResponse());
    }

    public DescribeAvailableResourcesResponse describeAvailableResources(DescribeAvailableResourcesRequest request) {
        RuntimeOptions runtime = new RuntimeOptions();
        Map<String, ?> resp = super.callApi(request, "DescribeAvailableResources", runtime);
        return TeaModel.toModel(resp, new DescribeAvailableResourcesResponse());
    }

    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeInstances", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeInstancesResponse());
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

    public ReinstallInstanceResponse reinstallInstance(ReinstallInstanceRequest request) {
        Map<String, ?> resp = super.callApi(request, "ReinstallInstance", new RuntimeOptions());
        return TeaModel.toModel(resp, new ReinstallInstanceResponse());
    }

    public TerminateInstanceResponse terminateInstance(TeminateInstanceRequest request) {
        Map<String, ?> resp = super.callApi(request, "TerminateInstance", new RuntimeOptions());
        return TeaModel.toModel(resp, new TerminateInstanceResponse());
    }

    public ReleaseInstancesResponse releaseInstances(ReleaseInstancesRequest request) {
        Map<String, ?> resp = super.callApi(request, "ReleaseInstances", new RuntimeOptions());
        return TeaModel.toModel(resp, new ReleaseInstancesResponse());
    }

    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) {
        Map<String, ?> resp = super.callApi(request, "RenewInstance", new RuntimeOptions());
        return TeaModel.toModel(resp, new RenewInstanceResponse());
    }

    public ModifyInstancesAttributeResponse modifyInstancesAttribute(ModifyInstancesAttributeRequest request) {
        Map<String, ?> resp = super.callApi(request, "ModifyInstancesAttribute", new RuntimeOptions());
        return TeaModel.toModel(resp, new ModifyInstancesAttributeResponse());
    }

    public InquiryPriceCreateInstanceResponse inquiryPriceCreateInstance(InquiryPriceCreateInstanceRequest request) {
        Map<String, ?> resp = super.callApi(request, "InquiryPriceCreateInstance", new RuntimeOptions());
        return TeaModel.toModel(resp, new InquiryPriceCreateInstanceResponse());
    }

    public CancelInstanceBandwidthDowngradeResponse cancelInstanceBandwidthDowngrade(CancelInstanceBandwidthDowngradeRequest request) {
        Map<String, ?> resp = super.callApi(request, "CancelInstanceBandwidthDowngrade", new RuntimeOptions());
        return TeaModel.toModel(resp, new CancelInstanceBandwidthDowngradeResponse());
    }

    public ModifyInstanceBandwidthResponse modifyInstanceBandwidth(ModifyInstanceBandwidthRequest request) {
        Map<String, ?> resp = super.callApi(request, "ModifyInstanceBandwidth", new RuntimeOptions());
        return TeaModel.toModel(resp, new ModifyInstanceBandwidthResponse());
    }

    public InquiryPriceInstanceBandwidthResponse inquiryPriceInstanceBandwidth(InquiryPriceInstanceBandwidthRequest request) {
        Map<String, ?> resp = super.callApi(request, "InquiryPriceInstanceBandwidth", new RuntimeOptions());
        return TeaModel.toModel(resp, new InquiryPriceInstanceBandwidthResponse());
    }

    public CancelInstanceTrafficPackageDowngradeResponse cancelInstanceTrafficPackageDowngrade(CancelInstanceTrafficPackageDowngradeRequest request) {
        Map<String, ?> resp = super.callApi(request, "CancelInstanceTrafficPackageDowngrade", new RuntimeOptions());
        return TeaModel.toModel(resp, new CancelInstanceTrafficPackageDowngradeResponse());
    }

    public ModifyInstanceTrafficPackageResponse modifyInstanceTrafficPackage(ModifyInstanceTrafficPackageRequest request) {
        Map<String, ?> resp = super.callApi(request, "ModifyInstanceTrafficPackage", new RuntimeOptions());
        return TeaModel.toModel(resp, new ModifyInstanceTrafficPackageResponse());
    }

    public InquiryPriceInstanceTrafficPackageResponse inquiryPriceInstanceTrafficPackage(InquiryPriceInstanceTrafficPackageRequest request) {
        Map<String, ?> resp = super.callApi(request, "InquiryPriceInstanceTrafficPackage", new RuntimeOptions());
        return TeaModel.toModel(resp, new InquiryPriceInstanceTrafficPackageResponse());
    }

    public DescribeInstanceInternetStatusResponse describeInstanceInternetStatus(DescribeInstanceInternetStatusRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeInstanceInternetStatus", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeInstanceInternetStatusResponse());
    }

    public ModifyInstancesResourceGroupResponse modifyInstancesResourceGroup(ModifyInstancesResourceGroupRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyInstancesResourceGroup", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyInstancesResourceGroupResponse());
    }

    /*************** EIP ****************/

    public DescribeEipAddressesResponse describeEipAddresses(DescribeEipAddressesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeEipAddresses", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeEipAddressesResponse());
    }

    public DescribeEipAvailableResourcesResponse describeEipAvailableResources(DescribeEipAvailableResourcesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeEipAvailableResources", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeEipAvailableResourcesResponse());
    }

    public AllocateEipAddressesResponse allocateEipAddresses(AllocateEipAddressesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AllocateEipAddresses", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AllocateEipAddressesResponse());
    }

    public TerminateEipAddressResponse terminateEipAddress(TerminateEipAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "TerminateEipAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new TerminateEipAddressResponse());
    }

    public ReleaseEipAddressesResponse releaseEipAddresses(ReleaseEipAddressesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ReleaseEipAddresses", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ReleaseEipAddressesResponse());
    }

    public RenewEipAddressResponse renewEipAddress(RenewEipAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "RenewEipAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new RenewEipAddressResponse());
    }

    public AssociateEipAddressResponse associateEipAddress(AssociateEipAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AssociateEipAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AssociateEipAddressResponse());
    }

    public UnAssociateEipAddressResponse unAssociateEipAddress(UnAssociateEipAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "UnAssociateEipAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new UnAssociateEipAddressResponse());
    }

    public InquiryPriceCreateEipAddressResponse inquiryPriceCreateEipAddress(InquiryPriceCreateEipAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "InquiryPriceCreateEipAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new InquiryPriceCreateEipAddressResponse());
    }

    public DescribeInstanceAvailableEipResourcesResponse describeInstanceAvailableEipResources(DescribeInstanceAvailableEipResourcesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeInstanceAvailableEipResources", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeInstanceAvailableEipResourcesResponse());
    }

    public ModifyEipAddressesResourceGroupResponse modifyEipAddressesResourceGroup(ModifyEipAddressesResourceGroupRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyEipAddressesResourceGroup", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyEipAddressesResourceGroupResponse());
    }

    /*************** DDOS IP ***************/

    public DescribeDdosIpAddressesResponse describeDdosIpAddresses(DescribeDdosIpAddressesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeDdosIpAddresses", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeDdosIpAddressesResponse());
    }

    public DescribeDdosIpAvailableResourcesResponse describeDdosIpAvailableResources(DescribeDdosIpAvailableResourcesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeDdosIpAvailableResources", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeDdosIpAvailableResourcesResponse());
    }

    public AllocateDdosIpAddressesResponse allocateDdosIpAddresses(AllocateDdosIpAddressesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AllocateDdosIpAddresses", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AllocateDdosIpAddressesResponse());
    }

    public TerminateDdosIpAddressResponse terminateDdosIpAddress(TerminateDdosIpAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "TerminateDdosIpAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new TerminateDdosIpAddressResponse());
    }

    public ReleaseDdosIpAddressesResponse releaseDdosIpAddresses(ReleaseDdosIpAddressesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ReleaseDdosIpAddresses", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ReleaseDdosIpAddressesResponse());
    }

    public RenewDdosIpAddressResponse renewDdosIpAddress(RenewDdosIpAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "RenewDdosIpAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new RenewDdosIpAddressResponse());
    }

    public AssociateDdosIpAddressResponse associateDdosIpAddress(AssociateDdosIpAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AssociateDdosIpAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AssociateDdosIpAddressResponse());
    }

    public UnAssociateDdosIpAddressResponse unAssociateDdosIpAddress(UnAssociateDdosIpAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "UnAssociateDdosIpAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new UnAssociateDdosIpAddressResponse());
    }

    public InquiryPriceCreateDdosIpAddressResponse inquiryPriceCreateDdosIpAddress(InquiryPriceCreateDdosIpAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "InquiryPriceCreateDdosIpAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new InquiryPriceCreateDdosIpAddressResponse());
    }

    public DescribeInstanceAvailableDdosIpResourcesResponse describeInstanceAvailableDdosIpResources(DescribeInstanceAvailableDdosIpResourcesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeInstanceAvailableDdosIpResources", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeInstanceAvailableDdosIpResourcesResponse());
    }

    public ModifyDdosIpAddressesResourceGroupResponse modifyDdosIpAddressesResourceGroup(ModifyDdosIpAddressesResourceGroupRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyDdosIpAddressesResourceGroup", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyDdosIpAddressesResourceGroupResponse());
    }

    /*************** CIDR BLOCK ***************/

    public DescribeCidrBlocksResponse describeCidrBlocks(DescribeCidrBlocksRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeCidrBlocks", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeCidrBlocksResponse());
    }

    public DescribeCidrBlockIpsResponse describeCidrBlockIps(DescribeCidrBlockIpsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeCidrBlockIps", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeCidrBlockIpsResponse());
    }

    public DescribeAvailableIpv4ResourcesResponse describeAvailableIpv4Resources(DescribeAvailableIpv4ResourcesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeAvailableIpv4Resources", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeAvailableIpv4ResourcesResponse());
    }

    public DescribeAvailableIpv6ResourcesResponse describeAvailableIpv6Resources(DescribeAvailableIpv6ResourcesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeAvailableIpv6Resources", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeAvailableIpv6ResourcesResponse());
    }

    public DescribeInstanceAvailableCidrBlockResponse describeInstanceAvailableCidrBlock(
            DescribeInstanceAvailableCidrBlockRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeInstanceAvailableCidrBlock", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeInstanceAvailableCidrBlockResponse());
    }

    public InquiryPriceCreateIpv4BlockResponse inquiryPriceCreateIpv4Block(InquiryPriceCreateIpv4BlockRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "InquiryPriceCreateIpv4Block", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new InquiryPriceCreateIpv4BlockResponse());
    }

    public CreateIpv4BlockResponse createIpv4Block(CreateIpv4BlockRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateIpv4Block", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateIpv4BlockResponse());
    }

    public CreateIpv6BlockResponse createIpv6Block(CreateIpv6BlockRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateIpv6Block", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateIpv6BlockResponse());
    }

    public ModifyCidrBlocksAttributeResponse modifyCidrBlocksAttribute(ModifyCidrBlocksAttributeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyCidrBlocksAttribute", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyCidrBlocksAttributeResponse());
    }

    public RenewCidrBlockResponse renewCidrBlock(RenewCidrBlockRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "RenewCidrBlock", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new RenewCidrBlockResponse());
    }

    public TerminateCidrBlockResponse terminateCidrBlock(TerminateCidrBlockRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "TerminateCidrBlock", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new TerminateCidrBlockResponse());
    }

    public ReleaseCidrBlocksResponse releaseCidrBlocks(ReleaseCidrBlocksRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ReleaseCidrBlocks", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ReleaseCidrBlocksResponse());
    }

    public BindCidrBlockIpsResponse bindCidrBlockIps(BindCidrBlockIpsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "BindCidrBlockIps", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new BindCidrBlockIpsResponse());
    }

    public UnbindCidrBlockIpsResponse unbindCidrBlockIps(UnbindCidrBlockIpsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "UnbindCidrBlockIps", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new UnbindCidrBlockIpsResponse());
    }


    /*************** VPC ***************/

    public DescribeVpcAvailableRegionsResponse describeVpcAvailableRegions(DescribeVpcAvailableRegionsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeVpcAvailableRegions", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeVpcAvailableRegionsResponse());
    }

    public ModifyVpcsAttributeResponse modifyVpcsAttribute(ModifyVpcsAttributeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyVpcsAttribute", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyVpcsAttributeResponse());
    }

    public CreateVpcResponse createVpc(CreateVpcRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateVpc", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateVpcResponse());
    }

    public DescribeVpcsResponse describeVpcs(DescribeVpcsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeVpcs", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeVpcsResponse());
    }

    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeleteVpc", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DeleteVpcResponse());
    }

    /*************** Subnet ***************/

    public DescribeSubnetAvailableResourcesResponse describeSubnetAvailableResources(DescribeSubnetAvailableResourcesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeSubnetAvailableResources", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeSubnetAvailableResourcesResponse());
    }


    public CreateSubnetResponse CreateSubnet(CreateSubnetRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateSubnet", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateSubnetResponse());
    }

    public ModifySubnetsAttributeResponse modifySubnetsAttribute(ModifySubnetsAttributeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifySubnetsAttribute", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifySubnetsAttributeResponse());
    }

    public DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeleteSubnet", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DeleteSubnetResponse());
    }

    public DescribeSubnetsResponse describeSubnets(DescribeSubnetsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeSubnets", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeSubnetsResponse());
    }

    public AssociateSubnetInstanceResponse associateSubnetInstances(AssociateSubnetInstancesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AssociateSubnetInstances", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AssociateSubnetInstanceResponse());
    }

    public UnAssociateSubnetInstanceResponse unAssociateSubnetInstance(UnAssociateSubnetInstanceRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "UnAssociateSubnetInstance", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new UnAssociateSubnetInstanceResponse());
    }


    public AssociateVpcSubnetResponse associateVpcSubnet(AssociateVpcSubnetRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AssociateVpcSubnet", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AssociateVpcSubnetResponse());
    }


}
