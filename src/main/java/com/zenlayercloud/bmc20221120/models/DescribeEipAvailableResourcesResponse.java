/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-01-05 13:37:48
 * @version $ Id: DescribeEipAvailableResourceResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeEipAvailableResourcesResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String             requestId;

    /**
     * 购买EIP区域列表。
     */
    public List<EipAvailable> eipResources;

    public static class EipAvailable extends TeaModel {

        /**
         * 可用区ID
         */
        public String zoneId;

        /**
         * EIP是否售卖。取值范围：
         * SELL：表示EIP可购买，且库存>10台
         * SELL_SHORTAGE: 表示可购买，但是库存<10台
         * SOLD_OUT：表示实例已售罄。
         */
        public String status;
    }
}
