/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.traffic20240326;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.traffic20240326.models.*;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;

import java.util.Map;

public class TrafficClient extends AbstractClient {
    private static final String VERSION  = "2024-03-26";
    private static final String ENDPOINT = "console.zenlayer.com";
    private static final String PATH     = "/api/v2/traffic";

    public TrafficClient(Credential credential, Config config) {
        super(credential, config, config.getEndpoint() != null ? config.getEndpoint() : ENDPOINT, VERSION, PATH);
    }

    /**
     * 查询一个或多个共享带宽包的信息。
     * 用户可以根据共享带宽包ID、名称或者城市名称等条件来查询共享带宽包的详细信息。

     */
    public DescribeBandwidthClustersResponse describeBandwidthClusters(DescribeBandwidthClustersRequest request) {
        Map<String, ?> rsp = super.callApi(request, "DescribeBandwidthClusters", new RuntimeOptions());
        return TeaModel.toModel(rsp, new DescribeBandwidthClustersResponse());
    }

    /**
     * 查询一个共享带宽包里的资源。

     */
    public DescribeBandwidthClusterResourcesResponse describeBandwidthClusterResources(DescribeBandwidthClusterResourcesRequest request) {
        Map<String, ?> rsp = super.callApi(request, "DescribeBandwidthClusterResources", new RuntimeOptions());
        return TeaModel.toModel(rsp, new DescribeBandwidthClusterResourcesResponse());
    }

    /**
     * 查询共享带宽包的地区信息。

     */
    public DescribeBandwidthClusterAreasResponse describeBandwidthClusterAreas(DescribeBandwidthClusterAreasRequest request) {
        Map<String, ?> rsp = super.callApi(request, "DescribeBandwidthClusterAreas", new RuntimeOptions());
        return TeaModel.toModel(rsp, new DescribeBandwidthClusterAreasResponse());
    }

    /**
     * 查询带宽组指定时间段内的流量信息。

     */
    public DescribeBandwidthClusterTrafficResponse describeBandwidthClusterTraffic(DescribeBandwidthClusterTrafficRequest request) {
        Map<String, ?> rsp = super.callApi(request, "DescribeBandwidthClusterTraffic", new RuntimeOptions());
        return TeaModel.toModel(rsp, new DescribeBandwidthClusterTrafficResponse());
    }

    /**
     * 查询共享带宽包价格。

     */
    public InquiryBandwidthClusterPriceResponse inquiryBandwidthClusterPrice(InquiryBandwidthClusterPriceRequest request) {
        Map<String, ?> rsp = super.callApi(request, "InquiryBandwidthClusterPrice", new RuntimeOptions());
        return TeaModel.toModel(rsp, new InquiryBandwidthClusterPriceResponse());
    }

    /**
     * 创建一个共享带宽包。

     */
    public CreateBandwidthClusterResponse createBandwidthCluster(CreateBandwidthClusterRequest request) {
        Map<String, ?> rsp = super.callApi(request, "CreateBandwidthCluster", new RuntimeOptions());
        return TeaModel.toModel(rsp, new CreateBandwidthClusterResponse());
    }

    /**
     * 删除一个或多个共享带宽包。

     */
    public DeleteBandwidthClustersResponse deleteBandwidthClusters(DeleteBandwidthClustersRequest request) {
        Map<String, ?> rsp = super.callApi(request, "DeleteBandwidthClusters", new RuntimeOptions());
        return TeaModel.toModel(rsp, new DeleteBandwidthClustersResponse());
    }

    /**
     * 修改带宽包的保底带宽。

     */
    public UpdateBandwidthClusterCommitBandwidthResponse updateBandwidthClusterCommitBandwidth(
            UpdateBandwidthClusterCommitBandwidthRequest request) {
        Map<String, ?> rsp = super.callApi(request, "UpdateBandwidthClusterCommitBandwidth", new RuntimeOptions());
        return TeaModel.toModel(rsp, new UpdateBandwidthClusterCommitBandwidthResponse());
    }

    /**
     * 共享带宽包之间的资源迁移。

     */
    public MigrateBandwidthClusterResourcesResponse migrateBandwidthClusterResources(MigrateBandwidthClusterResourcesRequest request) {
        Map<String, ?> rsp = super.callApi(request, "MigrateBandwidthClusterResources", new RuntimeOptions());
        return TeaModel.toModel(rsp, new MigrateBandwidthClusterResourcesResponse());
    }

}