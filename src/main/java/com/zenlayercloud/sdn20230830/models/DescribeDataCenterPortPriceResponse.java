/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-08-30 10:04:26
 * @version $ Id: DescribeDataCenterPortTypeResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeDataCenterPortPriceResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 结果集。
     */
    public List<PortPrice> portPriceSet;


    public static class PortPrice extends TeaModel {
        /**
         * 数据中心 的Id，如SIN1。
         */
        public String dcId;

        /**
         * 端口 的规格。
         */
        public String portType;

        /**
         * 端口 天价格。
         */
        public Double portDailyPrice;

        /**
         * 端口 月价格。
         */
        public Double portMonthlyPrice;
    }
}
