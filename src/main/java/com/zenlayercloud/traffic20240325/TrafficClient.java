package com.zenlayercloud.traffic20240325;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;
import com.zenlayercloud.traffic20240325.models.DescribeBandwidthClusterTrafficRequest;
import com.zenlayercloud.traffic20240325.models.DescribeBandwidthClusterTrafficResponse;
import com.zenlayercloud.traffic20240325.models.DescribeBandwidthClustersRequest;
import com.zenlayercloud.traffic20240325.models.DescribeBandwidthClustersResponse;

import java.util.Map;

/**
 * @author Zif
 * @date 2024/3/25
 */
public class TrafficClient extends AbstractClient {

    private static final String VERSION  = "2024-03-25";
    private static final String endpoint = "console.zenlayer.com";
    private static final String path     = "/api/v2/traffic";

    public TrafficClient(Credential credential, Config config) {
        super(credential, config, Common.isUnset(config.endpoint) ? endpoint : config.endpoint, VERSION, path);
    }

    public TrafficClient(Credential credential) {
        this(credential, new Config());
    }

    public DescribeBandwidthClustersResponse describeBandwidthClusters(DescribeBandwidthClustersRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeBandwidthClusters", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DescribeBandwidthClustersResponse());
    }

    public DescribeBandwidthClusterTrafficResponse describeBandwidthClusterTraffic(DescribeBandwidthClusterTrafficRequest request) {
        Map<String, ?> rspStr = super.callApi(request, "DescribeBandwidthClusterTraffic", new RuntimeOptions());

        return TeaModel.toModel(rspStr, new DescribeBandwidthClusterTrafficResponse());
    }

}
