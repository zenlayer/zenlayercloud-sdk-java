/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.bmc20221120.models.*;
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

    /**
     * 查询可用区信息。
     */
    public DescribeZonesResponse describeZones(DescribeZonesRequest request) {
        Map<String, ?> resp = super.callApi(request, "ZoneDetails", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeZonesResponse());
    }

    /**
     * 创建一个或多个指定配置的实例。
     */
    public CreateInstancesResponse createInstances(CreateInstancesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateInstances", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new CreateInstancesResponse());
    }

    /**
     * 查看镜像列表。
     */
    public DescribeImagesResponse describeImages(DescribeImagesRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeImages", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeImagesResponse());
    }

    /**
     * 查询实例机型配置。
     */
    public DescribeInstanceTypesResponse describeInstanceTypes(DescribeInstanceTypesRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeInstanceTypes", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeInstanceTypesResponse());
    }

    /**
     * 查询售卖实例和带宽的可用资源。
     */
    public DescribeAvailableResourcesResponse describeAvailableResources(DescribeAvailableResourcesRequest request) {
        RuntimeOptions runtime = new RuntimeOptions();
        Map<String, ?> resp = super.callApi(request, "DescribeAvailableResources", runtime);
        return TeaModel.toModel(resp, new DescribeAvailableResourcesResponse());
    }

    /**
     * 查询一台或多台实例的信息。用户可以根据实例ID、实例名称或者实例计费模式等条件来查询实例的详细信息。
     */
    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeInstances", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeInstancesResponse());
    }

    /**
     * 启动一个或多个实例。
     */
    public StartInstancesResponse startInstances(StartInstancesRequest request) {
        Map<String, ?> resp = super.callApi(request, "StartInstances", new RuntimeOptions());
        return TeaModel.toModel(resp, new StartInstancesResponse());
    }

    /**
     * 关闭一个或多个实例。
     */
    public StopInstancesResponse stopInstances(StopInstancesRequest request) {
        Map<String, ?> resp = super.callApi(request, "StopInstances", new RuntimeOptions());
        return TeaModel.toModel(resp, new StopInstancesResponse());
    }

    /**
     * 重启一个或多个实例。
     */
    public RebootInstancesResponse rebootInstances(RebootInstancesRequest request) {
        Map<String, ?> resp = super.callApi(request, "RebootInstances", new RuntimeOptions());
        return TeaModel.toModel(resp, new RebootInstancesResponse());
    }

    /**
     * 重装一个实例。
     */
    public ReinstallInstanceResponse reinstallInstance(ReinstallInstanceRequest request) {
        Map<String, ?> resp = super.callApi(request, "ReinstallInstance", new RuntimeOptions());
        return TeaModel.toModel(resp, new ReinstallInstanceResponse());
    }

    /**
     * 退还一个实例。
     */
    public TerminateInstanceResponse terminateInstance(TeminateInstanceRequest request) {
        Map<String, ?> resp = super.callApi(request, "TerminateInstance", new RuntimeOptions());
        return TeaModel.toModel(resp, new TerminateInstanceResponse());
    }

    /**
     * 释放一个或多个实例。
     */
    public ReleaseInstancesResponse releaseInstances(ReleaseInstancesRequest request) {
        Map<String, ?> resp = super.callApi(request, "ReleaseInstances", new RuntimeOptions());
        return TeaModel.toModel(resp, new ReleaseInstancesResponse());
    }

    /**
     * 续费一个实例。
     */
    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) {
        Map<String, ?> resp = super.callApi(request, "RenewInstance", new RuntimeOptions());
        return TeaModel.toModel(resp, new RenewInstanceResponse());
    }

    /**
     * 修改实例的属性（目前只支持修改实例的显示名称）。
     */
    public ModifyInstancesAttributeResponse modifyInstancesAttribute(ModifyInstancesAttributeRequest request) {
        Map<String, ?> resp = super.callApi(request, "ModifyInstancesAttribute", new RuntimeOptions());
        return TeaModel.toModel(resp, new ModifyInstancesAttributeResponse());
    }

    /**
     * 创建一个实例询价。
     */
    public InquiryPriceCreateInstanceResponse inquiryPriceCreateInstance(InquiryPriceCreateInstanceRequest request) {
        Map<String, ?> resp = super.callApi(request, "InquiryPriceCreateInstance", new RuntimeOptions());
        return TeaModel.toModel(resp, new InquiryPriceCreateInstanceResponse());
    }

    /**
     * 取消带宽降配订单。
     */
    public CancelInstanceBandwidthDowngradeResponse cancelInstanceBandwidthDowngrade(CancelInstanceBandwidthDowngradeRequest request) {
        Map<String, ?> resp = super.callApi(request, "CancelInstanceBandwidthDowngrade", new RuntimeOptions());
        return TeaModel.toModel(resp, new CancelInstanceBandwidthDowngradeResponse());
    }

    /**
     * 修改实例带宽。
     */
    public ModifyInstanceBandwidthResponse modifyInstanceBandwidth(ModifyInstanceBandwidthRequest request) {
        Map<String, ?> resp = super.callApi(request, "ModifyInstanceBandwidth", new RuntimeOptions());
        return TeaModel.toModel(resp, new ModifyInstanceBandwidthResponse());
    }

    /**
     * 实例修改带宽询价。
     */
    public InquiryPriceInstanceBandwidthResponse inquiryPriceInstanceBandwidth(InquiryPriceInstanceBandwidthRequest request) {
        Map<String, ?> resp = super.callApi(request, "InquiryPriceInstanceBandwidth", new RuntimeOptions());
        return TeaModel.toModel(resp, new InquiryPriceInstanceBandwidthResponse());
    }

    /**
     * 取消流量包降配订单。
     */
    public CancelInstanceTrafficPackageDowngradeResponse cancelInstanceTrafficPackageDowngrade(
            CancelInstanceTrafficPackageDowngradeRequest request) {
        Map<String, ?> resp = super.callApi(request, "CancelInstanceTrafficPackageDowngrade", new RuntimeOptions());
        return TeaModel.toModel(resp, new CancelInstanceTrafficPackageDowngradeResponse());
    }

    /**
     * 修改实例流量包。
     */
    public ModifyInstanceTrafficPackageResponse modifyInstanceTrafficPackage(ModifyInstanceTrafficPackageRequest request) {
        Map<String, ?> resp = super.callApi(request, "ModifyInstanceTrafficPackage", new RuntimeOptions());
        return TeaModel.toModel(resp, new ModifyInstanceTrafficPackageResponse());
    }

    /**
     * 实例修改流量包询价。
     */
    public InquiryPriceInstanceTrafficPackageResponse inquiryPriceInstanceTrafficPackage(
            InquiryPriceInstanceTrafficPackageRequest request) {
        Map<String, ?> resp = super.callApi(request, "InquiryPriceInstanceTrafficPackage", new RuntimeOptions());
        return TeaModel.toModel(resp, new InquiryPriceInstanceTrafficPackageResponse());
    }

    /**
     * 查询实例带宽、流量包状态。
     */
    public DescribeInstanceInternetStatusResponse describeInstanceInternetStatus(DescribeInstanceInternetStatusRequest request) {
        Map<String, ?> resp = super.callApi(request, "DescribeInstanceInternetStatus", new RuntimeOptions());
        return TeaModel.toModel(resp, new DescribeInstanceInternetStatusResponse());
    }

    /**
     * 修改实例所属的资源组。
     */
    public ModifyInstancesResourceGroupResponse modifyInstancesResourceGroup(ModifyInstancesResourceGroupRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyInstancesResourceGroup", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyInstancesResourceGroupResponse());
    }

    /**
     * 查询实例流量包用量
     */
    public DescribeInstanceTrafficResponse describeInstanceTraffic(DescribeInstanceTrafficRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeInstanceTraffic", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeInstanceTrafficResponse());
    }

    /**
     * 调用本接口用于查询实例的硬件状态信息。
     */
    public DescribeInstancesMonitorHealthResponse describeInstancesMonitorHealth(DescribeInstancesMonitorHealthRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeInstancesMonitorHealth", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeInstancesMonitorHealthResponse());
    }

    /*************** EIP ****************/

    /**
     * 查询一台或多台指定EIP的信息。用户可以根据EIP ID、IP或者计费模式等信息来搜索EIP的信息。
     */
    public DescribeEipAddressesResponse describeEipAddresses(DescribeEipAddressesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeEipAddresses", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeEipAddressesResponse());
    }

    /**
     * 查询区域可购买EIP资源。
     */
    public DescribeEipAvailableResourcesResponse describeEipAvailableResources(DescribeEipAvailableResourcesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeEipAvailableResources", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeEipAvailableResourcesResponse());
    }

    /**
     * 创建一个或多个EIP。
     */
    public AllocateEipAddressesResponse allocateEipAddresses(AllocateEipAddressesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AllocateEipAddresses", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AllocateEipAddressesResponse());
    }

    /**
     * 退还一个EIP。
     */
    public TerminateEipAddressResponse terminateEipAddress(TerminateEipAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "TerminateEipAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new TerminateEipAddressResponse());
    }

    /**
     * 释放一个或多个EIP。
     */
    public ReleaseEipAddressesResponse releaseEipAddresses(ReleaseEipAddressesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ReleaseEipAddresses", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ReleaseEipAddressesResponse());
    }

    /**
     * 续费一个EIP。
     */
    public RenewEipAddressResponse renewEipAddress(RenewEipAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "RenewEipAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new RenewEipAddressResponse());
    }

    /**
     * EIP绑定到同区域的机器实例上。
     */
    public AssociateEipAddressResponse associateEipAddress(AssociateEipAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AssociateEipAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AssociateEipAddressResponse());
    }

    /**
     * EIP上已绑定的机器实例解绑。
     */
    public UnAssociateEipAddressResponse unAssociateEipAddress(UnAssociateEipAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "UnAssociateEipAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new UnAssociateEipAddressResponse());
    }

    /**
     * 创建EIP询价。
     */
    public InquiryPriceCreateEipAddressResponse inquiryPriceCreateEipAddress(InquiryPriceCreateEipAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "InquiryPriceCreateEipAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new InquiryPriceCreateEipAddressResponse());
    }

    /**
     * 查询实例可绑定的EIP列表。
     */
    public DescribeInstanceAvailableEipResourcesResponse describeInstanceAvailableEipResources(
            DescribeInstanceAvailableEipResourcesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeInstanceAvailableEipResources", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeInstanceAvailableEipResourcesResponse());
    }

    /**
     * 修改弹性IP所属的资源组。
     */
    public ModifyEipAddressesResourceGroupResponse modifyEipAddressesResourceGroup(ModifyEipAddressesResourceGroupRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyEipAddressesResourceGroup", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyEipAddressesResourceGroupResponse());
    }

    /*************** DDOS IP ***************/

    /**
     * 查询一台或多台指定Ddos IP的信息。用户可以根据Ddos IP ID、IP或者计费模式等信息来搜索Ddos IP信息。
     * DDoS产品已下架
     */
    @Deprecated
    public DescribeDdosIpAddressesResponse describeDdosIpAddresses(DescribeDdosIpAddressesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeDdosIpAddresses", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeDdosIpAddressesResponse());
    }

    /**
     * 查询区域可购买Ddos IP资源。
     * DDoS产品已下架
     */
    @Deprecated
    public DescribeDdosIpAvailableResourcesResponse describeDdosIpAvailableResources(DescribeDdosIpAvailableResourcesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeDdosIpAvailableResources", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeDdosIpAvailableResourcesResponse());
    }

    /**
     * 创建一个或多个Ddos IP。
     * DDoS产品已下架
     */
    @Deprecated
    public AllocateDdosIpAddressesResponse allocateDdosIpAddresses(AllocateDdosIpAddressesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AllocateDdosIpAddresses", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AllocateDdosIpAddressesResponse());
    }

    /**
     * 退还一个Ddos IP。
     * DDoS产品已下架
     */
    @Deprecated
    public TerminateDdosIpAddressResponse terminateDdosIpAddress(TerminateDdosIpAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "TerminateDdosIpAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new TerminateDdosIpAddressResponse());
    }

    /**
     * 释放一个或多个Ddos IP。
     * DDoS产品已下架
     */
    @Deprecated
    public ReleaseDdosIpAddressesResponse releaseDdosIpAddresses(ReleaseDdosIpAddressesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ReleaseDdosIpAddresses", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ReleaseDdosIpAddressesResponse());
    }

    /**
     * 续费一个DDoS IP。
     * DDoS产品已下架。
     */
    @Deprecated
    public RenewDdosIpAddressResponse renewDdosIpAddress(RenewDdosIpAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "RenewDdosIpAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new RenewDdosIpAddressResponse());
    }

    /**
     * DDoS IP绑定到同区域的机器实例上。
     * DDoS产品已下架。
     */
    @Deprecated
    public AssociateDdosIpAddressResponse associateDdosIpAddress(AssociateDdosIpAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AssociateDdosIpAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AssociateDdosIpAddressResponse());
    }

    /**
     * Ddos IP上已绑定的机器解绑。
     * DDoS产品已下架。
     */
    @Deprecated
    public UnAssociateDdosIpAddressResponse unAssociateDdosIpAddress(UnAssociateDdosIpAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "UnAssociateDdosIpAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new UnAssociateDdosIpAddressResponse());
    }

    /**
     * 创建Ddos IP询价。
     * DDoS产品已下架。
     */
    @Deprecated
    public InquiryPriceCreateDdosIpAddressResponse inquiryPriceCreateDdosIpAddress(InquiryPriceCreateDdosIpAddressRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "InquiryPriceCreateDdosIpAddress", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new InquiryPriceCreateDdosIpAddressResponse());
    }

    /**
     * 查询实例可绑定的Ddos IP列表。
     * DDoS产品已下架。
     */
    @Deprecated
    public DescribeInstanceAvailableDdosIpResourcesResponse describeInstanceAvailableDdosIpResources(
            DescribeInstanceAvailableDdosIpResourcesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeInstanceAvailableDdosIpResources", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeInstanceAvailableDdosIpResourcesResponse());
    }

    /**
     * 修改DDoS防护IP所属的资源组。
     *  DDoS产品已下架。
     */
    @Deprecated
    public ModifyDdosIpAddressesResourceGroupResponse modifyDdosIpAddressesResourceGroup(
            ModifyDdosIpAddressesResourceGroupRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyDdosIpAddressesResourceGroup", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyDdosIpAddressesResourceGroupResponse());
    }

    /*************** CIDR BLOCK ***************/

    /**
     * 查询一个或多个Cidr Block的信息。
     */
    public DescribeCidrBlocksResponse describeCidrBlocks(DescribeCidrBlocksRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeCidrBlocks", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeCidrBlocksResponse());
    }

    /**
     * 查询一个Cidr Block的IP列表。
     */
    public DescribeCidrBlockIpsResponse describeCidrBlockIps(DescribeCidrBlockIpsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeCidrBlockIps", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeCidrBlockIpsResponse());
    }

    /**
     * 查询可售的Ipv4 Cidr Block资源。
     */
    public DescribeAvailableIpv4ResourcesResponse describeAvailableIpv4Resources(DescribeAvailableIpv4ResourcesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeAvailableIpv4Resources", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeAvailableIpv4ResourcesResponse());
    }

    /**
     * 查询可售的Ipv6 Cidr Block资源。
     */
    public DescribeAvailableIpv6ResourcesResponse describeAvailableIpv6Resources(DescribeAvailableIpv6ResourcesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeAvailableIpv6Resources", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeAvailableIpv6ResourcesResponse());
    }

    /**
     * 查询实例可用的Cidr Block。
     */
    public DescribeInstanceAvailableCidrBlockResponse describeInstanceAvailableCidrBlock(
            DescribeInstanceAvailableCidrBlockRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeInstanceAvailableCidrBlock", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeInstanceAvailableCidrBlockResponse());
    }

    /**
     * 创建Ipv4 CidrBlock询价。
     */
    public InquiryPriceCreateIpv4BlockResponse inquiryPriceCreateIpv4Block(InquiryPriceCreateIpv4BlockRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "InquiryPriceCreateIpv4Block", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new InquiryPriceCreateIpv4BlockResponse());
    }

    /**
     * 创建一个或多个Ipv4 Cidr Block。
     */
    public CreateIpv4BlockResponse createIpv4Block(CreateIpv4BlockRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateIpv4Block", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateIpv4BlockResponse());
    }

    /**
     * 创建一个或多个Ipv6 Cidr Block。
     */
    public CreateIpv6BlockResponse createIpv6Block(CreateIpv6BlockRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateIpv6Block", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateIpv6BlockResponse());
    }

    /**
     * 修改一个或多个Cidr Block的属性（目前只支持修改名称）。
     */
    public ModifyCidrBlocksAttributeResponse modifyCidrBlocksAttribute(ModifyCidrBlocksAttributeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyCidrBlocksAttribute", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyCidrBlocksAttributeResponse());
    }

    /**
     * 续费一个Cidr Block。
     */
    public RenewCidrBlockResponse renewCidrBlock(RenewCidrBlockRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "RenewCidrBlock", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new RenewCidrBlockResponse());
    }

    /**
     * 退还一个Cidr Block。
     */
    public TerminateCidrBlockResponse terminateCidrBlock(TerminateCidrBlockRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "TerminateCidrBlock", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new TerminateCidrBlockResponse());
    }

    /**
     * 释放一个或多个Ipv4 Cidr Block。
     */
    public ReleaseCidrBlocksResponse releaseCidrBlocks(ReleaseCidrBlocksRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ReleaseCidrBlocks", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ReleaseCidrBlocksResponse());
    }

    /**
     * 实例绑定一个或多个Cidr Block IP。
     */
    public BindCidrBlockIpsResponse bindCidrBlockIps(BindCidrBlockIpsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "BindCidrBlockIps", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new BindCidrBlockIpsResponse());
    }

    /**
     * 实例解绑一个或多个Cidr Block IP。
     */
    public UnbindCidrBlockIpsResponse unbindCidrBlockIps(UnbindCidrBlockIpsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "UnbindCidrBlockIps", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new UnbindCidrBlockIpsResponse());
    }

    /*************** VPC ***************/

    /**
     * 查询支持VPC组网的节点区域信息。
     */
    public DescribeVpcAvailableRegionsResponse describeVpcAvailableRegions(DescribeVpcAvailableRegionsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeVpcAvailableRegions", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeVpcAvailableRegionsResponse());
    }

    /**
     * 修改VPC的属性（目前只支持修改VPC的名称）。
     */
    public ModifyVpcsAttributeResponse modifyVpcsAttribute(ModifyVpcsAttributeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyVpcsAttribute", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyVpcsAttributeResponse());
    }

    /**
     * 创建一个私有网络VPC。
     */
    public CreateVpcResponse createVpc(CreateVpcRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateVpc", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateVpcResponse());
    }

    /**
     * 查询一个或多个指定VPC的信息。用户可以根据VPC ID、Subnet ID、 VPC节点ID、VPC名称等信息来搜索VPC信息。
     */
    public DescribeVpcsResponse describeVpcs(DescribeVpcsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeVpcs", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeVpcsResponse());
    }

    /**
     * 删除一个Vpc。
     */
    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeleteVpc", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DeleteVpcResponse());
    }

    /*************** Subnet ***************/

    /**
     * 查询可创建Subnet资源的可用区。
     */
    public DescribeSubnetAvailableResourcesResponse describeSubnetAvailableResources(DescribeSubnetAvailableResourcesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeSubnetAvailableResources", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeSubnetAvailableResourcesResponse());
    }

    /**
     * 创建一个私有网络Subnet。
     */
    public CreateSubnetResponse createSubnet(CreateSubnetRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateSubnet", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateSubnetResponse());
    }

    /**
     * 修改Subnet的属性（目前只支持修改Subnet的名称）。
     */
    public ModifySubnetsAttributeResponse modifySubnetsAttribute(ModifySubnetsAttributeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifySubnetsAttribute", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifySubnetsAttributeResponse());
    }

    /**
     * 删除一个Subnet。
     */
    public DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeleteSubnet", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DeleteSubnetResponse());
    }

    /**
     * 查询一台或多台指定Subnet的信息。用户可以根据Subnet ID、VPC ID、 区域、Subnet 名称等信息来搜索Subnet信息。
     */
    public DescribeSubnetsResponse describeSubnets(DescribeSubnetsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeSubnets", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeSubnetsResponse());
    }

    /**
     * 一台或多台实例加入同一个子网并分配内网IP。
     */
    public AssociateSubnetInstanceResponse associateSubnetInstances(AssociateSubnetInstancesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AssociateSubnetInstances", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AssociateSubnetInstanceResponse());
    }

    /**
     * 某子网下一台实例从Subnet中解绑。
     */
    public UnAssociateSubnetInstanceResponse unAssociateSubnetInstance(UnAssociateSubnetInstanceRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "UnAssociateSubnetInstance", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new UnAssociateSubnetInstanceResponse());
    }

    /**
     * VPC添加Subnet。
     */
    public AssociateVpcSubnetResponse associateVpcSubnet(AssociateVpcSubnetRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AssociateVpcSubnet", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AssociateVpcSubnetResponse());
    }


    /**
     * 查询一台或多台实例的信息。
     * 用户可以根据实例ID、实例名称等条件来查询实例的详细信息。
     */
    public DescribeManagedInstancesResponse describeManagedInstances(DescribeManagedInstancesRequest request) {
        Map<String, ?> rsp = super.callApi(request, "DescribeManagedInstances", new RuntimeOptions());
        return TeaModel.toModel(rsp, new DescribeManagedInstancesResponse());
    }

    /**
     * 查询托管实例流量包用量
     */
    public DescribeInstanceTrafficResponse describeManagedInstanceTraffic(DescribeInstanceTrafficRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeManagedInstanceTraffic", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeInstanceTrafficResponse());
    }
}
