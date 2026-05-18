/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.aigw20260414;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.aigw20260414.models.*;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;

import java.util.Map;


public class AigwClient extends AbstractClient {
    private static final String VERSION = "2026-04-14";
    private static final String ENDPOINT = "console.zenlayer.com";
    private static final String PATH = "/api/v2/aigw";

    public AigwClient(Credential credential, Config config) {
        super(credential, config,
            config.getEndpoint() != null ? config.getEndpoint() : ENDPOINT,
            VERSION, PATH);
    }

        /**
         * 分页查询ai网关列表
         */
    public DescribeAiGatewaysResponse describeAiGateways(DescribeAiGatewaysRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAiGateways",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAiGatewaysResponse());
    }

        /**
         * 创建AI网关
         */
    public CreateAiGatewayResponse createAiGateway(CreateAiGatewayRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateAiGateway",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateAiGatewayResponse());
    }

        /**
         * 启动AI网关
         */
    public StartAiGatewayResponse startAiGateway(StartAiGatewayRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "StartAiGateway",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new StartAiGatewayResponse());
    }

        /**
         * 停止AI网关
         */
    public StopAiGatewayResponse stopAiGateway(StopAiGatewayRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "StopAiGateway",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new StopAiGatewayResponse());
    }

        /**
         * 删除AI网关
         */
    public DeleteAiGatewayResponse deleteAiGateway(DeleteAiGatewayRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteAiGateway",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteAiGatewayResponse());
    }

        /**
         * 查询AI网关模型
         */
    public DescribeAiGatewayModelsResponse describeAiGatewayModels(DescribeAiGatewayModelsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAiGatewayModels",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAiGatewayModelsResponse());
    }

        /**
         * 修改AI网关模型
         */
    public ModifyAiGatewayModelsResponse modifyAiGatewayModels(ModifyAiGatewayModelsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyAiGatewayModels",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyAiGatewayModelsResponse());
    }

        /**
         * 查询AI网关IP访问控制
         */
    public DescribeAiGatewayIpAclResponse describeAiGatewayIpAcl(DescribeAiGatewayIpAclRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAiGatewayIpAcl",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAiGatewayIpAclResponse());
    }

        /**
         * 修改AI网关IP访问控制
         */
    public ModifyAiGatewayIpAclResponse modifyAiGatewayIpAcl(ModifyAiGatewayIpAclRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyAiGatewayIpAcl",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyAiGatewayIpAclResponse());
    }

        /**
         * 查询AI网关过期时间
         */
    public DescribeAiGatewayExpireTimeResponse describeAiGatewayExpireTime(DescribeAiGatewayExpireTimeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAiGatewayExpireTime",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAiGatewayExpireTimeResponse());
    }

        /**
         * 修改AI网关过期时间
         */
    public ModifyAiGatewayExpireTimeResponse modifyAiGatewayExpireTime(ModifyAiGatewayExpireTimeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyAiGatewayExpireTime",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyAiGatewayExpireTimeResponse());
    }

        /**
         * 查询AI网关Token限制
         */
    public DescribeAiGatewayTokenLimitResponse describeAiGatewayTokenLimit(DescribeAiGatewayTokenLimitRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAiGatewayTokenLimit",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAiGatewayTokenLimitResponse());
    }

        /**
         * 修改AI网关Token限制
         */
    public ModifyAiGatewayTokenLimitResponse modifyAiGatewayTokenLimit(ModifyAiGatewayTokenLimitRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyAiGatewayTokenLimit",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyAiGatewayTokenLimitResponse());
    }

        /**
         * 修改AI网关名称
         */
    public ModifyAiGatewayNameResponse modifyAiGatewayName(ModifyAiGatewayNameRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyAiGatewayName",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyAiGatewayNameResponse());
    }

        /**
         * 查询ai模型列表
         */
    public DescribeAiModelsResponse describeAiModels(DescribeAiModelsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAiModels",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAiModelsResponse());
    }

        /**
         * 查询AI网关用量明细数据
         */
    public DescribeAiUsageDetailDataResponse describeAiUsageDetailData(DescribeAiUsageDetailDataRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAiUsageDetailData",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAiUsageDetailDataResponse());
    }

        /**
         * 查询AI网关月总费用
         */
    public DescribeAiMonthlyTotalCostResponse describeAiMonthlyTotalCost(DescribeAiMonthlyTotalCostRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAiMonthlyTotalCost",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAiMonthlyTotalCostResponse());
    }

        /**
         * 查询AI网关月模型日费用
         */
    public DescribeAiModelDailyCostResponse describeAiModelDailyCost(DescribeAiModelDailyCostRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAiModelDailyCost",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAiModelDailyCostResponse());
    }

        /**
         * 查询AI网关用量统计数据
         */
    public DescribeAiUsageDataResponse describeAiUsageData(DescribeAiUsageDataRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAiUsageData",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAiUsageDataResponse());
    }

        /**
         * 查询AI网关日模型缓存命中率
         */
    public DescribeAiModelDailyCacheHitRateResponse describeAiModelDailyCacheHitRate(DescribeAiModelDailyCacheHitRateRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAiModelDailyCacheHitRate",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAiModelDailyCacheHitRateResponse());
    }

}