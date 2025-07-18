package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeRoutesResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;
    public List<RouteInfo> dataSet;
    public Integer totalCount;

    public static class RouteInfo extends TeaModel {
        public String       routeId;
        public String       name;
        public String       vpcId;
        public String       vpcName;
        public String       ipVersion;
        public String       type;
        public String       sourceCidrBlock;
        public String       cidrBlock;
        public Integer      priority;
        public String       nextHopId;
        public String       nextHopName;
        public String       nextHopType;
        public String       createTime;
    }
}
