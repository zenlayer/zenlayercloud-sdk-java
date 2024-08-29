package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeSubnetRegionsResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    public List<RegionInfo> regionSet;

    public static class RegionInfo extends TeaModel {
        public String regionId;
        public String regionName;
        public String regionTitle;
        public Boolean enablePubIpv6;
    }
}
