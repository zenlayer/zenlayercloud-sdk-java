/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.sdn20260401;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.sdn20260401.models.*;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;
import com.zenlayercloud.common.TokenCredential;

import java.util.Map;


public class SdnClient extends AbstractClient {
    private static final String VERSION = "2026-04-01";
    private static final String ENDPOINT = "console.zenlayer.com";
    private static final String PATH = "/api/v2/sdn";

    public SdnClient(Credential credential, Config config) {
        super(credential, config,
            config.getEndpoint() != null ? config.getEndpoint() : ENDPOINT,
            VERSION, PATH);
    }

    public SdnClient(TokenCredential credential, Config config) {
        super(credential, config,
            config.getEndpoint() != null ? config.getEndpoint() : ENDPOINT,
            VERSION, PATH);
    }

        /**
         * 创建端口
         */
    public CreatePortResponse createPort(CreatePortRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreatePort",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreatePortResponse());
    }

        /**
         * 销毁端口
         */
    public DestroyPortResponse destroyPort(DestroyPortRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DestroyPort",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DestroyPortResponse());
    }

        /**
         * 终止端口
         */
    public TerminatePortResponse terminatePort(TerminatePortRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "TerminatePort",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new TerminatePortResponse());
    }

        /**
         * 恢复端口
         */
    public RenewPortResponse renewPort(RenewPortRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "RenewPort",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new RenewPortResponse());
    }

        /**
         * 修改端口属性
         */
    public ModifyPortAttributeResponse modifyPortAttribute(ModifyPortAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyPortAttribute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyPortAttributeResponse());
    }

        /**
         * 获取端口列表
         */
    public DescribePortsResponse describePorts(DescribePortsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribePorts",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribePortsResponse());
    }

        /**
         * 获取数据中心在售端口类型及价格
         */
    public DescribeDataCenterPortPriceResponse describeDataCenterPortPrice(DescribeDataCenterPortPriceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeDataCenterPortPrice",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeDataCenterPortPriceResponse());
    }

        /**
         * 查询端口流量
         */
    public DescribePortTrafficResponse describePortTraffic(DescribePortTrafficRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribePortTraffic",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribePortTrafficResponse());
    }

        /**
         * 查询端口可用vlan
         */
    public DescribePortUsableVlanResponse describePortUsableVlan(DescribePortUsableVlanRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribePortUsableVlan",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribePortUsableVlanResponse());
    }

        /**
         * 云连接带宽询价
         */
    public QueryCloudOnrampPriceResponse queryCloudOnrampPrice(QueryCloudOnrampPriceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "QueryCloudOnrampPrice",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new QueryCloudOnrampPriceResponse());
    }

        /**
         * 数据中心端口询价
         */
    public QueryDataCenterPortPriceResponse queryDataCenterPortPrice(QueryDataCenterPortPriceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "QueryDataCenterPortPrice",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new QueryDataCenterPortPriceResponse());
    }

        /**
         * 数据中心端口批量询价
         */
    public QueryDataCenterPortPricesResponse queryDataCenterPortPrices(QueryDataCenterPortPricesRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "QueryDataCenterPortPrices",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new QueryDataCenterPortPricesResponse());
    }

        /**
         * 二层网络专线询价
         */
    public QueryPrivateConnectPriceResponse queryPrivateConnectPrice(QueryPrivateConnectPriceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "QueryPrivateConnectPrice",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new QueryPrivateConnectPriceResponse());
    }

        /**
         * 二层专线带宽询价
         */
    public QueryPrivateConnectBandwidthPriceResponse queryPrivateConnectBandwidthPrice(QueryPrivateConnectBandwidthPriceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "QueryPrivateConnectBandwidthPrice",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new QueryPrivateConnectBandwidthPriceResponse());
    }

        /**
         * 三层骨干带宽询价
         */
    public QueryCloudRouterBandwidthPriceResponse queryCloudRouterBandwidthPrice(QueryCloudRouterBandwidthPriceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "QueryCloudRouterBandwidthPrice",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new QueryCloudRouterBandwidthPriceResponse());
    }

        /**
         * 查询Google接入点VLAN使用情况
         */
    public DescribeGoogleVlanUsageResponse describeGoogleVlanUsage(DescribeGoogleVlanUsageRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeGoogleVlanUsage",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeGoogleVlanUsageResponse());
    }

        /**
         * 查询腾讯云接入点VLAN使用情况
         */
    public DescribeTencentVlanUsageResponse describeTencentVlanUsage(DescribeTencentVlanUsageRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeTencentVlanUsage",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeTencentVlanUsageResponse());
    }

        /**
         * 查询阿里云接入点VLAN使用情况
         */
    public DescribeAliCloudVlanUsageResponse describeAliCloudVlanUsage(DescribeAliCloudVlanUsageRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAliCloudVlanUsage",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAliCloudVlanUsageResponse());
    }

        /**
         * 查询华为云接入点VLAN使用情况
         */
    public DescribeHuaweiCloudVlanUsageResponse describeHuaweiCloudVlanUsage(DescribeHuaweiCloudVlanUsageRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeHuaweiCloudVlanUsage",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeHuaweiCloudVlanUsageResponse());
    }

        /**
         * 查询Azure接入点VLAN使用情况
         */
    public DescribeAzureVlanUsageResponse describeAzureVlanUsage(DescribeAzureVlanUsageRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAzureVlanUsage",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAzureVlanUsageResponse());
    }

        /**
         * 查询Oracle接入点VLAN使用情况
         */
    public DescribeOracleVlanUsageResponse describeOracleVlanUsage(DescribeOracleVlanUsageRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeOracleVlanUsage",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeOracleVlanUsageResponse());
    }

        /**
         * 查询BytePlus接入点VLAN使用情况
         */
    public DescribeBytePlusVlanUsageResponse describeBytePlusVlanUsage(DescribeBytePlusVlanUsageRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeBytePlusVlanUsage",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeBytePlusVlanUsageResponse());
    }

        /**
         * 修改云连接带宽
         */
    public ModifyCloudBandwidthResponse modifyCloudBandwidth(ModifyCloudBandwidthRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyCloudBandwidth",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyCloudBandwidthResponse());
    }

        /**
         * 查询云连接可用带宽阶梯
         */
    public DescribeCloudAvailableBandwidthTiersResponse describeCloudAvailableBandwidthTiers(DescribeCloudAvailableBandwidthTiersRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeCloudAvailableBandwidthTiers",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeCloudAvailableBandwidthTiersResponse());
    }

        /**
         * 查询AWS接入点区域
         */
    public DescribeAWSRegionsResponse describeAWSRegions(DescribeAWSRegionsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAWSRegions",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAWSRegionsResponse());
    }

        /**
         * 查询腾讯云接入点区域
         */
    public DescribeTencentRegionsResponse describeTencentRegions(DescribeTencentRegionsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeTencentRegions",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeTencentRegionsResponse());
    }

        /**
         * 查询Google接入点区域
         */
    public DescribeGoogleRegionsResponse describeGoogleRegions(DescribeGoogleRegionsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeGoogleRegions",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeGoogleRegionsResponse());
    }

        /**
         * 查询Azure接入点区域
         */
    public DescribeAzureRegionsResponse describeAzureRegions(DescribeAzureRegionsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAzureRegions",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAzureRegionsResponse());
    }

        /**
         * 查询Oracle接入点区域
         */
    public DescribeOracleRegionsResponse describeOracleRegions(DescribeOracleRegionsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeOracleRegions",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeOracleRegionsResponse());
    }

        /**
         * 查询阿里云接入点区域
         */
    public DescribeAliCloudRegionsResponse describeAliCloudRegions(DescribeAliCloudRegionsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAliCloudRegions",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAliCloudRegionsResponse());
    }

        /**
         * 查询华为云接入点区域
         */
    public DescribeHuaweiCloudRegionsResponse describeHuaweiCloudRegions(DescribeHuaweiCloudRegionsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeHuaweiCloudRegions",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeHuaweiCloudRegionsResponse());
    }

        /**
         * 查询BytePlus接入点区域
         */
    public DescribeBytePlusRegionsResponse describeBytePlusRegions(DescribeBytePlusRegionsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeBytePlusRegions",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeBytePlusRegionsResponse());
    }

        /**
         * 查询AWS接入点VLAN使用情况
         */
    public DescribeAWSVlanUsageResponse describeAWSVlanUsage(DescribeAWSVlanUsageRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeAWSVlanUsage",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeAWSVlanUsageResponse());
    }

        /**
         * 创建三层网络
         */
    public CreateCloudRouterResponse createCloudRouter(CreateCloudRouterRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateCloudRouter",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateCloudRouterResponse());
    }

        /**
         * 删除连接点
         */
    public DeleteCloudRouterEdgePointResponse deleteCloudRouterEdgePoint(DeleteCloudRouterEdgePointRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteCloudRouterEdgePoint",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteCloudRouterEdgePointResponse());
    }

        /**
         * 新增连接点
         */
    public AddCloudRouterEdgePointsResponse addCloudRouterEdgePoints(AddCloudRouterEdgePointsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "AddCloudRouterEdgePoints",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new AddCloudRouterEdgePointsResponse());
    }

        /**
         * 修改三层网络属性
         */
    public ModifyCloudRoutersAttributeResponse modifyCloudRoutersAttribute(ModifyCloudRoutersAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyCloudRoutersAttribute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyCloudRoutersAttributeResponse());
    }

        /**
         * 查询可用VPC
         */
    public DescribeCloudRouterAvailableVpcsResponse describeCloudRouterAvailableVpcs(DescribeCloudRouterAvailableVpcsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeCloudRouterAvailableVpcs",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeCloudRouterAvailableVpcsResponse());
    }

        /**
         * 查询连接点流量
         */
    public DescribeCloudRouterEdgePointTrafficResponse describeCloudRouterEdgePointTraffic(DescribeCloudRouterEdgePointTrafficRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeCloudRouterEdgePointTraffic",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeCloudRouterEdgePointTrafficResponse());
    }

        /**
         * 查询数据中心间流量
         */
    public DescribeCloudRouterDCToDCTrafficResponse describeCloudRouterDCToDCTraffic(DescribeCloudRouterDCToDCTrafficRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeCloudRouterDCToDCTraffic",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeCloudRouterDCToDCTrafficResponse());
    }

        /**
         * 修改连接点带宽
         */
    public ModifyCloudRouterEdgePointBandwidthResponse modifyCloudRouterEdgePointBandwidth(ModifyCloudRouterEdgePointBandwidthRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyCloudRouterEdgePointBandwidth",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyCloudRouterEdgePointBandwidthResponse());
    }

        /**
         * 修改连接点配置
         */
    public ModifyCloudRouterEdgePointResponse modifyCloudRouterEdgePoint(ModifyCloudRouterEdgePointRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyCloudRouterEdgePoint",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyCloudRouterEdgePointResponse());
    }

        /**
         * 删除三层网络
         */
    public DeleteCloudRouterResponse deleteCloudRouter(DeleteCloudRouterRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteCloudRouter",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteCloudRouterResponse());
    }

        /**
         * 销毁三层网络
         */
    public DestroyCloudRouterResponse destroyCloudRouter(DestroyCloudRouterRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DestroyCloudRouter",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DestroyCloudRouterResponse());
    }

        /**
         * 恢复三层网络
         */
    public RenewCloudRouterResponse renewCloudRouter(RenewCloudRouterRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "RenewCloudRouter",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new RenewCloudRouterResponse());
    }

        /**
         * 查询可用端口
         */
    public DescribeCloudRouterAvailablePortsResponse describeCloudRouterAvailablePorts(DescribeCloudRouterAvailablePortsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeCloudRouterAvailablePorts",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeCloudRouterAvailablePortsResponse());
    }

        /**
         * 查询三层网络列表
         */
    public DescribeCloudRoutersResponse describeCloudRouters(DescribeCloudRoutersRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeCloudRouters",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeCloudRoutersResponse());
    }

        /**
         * 查询数据中心列表
         */
    public DescribeDatacentersResponse describeDatacenters(DescribeDatacentersRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeDatacenters",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeDatacentersResponse());
    }

        /**
         * 查询边缘网关数据中心列表
         */
    public DescribeVirtualEdgeDatacentersResponse describeVirtualEdgeDatacenters(DescribeVirtualEdgeDatacentersRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeVirtualEdgeDatacenters",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeVirtualEdgeDatacentersResponse());
    }

        /**
         * 查询边界网关数据中心列表
         */
    public DescribeBorderGatewayDatacentersResponse describeBorderGatewayDatacenters(DescribeBorderGatewayDatacentersRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeBorderGatewayDatacenters",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeBorderGatewayDatacentersResponse());
    }

        /**
         * 查询 VPC 数据中心列表
         */
    public DescribeVPCDatacentersResponse describeVPCDatacenters(DescribeVPCDatacentersRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeVPCDatacenters",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeVPCDatacentersResponse());
    }

        /**
         * 查询含服务的数据中心列表
         */
    public DescribeDatacentersWithServiceResponse describeDatacentersWithService(DescribeDatacentersWithServiceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeDatacentersWithService",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeDatacentersWithServiceResponse());
    }

        /**
         * 获取二层网络专线列表
         */
    public DescribePrivateConnectsResponse describePrivateConnects(DescribePrivateConnectsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribePrivateConnects",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribePrivateConnectsResponse());
    }

        /**
         * 创建二层网络专线
         */
    public CreatePrivateConnectResponse createPrivateConnect(CreatePrivateConnectRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreatePrivateConnect",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreatePrivateConnectResponse());
    }

        /**
         * 修改二层网络专线带宽
         */
    public ModifyPrivateConnectBandwidthResponse modifyPrivateConnectBandwidth(ModifyPrivateConnectBandwidthRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyPrivateConnectBandwidth",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyPrivateConnectBandwidthResponse());
    }

        /**
         * 查询二层网络专线流量
         */
    public DescribePrivateConnectTrafficResponse describePrivateConnectTraffic(DescribePrivateConnectTrafficRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribePrivateConnectTraffic",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribePrivateConnectTrafficResponse());
    }

        /**
         * 删除二层网络专线
         */
    public DeletePrivateConnectResponse deletePrivateConnect(DeletePrivateConnectRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeletePrivateConnect",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeletePrivateConnectResponse());
    }

        /**
         * 销毁二层网络专线
         */
    public DestroyPrivateConnectResponse destroyPrivateConnect(DestroyPrivateConnectRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DestroyPrivateConnect",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DestroyPrivateConnectResponse());
    }

        /**
         * 查询可加入的数据中心端口
         */
    public DescribePrivateConnectAvailablePortsResponse describePrivateConnectAvailablePorts(DescribePrivateConnectAvailablePortsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribePrivateConnectAvailablePorts",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribePrivateConnectAvailablePortsResponse());
    }

        /**
         * 修改二层网络专线属性
         */
    public ModifyPrivateConnectsAttributeResponse modifyPrivateConnectsAttribute(ModifyPrivateConnectsAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyPrivateConnectsAttribute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyPrivateConnectsAttributeResponse());
    }

        /**
         * 恢复二层网络专线
         */
    public RenewPrivateConnectResponse renewPrivateConnect(RenewPrivateConnectRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "RenewPrivateConnect",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new RenewPrivateConnectResponse());
    }

        /**
         * 二层网络专线询价
         */
    public InquiryCreatePrivateConnectPriceResponse inquiryCreatePrivateConnectPrice(InquiryCreatePrivateConnectPriceRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "InquiryCreatePrivateConnectPrice",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new InquiryCreatePrivateConnectPriceResponse());
    }

}