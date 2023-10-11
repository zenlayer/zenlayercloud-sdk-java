/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;
import com.zenlayercloud.sdn20230830.models.CreatePortRequest;
import com.zenlayercloud.sdn20230830.models.CreatePortResponse;
import com.zenlayercloud.sdn20230830.models.CreatePrivateConnectRequest;
import com.zenlayercloud.sdn20230830.models.CreatePrivateConnectResponse;
import com.zenlayercloud.sdn20230830.models.DeletePrivateConnectRequest;
import com.zenlayercloud.sdn20230830.models.DeletePrivateConnectResponse;
import com.zenlayercloud.sdn20230830.models.DescribeDataCenterPortPriceRequest;
import com.zenlayercloud.sdn20230830.models.DescribeDataCenterPortPriceResponse;
import com.zenlayercloud.sdn20230830.models.DescribeDatacentersRequest;
import com.zenlayercloud.sdn20230830.models.DescribeDatacentersResponse;
import com.zenlayercloud.sdn20230830.models.DescribePortTrafficRequest;
import com.zenlayercloud.sdn20230830.models.DescribePortTrafficResponse;
import com.zenlayercloud.sdn20230830.models.DescribePortUsableVlanRequest;
import com.zenlayercloud.sdn20230830.models.DescribePortUsableVlanResponse;
import com.zenlayercloud.sdn20230830.models.DescribePortsRequest;
import com.zenlayercloud.sdn20230830.models.DescribePortsResponse;
import com.zenlayercloud.sdn20230830.models.DescribePrivateConnectAvailablePortsRequest;
import com.zenlayercloud.sdn20230830.models.DescribePrivateConnectAvailablePortsResponse;
import com.zenlayercloud.sdn20230830.models.DescribePrivateConnectAvailableSubnetsRequest;
import com.zenlayercloud.sdn20230830.models.DescribePrivateConnectAvailableSubnetsResponse;
import com.zenlayercloud.sdn20230830.models.DescribePrivateConnectTrafficRequest;
import com.zenlayercloud.sdn20230830.models.DescribePrivateConnectTrafficResponse;
import com.zenlayercloud.sdn20230830.models.DescribePrivateConnectsRequest;
import com.zenlayercloud.sdn20230830.models.DescribePrivateConnectsResponse;
import com.zenlayercloud.sdn20230830.models.DestroyPortRequest;
import com.zenlayercloud.sdn20230830.models.DestroyPortResponse;
import com.zenlayercloud.sdn20230830.models.DestroyPrivateConnectRequest;
import com.zenlayercloud.sdn20230830.models.DestroyPrivateConnectResponse;
import com.zenlayercloud.sdn20230830.models.InquiryCreatePrivateConnectPriceRequest;
import com.zenlayercloud.sdn20230830.models.InquiryCreatePrivateConnectPriceResponse;
import com.zenlayercloud.sdn20230830.models.ModifyPortAttributeRequest;
import com.zenlayercloud.sdn20230830.models.ModifyPortAttributeResponse;
import com.zenlayercloud.sdn20230830.models.ModifyPrivateConnectBandwidthRequest;
import com.zenlayercloud.sdn20230830.models.ModifyPrivateConnectBandwidthResponse;
import com.zenlayercloud.sdn20230830.models.ModifyPrivateConnectsAttributeRequest;
import com.zenlayercloud.sdn20230830.models.ModifyPrivateConnectsAttributeResponse;
import com.zenlayercloud.sdn20230830.models.RenewPortRequest;
import com.zenlayercloud.sdn20230830.models.RenewPortResponse;
import com.zenlayercloud.sdn20230830.models.RenewPrivateConnectRequest;
import com.zenlayercloud.sdn20230830.models.RenewPrivateConnectResponse;
import com.zenlayercloud.sdn20230830.models.TerminatePortRequest;
import com.zenlayercloud.sdn20230830.models.TerminatePortResponse;

import java.util.Map;

public class SdnClient extends AbstractClient {

    private static final String VERSION  = "2023-08-30";
    private static final String endpoint = "console.zenlayer.com";
    private static final String path     = "/api/v2/sdn";

