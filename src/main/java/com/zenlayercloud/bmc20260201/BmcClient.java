/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.bmc20260201;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.bmc20260201.models.*;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;

import java.util.Map;


public class BmcClient extends AbstractClient {
    private static final String VERSION = "2026-02-01";
    private static final String ENDPOINT = "console.zenlayer.com";
    private static final String PATH = "/api/v2/bmc";

    public BmcClient(Credential credential, Config config) {
        super(credential, config,
            config.getEndpoint() != null ? config.getEndpoint() : ENDPOINT,
            VERSION, PATH);
    }

        /**
         * 本接口用于查询可创建Subnet资源的可用区。
         */
    public DescribeSubnetAvailableResourcesResponse describeSubnetAvailableResources(DescribeSubnetAvailableResourcesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeSubnetAvailableResources",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeSubnetAvailableResourcesResponse());
    }

        /**
         * 本接口用于修改Subnet的属性（目前只支持修改Subnet的名称）。
         */
    public ModifySubnetsAttributeResponse modifySubnetsAttribute(ModifySubnetsAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifySubnetsAttribute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifySubnetsAttributeResponse());
    }

        /**
         * 本接口用于创建一个私有网络Subnet。
         */
    public CreateSubnetResponse createSubnet(CreateSubnetRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateSubnet",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateSubnetResponse());
    }

        /**
         * 本接口用于查询一台或多台指定Subnet的信息。用户可以根据Subnet ID、VPC ID、 区域、Subnet 名称等信息来搜索Subnet信息。
         */
    public DescribeSubnetsResponse describeSubnets(DescribeSubnetsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeSubnets",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeSubnetsResponse());
    }

        /**
         * 本接口用于将一台或多台实例加入同一个子网并分配内网IP。
         */
    public AssociateSubnetInstancesResponse associateSubnetInstances(AssociateSubnetInstancesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "AssociateSubnetInstances",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new AssociateSubnetInstancesResponse());
    }

        /**
         * 本接口用于将某子网下一台实例从Subnet中解绑。
         */
    public UnAssociateSubnetInstanceResponse unAssociateSubnetInstance(UnAssociateSubnetInstanceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "UnAssociateSubnetInstance",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new UnAssociateSubnetInstanceResponse());
    }

        /**
         * 本接口用于为VPC添加Subnet。
         */
    public AssociateVpcSubnetResponse associateVpcSubnet(AssociateVpcSubnetRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "AssociateVpcSubnet",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new AssociateVpcSubnetResponse());
    }

        /**
         * 本接口用于删除一个Subnet。
         */
    public DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteSubnet",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteSubnetResponse());
    }

        /**
         * 查询可用区信息。​
         */
    public DescribeZonesResponse describeZones(DescribeZonesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeZones",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeZonesResponse());
    }

        /**
         * 查询实例机型配置。
         */
    public DescribeInstanceTypesResponse describeInstanceTypes(DescribeInstanceTypesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeInstanceTypes",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeInstanceTypesResponse());
    }

        /**
         * 查询售卖实例和带宽的可用资源。
         */
    public DescribeAvailableResourcesResponse describeAvailableResources(DescribeAvailableResourcesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAvailableResources",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAvailableResourcesResponse());
    }

        /**
         * 创建一个实例询价。
         */
    public InquiryPriceCreateInstanceResponse inquiryPriceCreateInstance(InquiryPriceCreateInstanceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "InquiryPriceCreateInstance",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new InquiryPriceCreateInstanceResponse());
    }

        /**
         * 查看镜像列表。
         */
    public DescribeImagesResponse describeImages(DescribeImagesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeImages",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeImagesResponse());
    }

        /**
         * 创建一个或多个指定配置的实例。
         */
    public CreateInstancesResponse createInstances(CreateInstancesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateInstances",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateInstancesResponse());
    }

        /**
         * 查询一台或多台实例的信息。用户可以根据实例ID、实例名称或者实例计费模式等条件来查询实例的详细信息。
         */
    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeInstances",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeInstancesResponse());
    }

        /**
         * 本接口用于修改实例的属性（目前只支持修改实例的显示名称）。
         */
    public ModifyInstancesAttributeResponse modifyInstancesAttribute(ModifyInstancesAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyInstancesAttribute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyInstancesAttributeResponse());
    }

        /**
         * 本接口用于启动一个或多个实例。
         */
    public StartInstancesResponse startInstances(StartInstancesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "StartInstances",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new StartInstancesResponse());
    }

        /**
         * 本接口用于关闭一个或多个实例。
         */
    public StopInstancesResponse stopInstances(StopInstancesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "StopInstances",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new StopInstancesResponse());
    }

        /**
         * 本接口用于重启一个或多个实例。
         */
    public RebootInstancesResponse rebootInstances(RebootInstancesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "RebootInstances",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new RebootInstancesResponse());
    }

        /**
         * 本接口用于重装一个实例。
         */
    public ReinstallInstanceResponse reinstallInstance(ReinstallInstanceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ReinstallInstance",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ReinstallInstanceResponse());
    }

        /**
         * 修改实例所属的资源组。
         */
    public ModifyInstancesResourceGroupResponse modifyInstancesResourceGroup(ModifyInstancesResourceGroupRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyInstancesResourceGroup",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyInstancesResourceGroupResponse());
    }

        /**
         * 本接口用于退还一个实例。
         */
    public TerminateInstanceResponse terminateInstance(TerminateInstanceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "TerminateInstance",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new TerminateInstanceResponse());
    }

        /**
         * 本接口用于续费一个实例。
         */
    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "RenewInstance",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new RenewInstanceResponse());
    }

        /**
         * 本接口用于释放一个或多个实例。
         */
    public ReleaseInstancesResponse releaseInstances(ReleaseInstancesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ReleaseInstances",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ReleaseInstancesResponse());
    }

        /**
         * 实例修改带宽询价。
         */
    public InquiryPriceInstanceBandwidthResponse inquiryPriceInstanceBandwidth(InquiryPriceInstanceBandwidthRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "InquiryPriceInstanceBandwidth",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new InquiryPriceInstanceBandwidthResponse());
    }

        /**
         * 修改实例带宽。
         */
    public ModifyInstanceBandwidthResponse modifyInstanceBandwidth(ModifyInstanceBandwidthRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyInstanceBandwidth",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyInstanceBandwidthResponse());
    }

        /**
         * 取消带宽降配订单。
         */
    public CancelInstanceBandwidthDowngradeResponse cancelInstanceBandwidthDowngrade(CancelInstanceBandwidthDowngradeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CancelInstanceBandwidthDowngrade",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CancelInstanceBandwidthDowngradeResponse());
    }

        /**
         * 实例修改流量包询价。
         */
    public InquiryPriceInstanceTrafficPackageResponse inquiryPriceInstanceTrafficPackage(InquiryPriceInstanceTrafficPackageRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "InquiryPriceInstanceTrafficPackage",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new InquiryPriceInstanceTrafficPackageResponse());
    }

        /**
         * 修改实例流量包。
         */
    public ModifyInstanceTrafficPackageResponse modifyInstanceTrafficPackage(ModifyInstanceTrafficPackageRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyInstanceTrafficPackage",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyInstanceTrafficPackageResponse());
    }

        /**
         * 取消流量包降配订单。
         */
    public CancelInstanceTrafficPackageDowngradeResponse cancelInstanceTrafficPackageDowngrade(CancelInstanceTrafficPackageDowngradeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CancelInstanceTrafficPackageDowngrade",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CancelInstanceTrafficPackageDowngradeResponse());
    }

        /**
         * 查询实例带宽、流量包状态。
         */
    public DescribeInstanceInternetStatusResponse describeInstanceInternetStatus(DescribeInstanceInternetStatusRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeInstanceInternetStatus",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeInstanceInternetStatusResponse());
    }

        /**
         * 查询实例指定时间段内的流量信息。
         */
    public DescribeInstanceTrafficResponse describeInstanceTraffic(DescribeInstanceTrafficRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeInstanceTraffic",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeInstanceTrafficResponse());
    }

        /**
         * 查询实例的硬件状态信息。
         */
    public DescribeInstancesMonitorHealthResponse describeInstancesMonitorHealth(DescribeInstancesMonitorHealthRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeInstancesMonitorHealth",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeInstancesMonitorHealthResponse());
    }

        /**
         * 查询可售的Ipv4 Cidr Block资源。
         */
    public DescribeAvailableIpv4ResourcesResponse describeAvailableIpv4Resources(DescribeAvailableIpv4ResourcesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAvailableIpv4Resources",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAvailableIpv4ResourcesResponse());
    }

        /**
         * 创建Ipv4 CidrBlock询价。
         */
    public InquiryPriceCreateIpv4BlockResponse inquiryPriceCreateIpv4Block(InquiryPriceCreateIpv4BlockRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "InquiryPriceCreateIpv4Block",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new InquiryPriceCreateIpv4BlockResponse());
    }

        /**
         * 创建一个或多个Ipv4 Cidr Block。
         */
    public CreateIpv4BlockResponse createIpv4Block(CreateIpv4BlockRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateIpv4Block",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateIpv4BlockResponse());
    }

        /**
         * 查询可售的Ipv6 Cidr Block资源。
         */
    public DescribeAvailableIpv6ResourcesResponse describeAvailableIpv6Resources(DescribeAvailableIpv6ResourcesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAvailableIpv6Resources",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAvailableIpv6ResourcesResponse());
    }

        /**
         * 创建一个或多个IPv6 Cidr Block。
         */
    public CreateIpv6BlockResponse createIpv6Block(CreateIpv6BlockRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateIpv6Block",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateIpv6BlockResponse());
    }

        /**
         * 查询一个或多个Cidr Block的信息。
         */
    public DescribeCidrBlocksResponse describeCidrBlocks(DescribeCidrBlocksRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeCidrBlocks",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeCidrBlocksResponse());
    }

        /**
         * 本接口用于修改一个或多个Cidr Block的属性（目前只支持修改名称）。
         */
    public ModifyCidrBlocksAttributeResponse modifyCidrBlocksAttribute(ModifyCidrBlocksAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyCidrBlocksAttribute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyCidrBlocksAttributeResponse());
    }

        /**
         * 本接口用于续费一个Cidr Block。
         */
    public RenewCidrBlockResponse renewCidrBlock(RenewCidrBlockRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "RenewCidrBlock",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new RenewCidrBlockResponse());
    }

        /**
         * 本接口用于退还一个Cidr Block。
         */
    public TerminateCidrBlockResponse terminateCidrBlock(TerminateCidrBlockRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "TerminateCidrBlock",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new TerminateCidrBlockResponse());
    }

        /**
         * 释放一个或多个Ipv4 Cidr Block。
         */
    public ReleaseCidrBlocksResponse releaseCidrBlocks(ReleaseCidrBlocksRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ReleaseCidrBlocks",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ReleaseCidrBlocksResponse());
    }

        /**
         * 查询实例可用的Cidr Block。
         */
    public DescribeInstanceAvailableCidrBlockResponse describeInstanceAvailableCidrBlock(DescribeInstanceAvailableCidrBlockRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeInstanceAvailableCidrBlock",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeInstanceAvailableCidrBlockResponse());
    }

        /**
         * 查询一个Cidr Block的IP列表。
         */
    public DescribeCidrBlockIpsResponse describeCidrBlockIps(DescribeCidrBlockIpsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeCidrBlockIps",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeCidrBlockIpsResponse());
    }

        /**
         * 实例绑定一个或多个Cidr Block IP。
         */
    public BindCidrBlockIpsResponse bindCidrBlockIps(BindCidrBlockIpsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "BindCidrBlockIps",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new BindCidrBlockIpsResponse());
    }

        /**
         * 实例解绑一个或多个Cidr Block IP。
         */
    public UnbindCidrBlockIpsResponse unbindCidrBlockIps(UnbindCidrBlockIpsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "UnbindCidrBlockIps",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new UnbindCidrBlockIpsResponse());
    }

        /**
         * 创建EIP询价。
         */
    public InquiryPriceCreateEipAddressResponse inquiryPriceCreateEipAddress(InquiryPriceCreateEipAddressRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "InquiryPriceCreateEipAddress",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new InquiryPriceCreateEipAddressResponse());
    }

        /**
         * 查询一台或多台指定EIP的信息。用户可以根据EIP ID、IP或者计费模式等信息来搜索EIP的信息。
         */
    public DescribeEipAddressesResponse describeEipAddresses(DescribeEipAddressesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeEipAddresses",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeEipAddressesResponse());
    }

        /**
         * 创建一个或多个EIP。
         */
    public AllocateEipAddressesResponse allocateEipAddresses(AllocateEipAddressesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "AllocateEipAddresses",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new AllocateEipAddressesResponse());
    }

        /**
         * 修改弹性IP所属的资源组。
         */
    public ModifyEipAddressesResourceGroupResponse modifyEipAddressesResourceGroup(ModifyEipAddressesResourceGroupRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyEipAddressesResourceGroup",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyEipAddressesResourceGroupResponse());
    }

        /**
         * 查询实例可绑定的EIP列表。
         */
    public DescribeInstanceAvailableEipResourcesResponse describeInstanceAvailableEipResources(DescribeInstanceAvailableEipResourcesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeInstanceAvailableEipResources",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeInstanceAvailableEipResourcesResponse());
    }

        /**
         * 将EIP绑定到同区域的机器实例上。
         */
    public AssociateEipAddressResponse associateEipAddress(AssociateEipAddressRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "AssociateEipAddress",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new AssociateEipAddressResponse());
    }

        /**
         * 将EIP上已绑定的机器实例解绑。
         */
    public UnAssociateEipAddressResponse unAssociateEipAddress(UnAssociateEipAddressRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "UnAssociateEipAddress",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new UnAssociateEipAddressResponse());
    }

        /**
         * 查询区域可购买EIP资源。
         */
    public DescribeEipAvailableResourcesResponse describeEipAvailableResources(DescribeEipAvailableResourcesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeEipAvailableResources",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeEipAvailableResourcesResponse());
    }

        /**
         * 本接口用于退还一个EIP。
         */
    public TerminateEipAddressResponse terminateEipAddress(TerminateEipAddressRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "TerminateEipAddress",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new TerminateEipAddressResponse());
    }

        /**
         * 本接口用于续费一个EIP。
         */
    public RenewEipAddressResponse renewEipAddress(RenewEipAddressRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "RenewEipAddress",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new RenewEipAddressResponse());
    }

        /**
         * 释放一个或多个EIP。
         */
    public ReleaseEipAddressesResponse releaseEipAddresses(ReleaseEipAddressesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ReleaseEipAddresses",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ReleaseEipAddressesResponse());
    }

        /**
         * 本接口用于查询支持VPC组网的节点区域信息。
         */
    public DescribeVpcAvailableRegionsResponse describeVpcAvailableRegions(DescribeVpcAvailableRegionsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeVpcAvailableRegions",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeVpcAvailableRegionsResponse());
    }

        /**
         * 本接口用于创建一个私有网络VPC。
         */
    public CreateVpcResponse createVpc(CreateVpcRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateVpc",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateVpcResponse());
    }

        /**
         * 本接口用于查询一个或多个指定VPC的信息。用户可以根据VPC ID、Subnet ID、 VPC节点ID、VPC名称等信息来搜索VPC信息。
         */
    public DescribeVpcsResponse describeVpcs(DescribeVpcsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeVpcs",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeVpcsResponse());
    }

        /**
         * 本接口用于修改VPC的属性（目前只支持修改VPC的名称）。
         */
    public ModifyVpcsAttributeResponse modifyVpcsAttribute(ModifyVpcsAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyVpcsAttribute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyVpcsAttributeResponse());
    }

        /**
         * 本接口用于删除一个Vpc。
         */
    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteVpc",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteVpcResponse());
    }

        /**
         * 查询支持创建负载均衡的区域。
         */
    public DescribeLoadBalancerZonesResponse describeLoadBalancerZones(DescribeLoadBalancerZonesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeLoadBalancerZones",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeLoadBalancerZonesResponse());
    }

        /**
         * 查询可用区节点下可用的负载均衡规格列表。
         */
    public DescribeLoadBalancerSpecsResponse describeLoadBalancerSpecs(DescribeLoadBalancerSpecsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeLoadBalancerSpecs",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeLoadBalancerSpecsResponse());
    }

        /**
         * 创建负载均衡实例。
         */
    public CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateLoadBalancer",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateLoadBalancerResponse());
    }

        /**
         * 查询一台或多台指定负载均衡实例的信息。用户可以根据负载均衡实例的ID、可用区等信息来搜索负载均衡实例的信息。
         */
    public DescribeLoadBalancersResponse describeLoadBalancers(DescribeLoadBalancersRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeLoadBalancers",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeLoadBalancersResponse());
    }

        /**
         * 修改负载均衡实例的名称。
         */
    public ModifyLoadBalancersNameResponse modifyLoadBalancersName(ModifyLoadBalancersNameRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyLoadBalancersName",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyLoadBalancersNameResponse());
    }

        /**
         * 终止负载均衡实例。
         */
    public TerminateLoadBalancerResponse terminateLoadBalancer(TerminateLoadBalancerRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "TerminateLoadBalancer",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new TerminateLoadBalancerResponse());
    }

        /**
         * 恢复被删除的负载均衡实例。
         */
    public RestoreLoadBalancerResponse restoreLoadBalancer(RestoreLoadBalancerRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "RestoreLoadBalancer",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new RestoreLoadBalancerResponse());
    }

        /**
         * 释放负载均衡实例。
         */
    public ReleaseLoadBalancerResponse releaseLoadBalancer(ReleaseLoadBalancerRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ReleaseLoadBalancer",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ReleaseLoadBalancerResponse());
    }

        /**
         * 在网络型负载均衡实例中创建TCP、UDP或TCPSSL监听。
         */
    public CreateListenerResponse createListener(CreateListenerRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateListener",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateListenerResponse());
    }

        /**
         * 查询一台或多台指定Listener的信息。用户可以根据负载均衡实例的ID、监听器的ID等信息来搜索监听器的信息。
         */
    public DescribeListenersResponse describeListeners(DescribeListenersRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeListeners",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeListenersResponse());
    }

        /**
         * 修改监听器配置。
         */
    public ModifyListenerAttributeResponse modifyListenerAttribute(ModifyListenerAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyListenerAttribute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyListenerAttributeResponse());
    }

        /**
         * 删除负载均衡监听器。
         */
    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteListener",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteListenerResponse());
    }

        /**
         * 创建负载均衡的VIP。
         */
    public CreateLoadBalancerVIPsResponse createLoadBalancerVIPs(CreateLoadBalancerVIPsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateLoadBalancerVIPs",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateLoadBalancerVIPsResponse());
    }

        /**
         * 删除负载均衡的IP。
         */
    public DeleteLoadBalancerVIPResponse deleteLoadBalancerVIP(DeleteLoadBalancerVIPRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteLoadBalancerVIP",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteLoadBalancerVIPResponse());
    }

        /**
         * 查询一台或多台指定后端配置服务器的信息。用户可以根据监听器的ID、后端配置服务器的ID等信息来搜索后端配置服务器的信息。
         */
    public DescribeBackendsResponse describeBackends(DescribeBackendsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeBackends",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeBackendsResponse());
    }

        /**
         * 创建将一台后端服务绑定到负载均衡的监听器。
         */
    public RegisterBackendResponse registerBackend(RegisterBackendRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "RegisterBackend",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new RegisterBackendResponse());
    }

        /**
         * 删除负载均衡后端配置服务器。
         */
    public DeregisterBackendResponse deregisterBackend(DeregisterBackendRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeregisterBackend",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeregisterBackendResponse());
    }

        /**
         * 本接口用于查询一台或多台实例的信息。用户可以根据实例ID、实例名称等条件来查询实例的详细信息。
         */
    public DescribeManagedInstancesResponse describeManagedInstances(DescribeManagedInstancesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeManagedInstances",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeManagedInstancesResponse());
    }

        /**
         * 查询托管实例指定时间段内的流量信息。
         */
    public DescribeManagedInstanceTrafficResponse describeManagedInstanceTraffic(DescribeManagedInstanceTrafficRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeManagedInstanceTraffic",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeManagedInstanceTrafficResponse());
    }

}