/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-01-05 13:35:14
 * @version $ Id: DescribeEipAddressResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeDdosIpAddressesResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId
     */
    public String              requestId;

    /**
     * Ddos IP列表。
     */
    public List<DdosIpAddress> dataSet;

    /**
     * 符合条件的Ddos IP总数量。
     */
    public Integer             totalCount;

    public static class DdosIpAddress extends TeaModel {
        /**
         * DDOS IP唯一ID
         */
        public String ddosIpId;

        /**
         * DDOS IP所属的可用区ID
         */
        public String zoneId;

        /**
         * IP地址
         */
        public String ipAddress;

        /**
         * 机器实例ID
         */
        public String instanceId;

        /**
         * 机器实例名称
         */
        public String instanceName;

        /**
         *  PREPAID：预付费，即包年包月
         *  POSTPAID：后付费
         */
        public String ddosIpChargeType;

        /**
         * 购买DDOS IP的时长，单位：月
         * 后付费DDOS IP该字段为null
         */
        public Integer period;

        /**
         * 创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
         */
        public String createTime;

        /**
         * 到期时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-ddThh:mm:ssZ。注意：后付费模式本项为null
         */
        public String expiredTime;

        /**
         * 资源组ID
         */
        public String resourceGroupId;

        /**
         * 资源组名称
         */
        public String resourceGroupName;

        /**
         * DDOS IP状态。取值范围：
         * CREATING：表示创建中
         * CREATE_FAILED：表示创建失败
         * ASSOCIATING: 表示绑定中
         * UNASSOCIATING: 表示解绑中
         * INUSE：表示已分配
         * AVAILABLE：表示可用
         * RELEASING：表示释放中
         * RECYCLE：表示在回收站
         */
        public String ddosIpStatus;
    }

}
