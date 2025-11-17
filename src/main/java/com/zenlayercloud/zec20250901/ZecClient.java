/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.zec20250901;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.zec20250901.models.*;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;

import java.util.Map;


public class ZecClient extends AbstractClient {
    private static final String VERSION = "2025-09-01";
    private static final String ENDPOINT = "console.zenlayer.com";
    private static final String PATH = "/api/v2/zec";

    public ZecClient(Credential credential, Config config) {
        super(credential, config,
            config.getEndpoint() != null ? config.getEndpoint() : ENDPOINT,
            VERSION, PATH);
    }

        /**
         * 查询云盘的列表信息。
         
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
         * 支持售卖云硬盘的节点。
         
         */
    public DescribeDiskRegionsResponse describeDiskRegions(DescribeDiskRegionsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeDiskRegions",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeDiskRegionsResponse());
    }

        /**
         * 创建一块或多块云硬盘的询价。
         
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
         * 云硬盘挂在到实例上。
         
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
         * 将云硬盘从主机实例上卸载。
         
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
         * 修改一块或多块云硬盘属性。
         * 当前接口只支持修改名称。
         
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
         * 删除释放一块云硬盘。
         
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
         * 恢复云硬盘。
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
         * 获取某个区域支持的云盘类型。
         
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
         * 查询一段时间的云硬盘的监控指标数据。
         
         */
    public DescribeDiskMonitorDataResponse describeDiskMonitorData(DescribeDiskMonitorDataRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeDiskMonitorData",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeDiskMonitorDataResponse());
    }

        /**
         * 创建全球VPC。
         
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
         * 删除VPC。
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
         * 修改一个或多个VPC的属性。
         * 该接口只支持修改VPC的名称。
         
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
         * 查询支持创建子网区域以及是否IPv6。
         
         */
    public DescribeSubnetRegionsResponse describeSubnetRegions(DescribeSubnetRegionsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeSubnetRegions",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeSubnetRegionsResponse());
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

        /**
         * 修改子网堆栈类型。
         */
    public ModifySubnetStackTypeResponse modifySubnetStackType(ModifySubnetStackTypeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifySubnetStackType",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifySubnetStackTypeResponse());
    }

        /**
         * 查询私有网络（VPC）列表，用户可以根据 VPC ID、VPC 名称等信息来筛选过滤VPC信息。
         
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
         * 修改私有网络（VPC）的相关属性。
         
         */
    public ModifyVpcAttributeResponse modifyVpcAttribute(ModifyVpcAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyVpcAttribute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyVpcAttributeResponse());
    }

