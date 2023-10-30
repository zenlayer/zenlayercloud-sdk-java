/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-08-30 10:56:49
 * @version $ Id: DescribePrivateConnectsResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribePrivateConnectsResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 符合条件的二层网络专线总数量。
     */
    public Integer totalCount;

    /**
     * 二层网络专线列表。
     */
    public List<PrivateConnect> dataSet;

    public static class PrivateConnect extends TeaModel {

        /**
         * 二层专线网络ID。
         */
        public String privateConnectId;

        /**
         * 二层专线网络名称
         */
        public String privateConnectName;

        /**
         * 连通性状态。
         */
        public String connectivityStatus;

        /**
         * 连接点A的基本信息。
         */
        public PrivateConnectEndpoint endpointA;

        /**
         * 连接点Z的基本信息。
         */
        public PrivateConnectEndpoint endpointZ;

        /**
         * 专线的业务状态。
         */
        public String privateConnectStatus;

        /**
         * 二层专线网络的最大带宽限速。
         */
        public Long bandwidthMbps;

        /**
         * 所属的资源组ID。
         */
        public String  resourceGroupId;

        /**
         * 所属的资源组名称。
         */
        public String resourceGroupName;

        /**
         * 创建时间。
         */
        public String createTime;

        /**
         * 过期时间。
         * 预付费资源可用。
         */
        public String expiredTime;

        /**
         * 回收时间。
         */
        public String recycledTime;

        public static class PrivateConnectEndpoint extends TeaModel {

            /**
             * 连接点的ID。
             */
            public String endpointId;

            /**
             * 连接点的名称。
             */
            public String endpointName;

            /**
             * 连接点的类型。
             */
            public String endpointType;

            /**
             * 连接点所属的数据中心信息。
             */
            public DatacenterInfo dataCenter;

            /**
             * 连接点的VLAN ID。
             *
             * 范围 1～4096。
             */
            public Integer vlanId;

            /**
             * 连接点的连通性状态。
             */
            public String connectivityStatus;

            /**
             * 公有云区域ID。
             */
            public String cloudRegionId;
            /**
             * 公有云账号ID。Google 云此处为 pairing key.
             */
            public String cloudAccountId;
 
        }

    }
}