    public SdnClient(Credential credential, Config config) {
        super(credential, config, Common.isUnset(config.endpoint) ? endpoint : config.endpoint, VERSION, path);
    }

    public SdnClient(Credential credential) {
        this(credential, new Config());
    }


    public DescribeDatacentersResponse describeDatacenters(DescribeDatacentersRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeDatacenters", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeDatacentersResponse());
    }

    public CreatePortResponse createPort(CreatePortRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreatePort", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreatePortResponse());
    }

    public DescribeDataCenterPortPriceResponse describeDataCenterPortPrice(DescribeDataCenterPortPriceRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeDataCenterPortPrice", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeDataCenterPortPriceResponse());
    }


    public DescribePortsResponse describePorts(DescribePortsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribePorts", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribePortsResponse());
    }

    public DescribePortTrafficResponse describePortTraffic(DescribePortTrafficRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribePortTraffic", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribePortTrafficResponse());
    }

    public DescribePortUsableVlanResponse describePortUsableVlan(DescribePortUsableVlanRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribePortUsableVlan", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribePortUsableVlanResponse());
    }

    public DestroyPortResponse destroyPort(DestroyPortRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DestroyPort", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DestroyPortResponse());
    }

    public ModifyPortAttributeResponse modifyPortAttribute(ModifyPortAttributeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyPortAttribute", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyPortAttributeResponse());
    }

    public TerminatePortResponse terminatePort(TerminatePortRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "TerminatePort", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new TerminatePortResponse());
    }

    public RenewPortResponse renewPort(RenewPortRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "RenewPort", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new RenewPortResponse());
    }

    public DescribePrivateConnectsResponse describePrivateConnects(DescribePrivateConnectsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribePrivateConnects", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribePrivateConnectsResponse());
    }

    /**
     * 子网专线已废弃,该字段将在未来一段时间彻底删除。
     */
    @Deprecated
    public DescribePrivateConnectAvailableSubnetsResponse describePrivateConnectAvailableSubnets(
            DescribePrivateConnectAvailableSubnetsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribePrivateConnectAvailableSubnets", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribePrivateConnectAvailableSubnetsResponse());
    }

    public DescribePrivateConnectAvailablePortsResponse describePrivateConnectAvailablePorts(
            DescribePrivateConnectAvailablePortsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribePrivateConnectAvailablePorts", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribePrivateConnectAvailablePortsResponse());
    }

    public CreatePrivateConnectResponse createPrivateConnect(CreatePrivateConnectRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreatePrivateConnect", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreatePrivateConnectResponse());
    }

    public ModifyPrivateConnectsAttributeResponse modifyPrivateConnectsAttribute(ModifyPrivateConnectsAttributeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyPrivateConnectsAttribute", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyPrivateConnectsAttributeResponse());
    }

    public InquiryCreatePrivateConnectPriceResponse inquiryCreatePrivateConnectPrice(
            InquiryCreatePrivateConnectPriceRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "InquiryCreatePrivateConnectPrice", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new InquiryCreatePrivateConnectPriceResponse());
    }

    public DeletePrivateConnectResponse deletePrivateConnect(
            DeletePrivateConnectRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeletePrivateConnect", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DeletePrivateConnectResponse());
    }

    public DestroyPrivateConnectResponse destroyPrivateConnect(
            DestroyPrivateConnectRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DestroyPrivateConnect", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DestroyPrivateConnectResponse());
    }

    public RenewPrivateConnectResponse renewPrivateConnect(
            RenewPrivateConnectRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "RenewPrivateConnect", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new RenewPrivateConnectResponse());
    }

    public DescribePrivateConnectTrafficResponse describePrivateConnectTraffic(
            DescribePrivateConnectTrafficRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribePrivateConnectTraffic", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribePrivateConnectTrafficResponse());
    }

    public ModifyPrivateConnectBandwidthResponse modifyPrivateConnectBandwidth(
            ModifyPrivateConnectBandwidthRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyPrivateConnectBandwidth", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyPrivateConnectBandwidthResponse());
    }
}
