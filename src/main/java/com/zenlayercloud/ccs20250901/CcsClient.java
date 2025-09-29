/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.ccs20250901;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.ccs20250901.models.*;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;

import java.util.Map;


public class CcsClient extends AbstractClient {
    private static final String VERSION = "2025-09-01";
    private static final String ENDPOINT = "console.zenlayer.com";
    private static final String PATH = "/api/v2/ccs";

    public CcsClient(Credential credential, Config config) {
        super(credential, config,
            config.getEndpoint() != null ? config.getEndpoint() : ENDPOINT,
            VERSION, PATH);
    }

        /**
         * 查询密钥对列表。
         
         */
    public DescribeKeyPairsResponse describeKeyPairs(DescribeKeyPairsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeKeyPairs",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeKeyPairsResponse());
    }

        /**
         * 查询密钥对列表。
         
         */
    public ImportKeyPairResponse importKeyPair(ImportKeyPairRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ImportKeyPair",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ImportKeyPairResponse());
    }

        /**
         * 修改一个密钥对的属性。
         
         */
    public ModifyKeyPairAttributeResponse modifyKeyPairAttribute(ModifyKeyPairAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyKeyPairAttribute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyKeyPairAttributeResponse());
    }

        /**
         * 删除一个或多个密钥对。
         
         */
    public DeleteKeyPairsResponse deleteKeyPairs(DeleteKeyPairsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteKeyPairs",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteKeyPairsResponse());
    }

}