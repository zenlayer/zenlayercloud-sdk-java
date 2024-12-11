/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-30 14:02:20
 * @version $ Id: DescribeZoneInstanceConfigInfosResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeZoneInstanceConfigInfosResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    public List<InstanceTypeQuotaItem> instanceTypeQuotaSet;

    public static class InstanceTypeQuotaItem extends TeaModel {

        /**
         * 可用区ID
         */
        public String zoneId;

        /**
         * 实例机型
         */
        public String instanceType;

        /**
         * CPU核数
         */
        public Integer cpuCount;

        /**
         * 内存容量
         */
        public Integer memory;

        /**
         * CPU主频
         */
        public String frequency;

        /**
         * 出口带宽限制
         */
        public Integer internetMaxBandwidthOutLimit;

        /**
         * 实例机型名称
         */
        public String instanceTypeName;

        /**
         * 网络计费类型
         */
        public List<String> internetChargeTypes;
    }
}
