/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.zos20251010;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.zos20251010.models.*;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;

import java.util.Map;


public class ZosClient extends AbstractClient {
    private static final String VERSION = "2025-10-10";
    private static final String ENDPOINT = "console.zenlayer.com";
    private static final String PATH = "/api/v2/zos";

    public ZosClient(Credential credential, Config config) {
        super(credential, config,
            config.getEndpoint() != null ? config.getEndpoint() : ENDPOINT,
            VERSION, PATH);
    }

        /**
         * 创建命令。
         
         */
    public CreateCommandResponse createCommand(CreateCommandRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateCommand",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateCommandResponse());
    }

        /**
         * 查询命令列表。
         
         */
    public DescribeCommandsResponse describeCommands(DescribeCommandsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeCommands",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeCommandsResponse());
    }

        /**
         * 修改命令。
         
         */
    public ModifyCommandResponse modifyCommand(ModifyCommandRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyCommand",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyCommandResponse());
    }

        /**
         * 删除命令。
         
         */
    public DeleteCommandResponse deleteCommand(DeleteCommandRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteCommand",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteCommandResponse());
    }

        /**
         * 执行一个已经创建并保存的命令。
         
         */
    public InvokeCommandResponse invokeCommand(InvokeCommandRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "InvokeCommand",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new InvokeCommandResponse());
    }

        /**
         * 查询执行记录列表。
         */
    public DescribeCommandInvocationsResponse describeCommandInvocations(DescribeCommandInvocationsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeCommandInvocations",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeCommandInvocationsResponse());
    }

}