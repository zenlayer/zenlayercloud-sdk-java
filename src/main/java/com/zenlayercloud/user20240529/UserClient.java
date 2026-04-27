/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.user20240529;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.user20240529.models.*;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;

import java.util.Map;


public class UserClient extends AbstractClient {
    private static final String VERSION = "2024-05-29";
    private static final String ENDPOINT = "console.zenlayer.com";
    private static final String PATH = "/api/v2/user";

    public UserClient(Credential credential, Config config) {
        super(credential, config,
            config.getEndpoint() != null ? config.getEndpoint() : ENDPOINT,
            VERSION, PATH);
    }

        /**
         * 查询成员列表。用户可以根据名称、邮箱等信息来搜索成员信息。
         */
    public DescribeMembersResponse describeMembers(DescribeMembersRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeMembers",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeMembersResponse());
    }

        /**
         * 查询单个成员信息。
         */
    public DescribeMemberResponse describeMember(DescribeMemberRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeMember",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeMemberResponse());
    }

        /**
         * 邀请单个成员信息。
         */
    public InviteMemberResponse inviteMember(InviteMemberRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "InviteMember",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new InviteMemberResponse());
    }

        /**
         * 删除一个成员信息。
         */
    public DeleteMemberResponse deleteMember(DeleteMemberRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteMember",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteMemberResponse());
    }

        /**
         * 重新发送一个成员信息的邮件。
         */
    public SendInviteMemberEmailResponse sendInviteMemberEmail(SendInviteMemberEmailRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "SendInviteMemberEmail",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new SendInviteMemberEmailResponse());
    }

        /**
         * 查询成员组列表。用户可以根据名称信息来搜索成员组信息。
         */
    public DescribeMemberGroupsResponse describeMemberGroups(DescribeMemberGroupsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeMemberGroups",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeMemberGroupsResponse());
    }

        /**
         * 创建一个成员组。
         */
    public CreateMemberGroupResponse createMemberGroup(CreateMemberGroupRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateMemberGroup",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateMemberGroupResponse());
    }

        /**
         * 修改一个成员组信息。
         */
    public ModifyMemberGroupResponse modifyMemberGroup(ModifyMemberGroupRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyMemberGroup",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyMemberGroupResponse());
    }

        /**
         * 删除一个成员组信息。
         */
    public DeleteMemberGroupResponse deleteMemberGroup(DeleteMemberGroupRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteMemberGroup",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteMemberGroupResponse());
    }

        /**
         * 授予一个成员组相关访问策略信息，从而对进行成员组下所有成员进行权限控制。
         */
    public CreateMemberGroupPermissionResponse createMemberGroupPermission(CreateMemberGroupPermissionRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateMemberGroupPermission",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateMemberGroupPermissionResponse());
    }

        /**
         * 查询权限列表。用户可以根据成员ID、策略名称、成员组等信息来搜索权限信息。
         */
    public DescribePermissionsResponse describePermissions(DescribePermissionsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribePermissions",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribePermissionsResponse());
    }

        /**
         * 授予成员对于资源组相关的访问策略，从而对资源组进行权限控制。
         */
    public CreateMemberPermissionResponse createMemberPermission(CreateMemberPermissionRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateMemberPermission",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateMemberPermissionResponse());
    }

        /**
         * 删除一个权限信息。
         */
    public DeletePermissionResponse deletePermission(DeletePermissionRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeletePermission",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeletePermissionResponse());
    }

        /**
         * 查询访问策略。
         */
    public DescribePoliciesResponse describePolicies(DescribePoliciesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribePolicies",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribePoliciesResponse());
    }

        /**
         * 查询所有资源组列表信息。
         */
    public DescribeResourceGroupsResponse describeResourceGroups(DescribeResourceGroupsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeResourceGroups",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeResourceGroupsResponse());
    }

        /**
         * 创建一个资源组信息。
         */
    public CreateResourceGroupResponse createResourceGroup(CreateResourceGroupRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateResourceGroup",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateResourceGroupResponse());
    }

        /**
         * 将资源添加到一个资源组。
         */
    public AddResourceResourceGroupResponse addResourceResourceGroup(AddResourceResourceGroupRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "AddResourceResourceGroup",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new AddResourceResourceGroupResponse());
    }

        /**
         * 修改一个资源组信息。
         */
    public ModifyResourceGroupResponse modifyResourceGroup(ModifyResourceGroupRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyResourceGroup",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyResourceGroupResponse());
    }

        /**
         * 删除一个资源组信息。
         */
    public DeleteResourceGroupResponse deleteResourceGroup(DeleteResourceGroupRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteResourceGroup",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteResourceGroupResponse());
    }

}