        /**
         * 查询子网列表信息。
         * 可以根据子网ID, 名称等信息筛选查询子网。
         
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
         * 批量修改子网的属性。
         
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
         * 对指定云盘创建快照。
         
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
         * 修改指定快照的属性。
         
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
         * 删除指定快照集合。
         
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
         * 查询快照的详细信息。
         
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
         * 回滚快照到原云盘。
         
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
         * 创建一个自动快照策略。
         
         */
    public CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateAutoSnapshotPolicy",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateAutoSnapshotPolicyResponse());
    }

        /**
         * 云硬盘添加到指定的自动快照策略。
         
         */
    public ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ApplyAutoSnapshotPolicy",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ApplyAutoSnapshotPolicyResponse());
    }

        /**
         * 云硬盘从指定的自动快照策略中移除。
         
         */
    public CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CancelAutoSnapshotPolicy",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CancelAutoSnapshotPolicyResponse());
    }

        /**
         * 查询自动快照策略的列表数据。
         
         */
    public DescribeAutoSnapshotPoliciesResponse describeAutoSnapshotPolicies(DescribeAutoSnapshotPoliciesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAutoSnapshotPolicies",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAutoSnapshotPoliciesResponse());
    }

        /**
         * 修改自动快照策略的基本信息。
         
         */
    public ModifyAutoSnapshotPolicyResponse modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyAutoSnapshotPolicy",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyAutoSnapshotPolicyResponse());
    }

        /**
         * 删除指定的自动快照策略。
         
         */
    public DeleteAutoSnapshotPoliciesResponse deleteAutoSnapshotPolicies(DeleteAutoSnapshotPoliciesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteAutoSnapshotPolicies",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteAutoSnapshotPoliciesResponse());
    }

        /**
         * 支持售卖网卡的区域信息。
         */
    public DescribeNetworkInterfaceRegionsResponse describeNetworkInterfaceRegions(DescribeNetworkInterfaceRegionsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeNetworkInterfaceRegions",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeNetworkInterfaceRegionsResponse());
    }

        /**
         * 查询一个或多个指定网卡的信息。
         * 用户可以根据 网卡ID、网卡名称等信息来搜索网卡信息。
         
         */
    public DescribeNetworkInterfacesResponse describeNetworkInterfaces(DescribeNetworkInterfacesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeNetworkInterfaces",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeNetworkInterfacesResponse());
    }

        /**
         * 修改一张网卡的属性。
         
         */
    public ModifyNetworkInterfaceAttributeResponse modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyNetworkInterfaceAttribute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyNetworkInterfaceAttributeResponse());
    }

        /**
         * 修改网卡的属性，目前只支持修改网卡的名称。
         
         */
    public ModifyNetworkInterfacesAttributeResponse modifyNetworkInterfacesAttribute(ModifyNetworkInterfacesAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyNetworkInterfacesAttribute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyNetworkInterfacesAttributeResponse());
    }

        /**
         * 创建一张辅助网卡。
         
         */
    public CreateNetworkInterfaceResponse createNetworkInterface(CreateNetworkInterfaceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateNetworkInterface",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateNetworkInterfaceResponse());
    }

        /**
         * 删除一张辅助网卡。
         
         */
    public DeleteNetworkInterfaceResponse deleteNetworkInterface(DeleteNetworkInterfaceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteNetworkInterface",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteNetworkInterfaceResponse());
    }

        /**
         * 网卡绑定实例。
         
         */
    public AttachNetworkInterfaceResponse attachNetworkInterface(AttachNetworkInterfaceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "AttachNetworkInterface",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new AttachNetworkInterfaceResponse());
    }

        /**
         * 将一张网卡从实例上解绑。
         
         */
    public DetachNetworkInterfaceResponse detachNetworkInterface(DetachNetworkInterfaceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DetachNetworkInterface",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DetachNetworkInterfaceResponse());
    }

        /**
         * 网卡绑定内网IPv4。
         */
    public AssignNetworkInterfaceIpv4Response assignNetworkInterfaceIpv4(AssignNetworkInterfaceIpv4Request request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "AssignNetworkInterfaceIpv4",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new AssignNetworkInterfaceIpv4Response());
    }

        /**
         * 将一张网卡额外添加内网IPv4地址。
         
         */
    public BatchAssignNetworkInterfaceIpv4Response batchAssignNetworkInterfaceIpv4(BatchAssignNetworkInterfaceIpv4Request request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "BatchAssignNetworkInterfaceIpv4",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new BatchAssignNetworkInterfaceIpv4Response());
    }

        /**
         * 将网卡上的内网IPv4地址解绑。
         
         */
    public UnassignNetworkInterfaceIpv4Response unassignNetworkInterfaceIpv4(UnassignNetworkInterfaceIpv4Request request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "UnassignNetworkInterfaceIpv4",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new UnassignNetworkInterfaceIpv4Response());
    }

        /**
         * 网卡的公网IPv6信息。
         
         */
    public DescribeNetworkInterfacePublicIPv6Response describeNetworkInterfacePublicIPv6(DescribeNetworkInterfacePublicIPv6Request request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeNetworkInterfacePublicIPv6",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeNetworkInterfacePublicIPv6Response());
    }

        /**
         * 公网Ipv6流量包或固定带宽询价。
         
         */
    public InquiryPricePublicIpv6Response inquiryPricePublicIpv6(InquiryPricePublicIpv6Request request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "InquiryPricePublicIpv6",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new InquiryPricePublicIpv6Response());
    }

        /**
         * 给网卡添加IPv6。
         
         */
    public AssignNetworkInterfaceIpv6Response assignNetworkInterfaceIpv6(AssignNetworkInterfaceIpv6Request request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "AssignNetworkInterfaceIpv6",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new AssignNetworkInterfaceIpv6Response());
    }

        /**
         * 查询某节点支持的镜像列表。
         
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
         * 用实例创建自定义镜像。
         
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
         * 修改自定义镜像属性。
         
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
         * 创建防护策略。
         */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreatePolicy",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreatePolicyResponse());
    }

        /**
         * 删除防护策略。
         */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeletePolicy",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeletePolicyResponse());
    }

        /**
         * 修改防护策略。
         */
    public ModifyPolicyResponse modifyPolicy(ModifyPolicyRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyPolicy",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyPolicyResponse());
    }

        /**
         * 获取防护策略列表。
         */
    public DescribePolicysResponse describePolicys(DescribePolicysRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribePolicys",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribePolicysResponse());
    }

        /**
         * 获取防护策略详情。
         */
    public DescribePolicyDetailResponse describePolicyDetail(DescribePolicyDetailRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribePolicyDetail",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribePolicyDetailResponse());
    }

        /**
         * 防护对象关联防护策略。
         */
    public AttachToPolicyResponse attachToPolicy(AttachToPolicyRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "AttachToPolicy",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new AttachToPolicyResponse());
    }

        /**
         * 防护对象取消关联防护策略。
         */
    public DetachFromPolicyResponse detachFromPolicy(DetachFromPolicyRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DetachFromPolicy",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DetachFromPolicyResponse());
    }

        /**
         * 获取区域封禁可选区域列表。
         */
    public DescribePolicyRegionsResponse describePolicyRegions(DescribePolicyRegionsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribePolicyRegions",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribePolicyRegionsResponse());
    }

        /**
         * 获取默认UDP反射源端口列表。
         */
    public DescribeReflectUdpPortOptionsResponse describeReflectUdpPortOptions(DescribeReflectUdpPortOptionsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeReflectUdpPortOptions",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeReflectUdpPortOptionsResponse());
    }

        /**
         * 查询安全组列表。
         
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
         * 查询指定安全组内的规则。
         
         */
    public DescribeSecurityGroupRuleResponse describeSecurityGroupRule(DescribeSecurityGroupRuleRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeSecurityGroupRule",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeSecurityGroupRuleResponse());
    }

        /**
         * 创建一个安全组。
         
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
         * 删除一个安全组。
         
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
         * 配置安全组规则。
         
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
         * VPC更换绑定安全组。
         
         */
    public AssignSecurityGroupVpcResponse assignSecurityGroupVpc(AssignSecurityGroupVpcRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "AssignSecurityGroupVpc",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new AssignSecurityGroupVpcResponse());
    }

        /**
         * VPC解绑安全组。
         
         */
    public UnAssignSecurityGroupVpcResponse unAssignSecurityGroupVpc(UnAssignSecurityGroupVpcRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "UnAssignSecurityGroupVpc",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new UnAssignSecurityGroupVpcResponse());
    }

        /**
         * 查询支持售卖EIP的区域信息。
         
         */
    public DescribeEipRegionsResponse describeEipRegions(DescribeEipRegionsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeEipRegions",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeEipRegionsResponse());
    }

        /**
         * 查询EIP支持的网络计费模式。
         
         */
    public DescribeEipInternetChargeTypesResponse describeEipInternetChargeTypes(DescribeEipInternetChargeTypesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeEipInternetChargeTypes",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeEipInternetChargeTypesResponse());
    }

        /**
         * 查询EIP支持的远程指向的节点信息。
         
         */
    public DescribeEipRemoteRegionsResponse describeEipRemoteRegions(DescribeEipRemoteRegionsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeEipRemoteRegions",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeEipRemoteRegionsResponse());
    }

        /**
         * 指定条件查询已创建的弹性IPv4的信息。
         * 用户可以根据ID、名称等信息来搜索。
         
         */
    public DescribeEipsResponse describeEips(DescribeEipsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeEips",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeEipsResponse());
    }

        /**
         * 创建弹性公网IP。
         
         */
    public CreateEipsResponse createEips(CreateEipsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateEips",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateEipsResponse());
    }

        /**
         * 删除指定的弹性公网IP。
         
         */
    public DeleteEipResponse deleteEip(DeleteEipRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteEip",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteEipResponse());
    }

        /**
         * 恢复弹性公网IP。
         */
    public RenewEipResponse renewEip(RenewEipRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "RenewEip",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new RenewEipResponse());
    }

        /**
         * 指定IP作为出口IP。
         
         */
    public ConfigEipEgressIpResponse configEipEgressIp(ConfigEipEgressIpRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ConfigEipEgressIp",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ConfigEipEgressIpResponse());
    }

        /**
         * 创建公网弹性IP询价。
         
         */
    public DescribeEipPriceResponse describeEipPrice(DescribeEipPriceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeEipPrice",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeEipPriceResponse());
    }

        /**
         * 变更弹性公网IP更网络计费模式。
         
         */
    public ChangeEipInternetChargeTypeResponse changeEipInternetChargeType(ChangeEipInternetChargeTypeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ChangeEipInternetChargeType",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ChangeEipInternetChargeTypeResponse());
    }

        /**
         * 查询可供弹性公网IP绑定的网卡及内网IP信息。
         
         */
    public AvailableLanIpResponse availableLanIp(AvailableLanIpRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "AvailableLanIp",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new AvailableLanIpResponse());
    }

        /**
         * 查询弹性公网IP指定时间段内的流量信息。
         
         */
    public DescribeEipTrafficResponse describeEipTraffic(DescribeEipTrafficRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeEipTraffic",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeEipTrafficResponse());
    }

        /**
         * 批量将弹性公网IP（EIP）绑定到同地域的云产品实例上。
         
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
         * 将弹性公网IP（EIP）从绑定的云产品上解绑。
         
         */
    public UnassociateEipAddressResponse unassociateEipAddress(UnassociateEipAddressRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "UnassociateEipAddress",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new UnassociateEipAddressResponse());
    }

        /**
         * 替换一个或者多个弹性公网IP地址。
         
         */
    public ReplaceEipAddressResponse replaceEipAddress(ReplaceEipAddressRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ReplaceEipAddress",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ReplaceEipAddressResponse());
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

        /**
         * 调整弹性公网IP的带宽限速。
         
         */
    public ModifyEipBandwidthResponse modifyEipBandwidth(ModifyEipBandwidthRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyEipBandwidth",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyEipBandwidthResponse());
    }

        /**
         * 弹性公网IP（EIP）更换绑定模式。
         
         */
    public ChangeEipBindTypeResponse changeEipBindType(ChangeEipBindTypeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ChangeEipBindType",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ChangeEipBindTypeResponse());
    }

        /**
         * 查询一段时间的弹性公网IP监控指标数据。
         
         */
    public DescribeEipMonitorDataResponse describeEipMonitorData(DescribeEipMonitorDataRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeEipMonitorData",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeEipMonitorDataResponse());
    }

        /**
         * 获取攻击事件列表。
         */
    public DescribeDDosAllEventListResponse describeDDosAllEventList(DescribeDDosAllEventListRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeDDosAllEventList",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeDDosAllEventListResponse());
    }

        /**
         * 获取攻击事件详情。
         */
    public DescribeDDosEventDetailResponse describeDDosEventDetail(DescribeDDosEventDetailRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeDDosEventDetail",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeDDosEventDetailResponse());
    }

        /**
         * 查询可用区信息。
         * 包括名称，所属的节点等。
         
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
         * 查询公网IP池列表。
         
         */
    public DescribePoolsResponse describePools(DescribePoolsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribePools",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribePoolsResponse());
    }

        /**
         * 支持售卖CIDR的节点信息。
         
         */
    public DescribeCidrRegionsResponse describeCidrRegions(DescribeCidrRegionsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeCidrRegions",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeCidrRegionsResponse());
    }

        /**
         * 查询CIDR地址块售卖价格。
         
         */
    public DescribeCidrPriceResponse describeCidrPrice(DescribeCidrPriceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeCidrPrice",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeCidrPriceResponse());
    }

        /**
         * 查询CIDR地址块列表。
         */
    public DescribeCidrsResponse describeCidrs(DescribeCidrsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeCidrs",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeCidrsResponse());
    }

        /**
         * 创建CIDR地址段。
         
         */
    public CreateCidrResponse createCidr(CreateCidrRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateCidr",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateCidrResponse());
    }

        /**
         * 修改CIDR地址段的属性。
         * 目前只能修改名称。
         
         */
    public ModifyCidrAttributeResponse modifyCidrAttribute(ModifyCidrAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyCidrAttribute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyCidrAttributeResponse());
    }

        /**
         * 删除CIDR地址段。
         
         */
    public DeleteCidrResponse deleteCidr(DeleteCidrRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteCidr",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteCidrResponse());
    }

        /**
         * 将一个处于回收站的CIDR地址段恢复回正常。
         
         */
    public RenewCidrResponse renewCidr(RenewCidrRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "RenewCidr",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new RenewCidrResponse());
    }

        /**
         * 在某节点为VPC创建一个边界网关。
         
         */
    public CreateBorderGatewayResponse createBorderGateway(CreateBorderGatewayRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateBorderGateway",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateBorderGatewayResponse());
    }

        /**
         * 查询边界网关列表。
         
         */
    public DescribeBorderGatewaysResponse describeBorderGateways(DescribeBorderGatewaysRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeBorderGateways",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeBorderGatewaysResponse());
    }

        /**
         * 删除一个指定的边界网关。
         
         */
    public DeleteBorderGatewayResponse deleteBorderGateway(DeleteBorderGatewayRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteBorderGateway",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteBorderGatewayResponse());
    }

        /**
         * 修改边界网关的ASN。
         
         */
    public ModifyBorderGatewayAsnResponse modifyBorderGatewayAsn(ModifyBorderGatewayAsnRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyBorderGatewayAsn",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyBorderGatewayAsnResponse());
    }

        /**
         * 修改边界网关的属性，包括名称，路由级别，子网宣告控制等。
         
         */
    public ModifyBorderGatewaysAttributeResponse modifyBorderGatewaysAttribute(ModifyBorderGatewaysAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyBorderGatewaysAttribute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyBorderGatewaysAttributeResponse());
    }

        /**
         * 获取可绑定边界网关的NAT网关列表。
         
         */
    public DescribeAvailableNatsResponse describeAvailableNats(DescribeAvailableNatsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAvailableNats",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAvailableNatsResponse());
    }

        /**
         * 边界网关绑定NAT网关。
         
         */
    public AssignBorderGatewayResponse assignBorderGateway(AssignBorderGatewayRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "AssignBorderGateway",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new AssignBorderGatewayResponse());
    }

        /**
         * 解绑边界网关。
         */
    public UnassignBorderGatewayResponse unassignBorderGateway(UnassignBorderGatewayRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "UnassignBorderGateway",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new UnassignBorderGatewayResponse());
    }

        /**
         * 边界网关绑定自定义路由。
         * 即自定义路由发布到zbg网关。
         
         */
    public AssignBorderGatewayRouteResponse assignBorderGatewayRoute(AssignBorderGatewayRouteRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "AssignBorderGatewayRoute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new AssignBorderGatewayRouteResponse());
    }

        /**
         * 边界网关路由宣告中移除指定的自定义路由。
         
         */
    public UnassignBorderGatewayRouteResponse unassignBorderGatewayRoute(UnassignBorderGatewayRouteRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "UnassignBorderGatewayRoute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new UnassignBorderGatewayRouteResponse());
    }

        /**
         * 查询可用区售卖的机型信息。
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
         * 查询时区信息。
         */
    public DescribeTimeZonesResponse describeTimeZones(DescribeTimeZonesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeTimeZones",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeTimeZonesResponse());
    }

        /**
         * 创建虚拟机实例询价。
         
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
         * 创建一台或多台虚拟机实例。
         
         */
    public CreateZecInstancesResponse createZecInstances(CreateZecInstancesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateZecInstances",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateZecInstancesResponse());
    }

        /**
         * 查询一台或多台虚拟机实例的信息。
         * 用户可以根据实例ID、实例名称等条件来查询实例的详细信息。
         
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
         * 查询实例的状态。
         
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
         * 修改实例属性（名称）。
         
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
         * 启动一台或多台虚拟机实例。
         
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
         * 关闭一台或多台虚拟机实例。
         
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
         * 重启虚拟机实例。
         
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
         * 重置一台虚拟机实例密码。
         
         */
    public ResetInstancePasswordResponse resetInstancePassword(ResetInstancePasswordRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ResetInstancePassword",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ResetInstancePasswordResponse());
    }

        /**
         * 重装一台虚拟机实例操作系统。
         
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
         * 开启IP转发。
         */
    public StartIpForwardResponse startIpForward(StartIpForwardRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "StartIpForward",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new StartIpForwardResponse());
    }

        /**
         * 关闭IP转发。
         */
    public StopIpForwardResponse stopIpForward(StopIpForwardRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "StopIpForward",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new StopIpForwardResponse());
    }

        /**
         * 开启Agent监控采集。
         
         */
    public StartAgentMonitorResponse startAgentMonitor(StartAgentMonitorRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "StartAgentMonitor",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new StartAgentMonitorResponse());
    }

        /**
         * 关闭Agent监控采集。
         
         */
    public StopAgentMonitorResponse stopAgentMonitor(StopAgentMonitorRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "StopAgentMonitor",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new StopAgentMonitorResponse());
    }

        /**
         * 变更实例的规格。
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
         * 更改实例的网卡模式。
         
         */
    public ChangeNicNetworkTypeResponse changeNicNetworkType(ChangeNicNetworkTypeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ChangeNicNetworkType",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ChangeNicNetworkTypeResponse());
    }

        /**
         * 销毁一台或多台虚拟机实例。
         
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
         * 查询一段时间的实例的监控指标数据。
         * 包括CPU,内存等相关指标数据。
         
         */
    public DescribeInstanceMonitorDataResponse describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeInstanceMonitorData",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeInstanceMonitorDataResponse());
    }

        /**
         * 创建NAT网关。
         
         */
    public CreateNatGatewayResponse createNatGateway(CreateNatGatewayRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateNatGateway",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateNatGatewayResponse());
    }

        /**
         * 修改NAT网关的属性。
         
         */
    public ModifyNatGatewayAttributeResponse modifyNatGatewayAttribute(ModifyNatGatewayAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyNatGatewayAttribute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyNatGatewayAttributeResponse());
    }

        /**
         * 支持售卖NAT网关的区域信息。
         
         */
    public DescribeNatGatewayRegionsResponse describeNatGatewayRegions(DescribeNatGatewayRegionsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeNatGatewayRegions",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeNatGatewayRegionsResponse());
    }

        /**
         * 查询NAT网关列表。
         
         */
    public DescribeNatGatewaysResponse describeNatGateways(DescribeNatGatewaysRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeNatGateways",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeNatGatewaysResponse());
    }

        /**
         * 查询NAT网关详情规则表。
         
         */
    public DescribeNatGatewayDetailResponse describeNatGatewayDetail(DescribeNatGatewayDetailRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeNatGatewayDetail",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeNatGatewayDetailResponse());
    }

        /**
         * 删除一个指定的NAT网关。
         
         */
    public DeleteNatGatewayResponse deleteNatGateway(DeleteNatGatewayRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteNatGateway",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteNatGatewayResponse());
    }

        /**
         * 续费一个指定的NAT网关。
         
         */
    public RenewNatGatewayResponse renewNatGateway(RenewNatGatewayRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "RenewNatGateway",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new RenewNatGatewayResponse());
    }

        /**
         * 查询创建NAT网关的价格。
         
         */
    public InquiryPriceCreateNatGatewayResponse inquiryPriceCreateNatGateway(InquiryPriceCreateNatGatewayRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "InquiryPriceCreateNatGateway",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new InquiryPriceCreateNatGatewayResponse());
    }

        /**
         * 创建SNAT规则。
         
         */
    public CreateSnatEntryResponse createSnatEntry(CreateSnatEntryRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateSnatEntry",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateSnatEntryResponse());
    }

        /**
         * 修改SNAT规则。
         
         */
    public ModifySnatEntryResponse modifySnatEntry(ModifySnatEntryRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifySnatEntry",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifySnatEntryResponse());
    }

        /**
         * 删除SNAT规则。
         
         */
    public DeleteSnatEntryResponse deleteSnatEntry(DeleteSnatEntryRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteSnatEntry",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteSnatEntryResponse());
    }

        /**
         * 创建DNAT规则。
         
         */
    public CreateDnatEntryResponse createDnatEntry(CreateDnatEntryRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateDnatEntry",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateDnatEntryResponse());
    }

        /**
         * 修改DNAT规则。
         
         */
    public ModifyDnatEntryResponse modifyDnatEntry(ModifyDnatEntryRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyDnatEntry",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyDnatEntryResponse());
    }

        /**
         * 删除DNAT规则。
         
         */
    public DeleteDnatEntryResponse deleteDnatEntry(DeleteDnatEntryRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteDnatEntry",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteDnatEntryResponse());
    }

        /**
         * 获取可绑定NAT的边界网关。
         
         */
    public DescribeAvailableBorderGatewayResponse describeAvailableBorderGateway(DescribeAvailableBorderGatewayRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAvailableBorderGateway",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAvailableBorderGatewayResponse());
    }

        /**
         * 创建一个自定义路由。
         
         */
    public CreateRouteResponse createRoute(CreateRouteRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateRoute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateRouteResponse());
    }

        /**
         * 修改路由的基本信息，目前只允许修改路由的名称。
         
         */
    public ModifyRouteAttributeResponse modifyRouteAttribute(ModifyRouteAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyRouteAttribute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyRouteAttributeResponse());
    }

        /**
         * 删除一条自定义路由。
         
         */
    public DeleteRouteResponse deleteRoute(DeleteRouteRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteRoute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteRouteResponse());
    }

        /**
         * 查询路由列表。
         * 用户可以根据ID、名称等信息来搜索Route信息。
         * 路由列表包括系统生成的以及用户创建的路由。
         
         */
    public DescribeRoutesResponse describeRoutes(DescribeRoutesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeRoutes",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeRoutesResponse());
    }

}