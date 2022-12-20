/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.Date;
import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-02-21 23:39:22
 * @version $ Id: DescribeVpcsResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeSubnetsResponse extends TeaModel {

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
    public List<SubnetInfo> dataSet;

    public static class SubnetInfo extends TeaModel {
        /**
         * Subnet唯一ID。
         */
        public String subnetId;

        /**
         * Subnet名称。
         */
        public String subnetName;

        /**
         * 可用区ID。
         */
        public String zoneId;

        /**
         * Subnet可用IP数量
         */
        public String availableIpCount;

        /**
         * CidrBlock。
         */
        public String cidrBlock;

        /**
         * 状态。
         */
        public String subnetStatus;

        /**
         * 创建时间。
         * 格式为：YYYY-MM-DDThh:mm:ssZ。
         */
        public String createTime;

        /**
         * Subnet绑定VPC状态。
         */
        public String vpcSubnetStatus;

        /**
         * VPC ID。
         */
        public String vpcId;

        /**
         * VPC 名称。
         */
        public String vpcName;

        /**
         * 所属资源组的ID。
         */
        public String resourceGroupId;

        /**
         * 所属资源组的名称。
         */
        public String resourceGroupName;

        /**
         * Subnet下实例集合
         */
        public List<SubnetInstanceInfo> subnetInstanceSet;


        public static class SubnetInstanceInfo extends TeaModel {

            /**
             * 实例ID。
             */
            public String instanceId;

            /**
             * 私网IP。
             */
            public String privateIpAddress;

            /**
             * 私网IP状态。
             */
            public String privateIpStatus;
        }
    }
}
