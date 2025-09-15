/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.user20240529;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;
import com.zenlayercloud.user20240529.models.*;

import java.util.Map;


public class UserClient extends AbstractClient {

    private static final String VERSION  = "2024-05-29";
    private static final String endpoint = "console.zenlayer.com";
    private static final String path     = "/api/v2/user";

    public UserClient(Credential credential, Config config) {
        super(credential, config, Common.isUnset(config.endpoint) ? endpoint : config.endpoint, VERSION, path);
    }

    public UserClient(Credential credential) {
        this(credential, new Config());
    }

    public DescribeResourceGroupsResponse describeResourceGroups(DescribeResourceGroupsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeResourceGroups", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DescribeResourceGroupsResponse());
    }

    public DescribeResourceTypesResponse describeResourceTypes(DescribeResourceTypesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeResourceTypes", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DescribeResourceTypesResponse());
    }

    public DescribeResourcesByGroupResponse describeResourcesByGroup(DescribeResourcesByGroupRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeResourcesByGroup", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DescribeResourcesByGroupResponse());
    }


    public CreateResourceGroupResponse createResourceGroup(CreateResourceGroupRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateResourceGroup", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new CreateResourceGroupResponse());
    }



    public ModifyResourceGroupResponse modifyResourceGroup(ModifyResourceGroupRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyResourceGroup", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new ModifyResourceGroupResponse());
    }


    public DeleteResourceGroupResponse deleteResourceGroup(DeleteResourceGroupRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeleteResourceGroup", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DeleteResourceGroupResponse());
    }


    public AddResourceResourceGroupResponse addResourceResourceGroup(AddResourceResourceGroupRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AddResourceResourceGroup", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new AddResourceResourceGroupResponse());
    }




}
