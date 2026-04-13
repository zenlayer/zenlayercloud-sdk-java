/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.vm20260401;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.vm20260401.models.*;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;

import java.util.Map;


public class VmClient extends AbstractClient {
    private static final String VERSION = "2026-04-01";
    private static final String ENDPOINT = "console.zenlayer.com";
    private static final String PATH = "/api/v2/vm";

    public VmClient(Credential credential, Config config) {
        super(credential, config,
            config.getEndpoint() != null ? config.getEndpoint() : ENDPOINT,
            VERSION, PATH);
    }

        /**
         * 创建VPC。
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
         * 创建VPC的子网。
         */
    public CreateVpcSubnetResponse createVpcSubnet(CreateVpcSubnetRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateVpcSubnet",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateVpcSubnetResponse());
    }

        /**
         * 删除一个VPC子网。
         */
    public DeleteVpcSubnetResponse deleteVpcSubnet(DeleteVpcSubnetRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteVpcSubnet",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteVpcSubnetResponse());
    }

        /**
         * 修改VPC子网的属性（目前只支持修改VPC子网的名称）。
         */
    public ModifyVpcSubnetsAttributeResponse modifyVpcSubnetsAttribute(ModifyVpcSubnetsAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyVpcSubnetsAttribute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyVpcSubnetsAttributeResponse());
    }

        /**
         * 查询一台或多台指定子网的信息。用户可以根据Subnet ID、VPC ID、Subnet名称等信息来搜索Subnet信息。
         */
    public DescribeVpcSubnetsResponse describeVpcSubnets(DescribeVpcSubnetsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeVpcSubnets",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeVpcSubnetsResponse());
    }

        /**
         * 修改VPC的属性（目前只支持修改VPC的名称）。
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
         * 查询一台或多台指定子网的信息。用户可以根据VPC ID、VPC名称等信息来搜索VPC信息。
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
         * 删除一个VPC。
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
         * 配置安全组的规则。
         */
    public ConfigureSecurityGroupRulesResponse configureSecurityGroupRules(ConfigureSecurityGroupRulesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ConfigureSecurityGroupRules",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ConfigureSecurityGroupRulesResponse());
    }

        /**
         * 移除安全组的规则。
         */
    public RevokeSecurityGroupRulesResponse revokeSecurityGroupRules(RevokeSecurityGroupRulesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "RevokeSecurityGroupRules",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new RevokeSecurityGroupRulesResponse());
    }

        /**
         * 为安全组绑定实例。
         */
    public AssociateSecurityGroupInstanceResponse associateSecurityGroupInstance(AssociateSecurityGroupInstanceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "AssociateSecurityGroupInstance",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new AssociateSecurityGroupInstanceResponse());
    }

        /**
         * 为安全组解绑实例。
         */
    public UnAssociateSecurityGroupInstanceResponse unAssociateSecurityGroupInstance(UnAssociateSecurityGroupInstanceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "UnAssociateSecurityGroupInstance",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new UnAssociateSecurityGroupInstanceResponse());
    }

        /**
         * 获取实例可绑定的安全组。
         */
    public DescribeInstanceAvailableSecurityGroupResourcesResponse describeInstanceAvailableSecurityGroupResources(DescribeInstanceAvailableSecurityGroupResourcesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeInstanceAvailableSecurityGroupResources",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeInstanceAvailableSecurityGroupResourcesResponse());
    }

        /**
         * 创建安全组。
         */
    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateSecurityGroup",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateSecurityGroupResponse());
    }

        /**
         * 删除安全组。
         */
    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteSecurityGroup",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteSecurityGroupResponse());
    }

        /**
         * 新增安全组单条规则。
         */
    public AuthorizeSecurityGroupRuleResponse authorizeSecurityGroupRule(AuthorizeSecurityGroupRuleRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "AuthorizeSecurityGroupRule",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new AuthorizeSecurityGroupRuleResponse());
    }

        /**
         * 新增安全组的规则。
         */
    public AuthorizeSecurityGroupRulesResponse authorizeSecurityGroupRules(AuthorizeSecurityGroupRulesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "AuthorizeSecurityGroupRules",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new AuthorizeSecurityGroupRulesResponse());
    }

        /**
         * 查询一个或多个指定安全组的信息。用户可以根据安全组ID、安全组名称等信息来搜索安全组信息。
         */
    public DescribeSecurityGroupsResponse describeSecurityGroups(DescribeSecurityGroupsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeSecurityGroups",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeSecurityGroupsResponse());
    }

        /**
         * 修改安全组的属性（目前只支持修改安全组的名称）。
         */
    public ModifySecurityGroupsAttributeResponse modifySecurityGroupsAttribute(ModifySecurityGroupsAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifySecurityGroupsAttribute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifySecurityGroupsAttributeResponse());
    }

        /**
         * 删除一个子网。
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
         * 修改子网的属性（目前只支持修改子网的名称）。
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
         * 查询一台或多台指定子网的信息。用户可以根据Subnet ID、区域、Subnet名称等信息来搜索Subnet信息。
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
         * 创建子网。
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
         * 删除一个或多个镜像。
         */
    public DeleteImagesResponse deleteImages(DeleteImagesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteImages",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteImagesResponse());
    }

        /**
         * 创建自定义镜像。
         */
    public CreateImageResponse createImage(CreateImageRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateImage",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateImageResponse());
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
         * 修改镜像属性。
         */
    public ModifyImagesAttributesResponse modifyImagesAttributes(ModifyImagesAttributesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyImagesAttributes",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyImagesAttributesResponse());
    }

        /**
         * 查询可创建镜像的配额。
         */
    public DescribeImageQuotaResponse describeImageQuota(DescribeImageQuotaRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeImageQuota",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeImageQuotaResponse());
    }

        /**
         * 查询可用地区。
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
         * 将虚拟机实例操作系统的密码重置为用户指定的密码。
         */
    public ResetInstancesPasswordResponse resetInstancesPassword(ResetInstancesPasswordRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ResetInstancesPassword",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ResetInstancesPasswordResponse());
    }

        /**
         * 重装一台虚拟机实例上的操作系统。
         */
    public ResetInstanceResponse resetInstance(ResetInstanceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ResetInstance",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ResetInstanceResponse());
    }

        /**
         * 退还一个虚拟机实例。
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
         * 释放一个或多个虚拟机实例。
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
         * 修改虚拟机实例所属的资源组。
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
         * 取消虚拟机实例流量包降配订单。
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
         * 修改虚拟机实例流量包大小。
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
         * 虚拟机实例修改流量包询价。
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
         * 获取实例VNC地址。
         */
    public DescribeVncUrlResponse describeVncUrl(DescribeVncUrlRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeVncUrl",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeVncUrlResponse());
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
         * 查询实例指定时间段内的CPU使用率。
         */
    public DescribeInstanceCpuMonitorResponse describeInstanceCpuMonitor(DescribeInstanceCpuMonitorRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeInstanceCpuMonitor",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeInstanceCpuMonitorResponse());
    }

        /**
         * 启动一个或多个虚拟机实例。
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
         * 创建一个或多个指定配置的虚拟机实例。
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
         * 创建一台虚拟机实例询价。
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
         * 查询一台或多台虚拟机实例的状态。
         */
    public DescribeInstancesStatusResponse describeInstancesStatus(DescribeInstancesStatusRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeInstancesStatus",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeInstancesStatusResponse());
    }

        /**
         * 修改虚拟机实例的属性（目前只支持修改实例的显示名称）。
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
         * 查询一台或多台虚拟机实例的信息。用户可以根据实例ID、实例名称或者实例计费模式等条件来查询实例的详细信息。
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
         * 关闭一个或多个虚拟机实例。
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
         * 重启一个或多个虚拟机实例。
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
         * 查询售卖可用区的机型信息。
         */
    public DescribeZoneInstanceConfigInfosResponse describeZoneInstanceConfigInfos(DescribeZoneInstanceConfigInfosRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeZoneInstanceConfigInfos",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeZoneInstanceConfigInfosResponse());
    }

        /**
         * 取消虚拟机实例带宽降配订单。
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
         * 修改虚拟机实例的公网出口带宽。
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
         * 虚拟机实例修改带宽询价。
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
         * 修改一台虚拟机实例的机型。
         */
    public ModifyInstanceTypeResponse modifyInstanceType(ModifyInstanceTypeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyInstanceType",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyInstanceTypeResponse());
    }

        /**
         * 取消虚拟机实例降配订单。
         */
    public CancelInstanceDowngradeResponse cancelInstanceDowngrade(CancelInstanceDowngradeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CancelInstanceDowngrade",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CancelInstanceDowngradeResponse());
    }

        /**
         * 查询实例变配后的机型状态。
         */
    public DescribeInstanceTypeStatusResponse describeInstanceTypeStatus(DescribeInstanceTypeStatusRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeInstanceTypeStatus",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeInstanceTypeStatusResponse());
    }

        /**
         * 从云主机实例上卸载云硬盘。
         */
    public DetachDisksResponse detachDisks(DetachDisksRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DetachDisks",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DetachDisksResponse());
    }

        /**
         * 修改一个或多个云硬盘属性。
         */
    public ModifyDisksAttributesResponse modifyDisksAttributes(ModifyDisksAttributesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyDisksAttributes",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyDisksAttributesResponse());
    }

        /**
         * 创建云硬盘询价。
         */
    public InquiryPriceCreateDisksResponse inquiryPriceCreateDisks(InquiryPriceCreateDisksRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "InquiryPriceCreateDisks",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new InquiryPriceCreateDisksResponse());
    }

        /**
         * 终止云硬盘。
         */
    public TerminateDiskResponse terminateDisk(TerminateDiskRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "TerminateDisk",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new TerminateDiskResponse());
    }

        /**
         * 创建一个或多个云硬盘。
         */
    public CreateDisksResponse createDisks(CreateDisksRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateDisks",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateDisksResponse());
    }

        /**
         * 挂载云硬盘到云主机实例。
         */
    public AttachDisksResponse attachDisks(AttachDisksRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "AttachDisks",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new AttachDisksResponse());
    }

        /**
         * 查询云硬盘列表。
         */
    public DescribeDisksResponse describeDisks(DescribeDisksRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeDisks",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeDisksResponse());
    }

        /**
         * 修改云硬盘所属的资源组。
         */
    public ModifyDisksResourceGroupResponse modifyDisksResourceGroup(ModifyDisksResourceGroupRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyDisksResourceGroup",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyDisksResourceGroupResponse());
    }

        /**
         * 查询云硬盘支持的类型。
         */
    public DescribeDiskCategoryResponse describeDiskCategory(DescribeDiskCategoryRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeDiskCategory",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeDiskCategoryResponse());
    }

        /**
         * 将一个云硬盘扩容到指定大小。
         */
    public ResizeDiskResponse resizeDisk(ResizeDiskRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ResizeDisk",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ResizeDiskResponse());
    }

        /**
         * 释放云硬盘。
         */
    public ReleaseDiskResponse releaseDisk(ReleaseDiskRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ReleaseDisk",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ReleaseDiskResponse());
    }

        /**
         * 续费云硬盘。
         */
    public RenewDiskResponse renewDisk(RenewDiskRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "RenewDisk",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new RenewDiskResponse());
    }

        /**
         * 将一个或多个已经挂载到一台实例的云硬盘挂载到另外一台实例上。
         */
    public ChangeDisksAttachResponse changeDisksAttach(ChangeDisksAttachRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ChangeDisksAttach",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ChangeDisksAttachResponse());
    }

}