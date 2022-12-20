/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-01-08 23:57:29
 * @version $ Id: ServerAvailableEipResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeInstanceAvailableEipResourcesResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String                     requestId;
    public List<InstanceAvailableEip> instanceEipResources;

    public static class InstanceAvailableEip extends TeaModel {

        /**
         * EIP唯一ID
         */
        public String eipId;

        /**
         * IP地址
         */
        public String ipAddress;
    }
}
