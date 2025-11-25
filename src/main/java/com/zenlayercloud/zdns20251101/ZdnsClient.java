/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.zdns20251101;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.zdns20251101.models.*;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;

import java.util.Map;


public class ZdnsClient extends AbstractClient {
    private static final String VERSION = "2025-11-01";
    private static final String ENDPOINT = "console.zenlayer.com";
    private static final String PATH = "/api/v2/zdns";

    public ZdnsClient(Credential credential, Config config) {
        super(credential, config,
            config.getEndpoint() != null ? config.getEndpoint() : ENDPOINT,
            VERSION, PATH);
    }

        /**
         * 创建内网权威域名。
         
         */
    public AddPrivateZoneResponse addPrivateZone(AddPrivateZoneRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "AddPrivateZone",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new AddPrivateZoneResponse());
    }

        /**
         * 查询内网权威域名列表。
         
         */
    public DescribePrivateZonesResponse describePrivateZones(DescribePrivateZonesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribePrivateZones",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribePrivateZonesResponse());
    }

        /**
         * 修改内网权威域名信息。
         * 包括备注，是否开启子域名递归代理等。
         
         */
    public ModifyPrivateZoneResponse modifyPrivateZone(ModifyPrivateZoneRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyPrivateZone",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyPrivateZoneResponse());
    }

        /**
         * 删除内网权威域名。
         
         */
    public DeletePrivateZoneResponse deletePrivateZone(DeletePrivateZoneRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeletePrivateZone",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeletePrivateZoneResponse());
    }

        /**
         * 内网权威域名额外绑定VPC。
         
         */
    public BindPrivateZoneVpcResponse bindPrivateZoneVpc(BindPrivateZoneVpcRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "BindPrivateZoneVpc",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new BindPrivateZoneVpcResponse());
    }

        /**
         * 内网权威域名解除VPC绑定。
         
         */
    public UnbindPrivateZoneVpcResponse unbindPrivateZoneVpc(UnbindPrivateZoneVpcRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "UnbindPrivateZoneVpc",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new UnbindPrivateZoneVpcResponse());
    }

        /**
         * 新增内网权威域名解析记录。
         
         */
    public AddPrivateZoneRecordResponse addPrivateZoneRecord(AddPrivateZoneRecordRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "AddPrivateZoneRecord",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new AddPrivateZoneRecordResponse());
    }

        /**
         * 查询内网权威域名的解析记录列表。
         
         */
    public DescribePrivateZoneRecordsResponse describePrivateZoneRecords(DescribePrivateZoneRecordsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribePrivateZoneRecords",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribePrivateZoneRecordsResponse());
    }

        /**
         * 修改内网权威域名解析记录。
         
         */
    public ModifyPrivateZoneRecordResponse modifyPrivateZoneRecord(ModifyPrivateZoneRecordRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyPrivateZoneRecord",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyPrivateZoneRecordResponse());
    }

        /**
         * 修改内网权威域名解析记录的生效状态。
         
         */
    public ModifyPrivateZoneRecordsStatusResponse modifyPrivateZoneRecordsStatus(ModifyPrivateZoneRecordsStatusRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyPrivateZoneRecordsStatus",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyPrivateZoneRecordsStatusResponse());
    }

        /**
         * 删除内网权威域名解析记录。
         
         */
    public DeletePrivateZoneRecordResponse deletePrivateZoneRecord(DeletePrivateZoneRecordRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeletePrivateZoneRecord",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeletePrivateZoneRecordResponse());
    }

}