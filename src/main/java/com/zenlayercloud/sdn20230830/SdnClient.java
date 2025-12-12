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
import com.zenlayercloud.sdn20230830.models.*;

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

    public DescribeDatacentersWithServiceResponse describeDatacentersWithService(DescribeDatacentersWithServiceRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeDatacentersWithService", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeDatacentersWithServiceResponse());
    }

    public DescribeVirtualEdgeDatacentersResponse describeVirtualEdgeDatacenters(DescribeVirtualEdgeDatacentersRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeVirtualEdgeDatacenters", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeVirtualEdgeDatacentersResponse());
    }


    public DescribeBorderGatewayDatacentersResponse describeBorderGatewayDatacenters(DescribeBorderGatewayDatacentersRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeBorderGatewayDatacenters", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeBorderGatewayDatacentersResponse());
    }

    public QueryDataCenterPortPriceResponse queryDataCenterPortPrice(QueryDataCenterPortPriceRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "QueryDataCenterPortPrice", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new QueryDataCenterPortPriceResponse());
    }

    public QueryDataCenterPortPricesResponse queryDataCenterPortPrices(QueryDataCenterPortPricesRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "QueryDataCenterPortPrices", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new QueryDataCenterPortPricesResponse());
    }


    public QueryPrivateConnectPriceResponse queryPrivateConnectPrice(QueryPrivateConnectPriceRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "QueryPrivateConnectPrice", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new QueryPrivateConnectPriceResponse());
    }

    public QueryPrivateConnectBandwidthPriceResponse queryPrivateConnectBandwidthPrice(QueryPrivateConnectBandwidthPriceRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "QueryPrivateConnectBandwidthPrice", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new QueryPrivateConnectBandwidthPriceResponse());
    }


    public QueryCloudRouterBandwidthPriceResponse queryCloudRouterBandwidthPrice(QueryCloudRouterBandwidthPriceRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "QueryCloudRouterBandwidthPrice", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new QueryCloudRouterBandwidthPriceResponse());
    }

    public QueryCloudOnrampPriceResponse queryCloudOnrampPrice(QueryCloudOnrampPriceRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "QueryCloudOnrampPrice", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new QueryCloudOnrampPriceResponse());
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
     * 子网专线已废弃,该接口将在未来一段时间彻底删除。
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

    public InquiryCreatePrivateConnectPriceResponse inquiryCreatePrivateConnectPrice(InquiryCreatePrivateConnectPriceRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "InquiryCreatePrivateConnectPrice", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new InquiryCreatePrivateConnectPriceResponse());
    }

    public DeletePrivateConnectResponse deletePrivateConnect(DeletePrivateConnectRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeletePrivateConnect", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DeletePrivateConnectResponse());
    }

    public DestroyPrivateConnectResponse destroyPrivateConnect(DestroyPrivateConnectRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DestroyPrivateConnect", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DestroyPrivateConnectResponse());
    }

    public RenewPrivateConnectResponse renewPrivateConnect(RenewPrivateConnectRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "RenewPrivateConnect", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new RenewPrivateConnectResponse());
    }

    public DescribePrivateConnectTrafficResponse describePrivateConnectTraffic(DescribePrivateConnectTrafficRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribePrivateConnectTraffic", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribePrivateConnectTrafficResponse());
    }

    public ModifyPrivateConnectBandwidthResponse modifyPrivateConnectBandwidth(ModifyPrivateConnectBandwidthRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyPrivateConnectBandwidth", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyPrivateConnectBandwidthResponse());
    }

    public DescribeCloudRoutersResponse describeCloudRouters(DescribeCloudRoutersRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeCloudRouters", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeCloudRoutersResponse());
    }

    public DescribeCloudRouterAvailableVpcsResponse describeCloudRouterAvailableVpcs(DescribeCloudRouterAvailableVpcsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeCloudRouterAvailableVpcs", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeCloudRouterAvailableVpcsResponse());
    }

    public DescribeCloudRouterAvailablePortsResponse describeCloudRouterAvailablePorts(DescribeCloudRouterAvailablePortsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeCloudRouterAvailablePorts", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeCloudRouterAvailablePortsResponse());
    }

    public CreateCloudRouterResponse createCloudRouter(CreateCloudRouterRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "CreateCloudRouter", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new CreateCloudRouterResponse());
    }

    public ModifyCloudRoutersAttributeResponse modifyCloudRoutersAttribute(ModifyCloudRoutersAttributeRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyCloudRoutersAttribute", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyCloudRoutersAttributeResponse());
    }

    public AddCloudRouterEdgePointsResponse addCloudRouterEdgePoints(AddCloudRouterEdgePointsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "AddCloudRouterEdgePoints", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new AddCloudRouterEdgePointsResponse());
    }

    public DeleteCloudRouterEdgePointResponse deleteCloudRouterEdgePoint(DeleteCloudRouterEdgePointRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeleteCloudRouterEdgePoint", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DeleteCloudRouterEdgePointResponse());
    }

    public DeleteCloudRouterResponse deleteCloudRouter(DeleteCloudRouterRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DeleteCloudRouter", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DeleteCloudRouterResponse());
    }

    public DestroyCloudRouterResponse destroyCloudRouter(DestroyCloudRouterRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DestroyCloudRouter", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DestroyCloudRouterResponse());
    }

    public RenewCloudRouterResponse renewCloudRouter(RenewCloudRouterRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "RenewCloudRouter", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new RenewCloudRouterResponse());
    }

    public ModifyCloudRouterEdgePointBandwidthResponse modifyCloudRouterEdgePointBandwidth(
            ModifyCloudRouterEdgePointBandwidthRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyCloudRouterEdgePointBandwidth", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyCloudRouterEdgePointBandwidthResponse());
    }

    public DescribeCloudRouterEdgePointTrafficResponse describeCloudRouterEdgePointTraffic(
            DescribeCloudRouterEdgePointTrafficRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeCloudRouterEdgePointTraffic", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeCloudRouterEdgePointTrafficResponse());
    }

    public ModifyCloudRouterEdgePointResponse modifyCloudRouterEdgePoint(ModifyCloudRouterEdgePointRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "ModifyCloudRouterEdgePoint", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new ModifyCloudRouterEdgePointResponse());
    }

    public DescribeGoogleRegionsResponse describeGoogleRegions(DescribeGoogleRegionsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeGoogleRegions", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeGoogleRegionsResponse());
    }

    public DescribeGoogleVlanUsageResponse describeGoogleVlanUsage(DescribeGoogleVlanUsageRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeGoogleVlanUsage", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeGoogleVlanUsageResponse());
    }

    public DescribeAliCloudRegionsResponse describeAliCloudRegions(DescribeAliCloudRegionsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeAliCloudRegions", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeAliCloudRegionsResponse());
    }

    public DescribeAliCloudVlanUsageResponse describeAliCloudVlanUsage(DescribeAliCloudVlanUsageRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeAliCloudVlanUsage", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeAliCloudVlanUsageResponse());
    }

    public DescribeAzureRegionsResponse describeAzureRegions(DescribeAzureRegionsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeAzureRegions", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeAzureRegionsResponse());
    }

    public DescribeAzureVlanUsageResponse describeAzureVlanUsage(DescribeAzureVlanUsageRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeAzureVlanUsage", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeAzureVlanUsageResponse());
    }

    public DescribeTencentRegionsResponse describeTencentRegions(DescribeTencentRegionsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeTencentRegions", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeTencentRegionsResponse());
    }

    public DescribeTencentVlanUsageResponse describeTencentVlanUsage(DescribeTencentVlanUsageRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeTencentVlanUsage", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeTencentVlanUsageResponse());
    }

    public DescribeAWSRegionsResponse describeAWSRegions(DescribeAWSRegionsRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeAWSRegions", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeAWSRegionsResponse());
    }

    public DescribeAWSVlanUsageResponse describeAWSVlanUsage(DescribeAWSVlanUsageRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeAWSVlanUsage", new RuntimeOptions());
        return TeaModel.toModel(rspStr, new DescribeAWSVlanUsageResponse());
    }

}
