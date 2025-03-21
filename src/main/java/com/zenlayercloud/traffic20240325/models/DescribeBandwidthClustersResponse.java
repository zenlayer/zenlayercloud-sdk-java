package com.zenlayercloud.traffic20240325.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author Zif
 * @date 2024/3/25
 */
public class DescribeBandwidthClustersResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 符合条件的数据总数。
     */
    public Integer totalCount;

    /**
     * 结果集。
     */
    public List<BandwidthClusterInfo> dataSet;

    public static class BandwidthClusterInfo extends TeaModel {

        /**
         * 带宽组唯一ID。
         */
        public String bandwidthClusterId;

        /**
         * 带宽组显示名称。
         */
        public String bandwidthClusterName;

        /**
         * 带宽组所属区域。
         */
        public String location;

        /**
         * 带宽组包含的城市信息。
         */
        public List<CityInfo> cities;

        /**
         * 创建时间。
         * 格式为：YYYY-MM-DDThh:mm:ssZ。
         */
        public String createTime;

    }

    public static class CityInfo extends TeaModel {
        public String cityName;
        public String cityCode;
    }
}
