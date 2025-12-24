/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.zrm20251014;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.zrm20251014.models.*;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;

import java.util.Map;


public class ZrmClient extends AbstractClient {
    private static final String VERSION = "2025-10-14";
    private static final String ENDPOINT = "console.zenlayer.com";
    private static final String PATH = "/api/v2/zrm";

    public ZrmClient(Credential credential, Config config) {
        super(credential, config,
            config.getEndpoint() != null ? config.getEndpoint() : ENDPOINT,
            VERSION, PATH);
    }

        /**
         * 批量创建标签。
         */
    public CreateTagsResponse createTags(CreateTagsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateTags",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateTagsResponse());
    }

        /**
         * 批量删除标签。
         */
    public DeleteTagsResponse deleteTags(DeleteTagsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteTags",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteTagsResponse());
    }

        /**
         * 标签分页列表。
         */
    public DescribeTagsResponse describeTags(DescribeTagsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeTags",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeTagsResponse());
    }

        /**
         * 标签批量绑定资源。
         */
    public TagBindResourcesResponse tagBindResources(TagBindResourcesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "TagBindResources",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new TagBindResourcesResponse());
    }

        /**
         * 标签批量解绑资源。
         */
    public TagUnbindResourcesResponse tagUnbindResources(TagUnbindResourcesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "TagUnbindResources",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new TagUnbindResourcesResponse());
    }

        /**
         * 获取某个资源下绑定的所有标签列表。
         
         */
    public DescribeResourceTagsResponse describeResourceTags(DescribeResourceTagsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeResourceTags",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeResourceTagsResponse());
    }

        /**
         * 修改某个资源的标签。
         
         */
    public ModifyResourceTagsResponse modifyResourceTags(ModifyResourceTagsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyResourceTags",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyResourceTagsResponse());
    }

}