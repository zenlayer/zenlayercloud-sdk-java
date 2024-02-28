/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author sherlock
 * @version $ Id: DescribeZonesResponse.java, v 0.1  sherlock Exp $
 * @date 2023-03-08 14:38:53
 */

public class DescribeZonesResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String         requestId;
    public List<ZoneInfo> zoneSet;

    public static class ZoneInfo extends TeaModel {
        /**
         * 区域ID。
         */
        public String  zoneId;
        /**
         * 区域名称。
         */
        public String  zoneName;
        /**
         * 是否支持安全组。
         */
        public Boolean supportSecurityGroup;
        /**
         * 支持的网络类型。<br/>
         * CLASSICS：经典网络。<br/>
         * VPC: VPC网络
         */
        public String  supportNetworkType;

    }
}
