/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-27 14:24:42
 * @version $ Id: DescribeZonesResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeZonesResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 可用区列表
     */
    public List<Zone> zoneSet;

    public static class Zone extends TeaModel {

        /**
         * 可用区ID
         */
        public String zoneId;

        /**
         * 可用区名称
         */
        public String zoneName;

        /**
         * 可用区城市名称
         */
        public String cityName;

        /**
         * 可用区所在大区名称
         */
        public String areaName;

        /**
         * 可用区是否支持SDN三层网络。
         */
        public Boolean isCloudRouterAvailable;
    }
}
