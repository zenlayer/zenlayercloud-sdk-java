/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-23 17:09:35
 * @version $ Id: DescribeInstancesStatusResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeInstancesStatusResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String             requestId;
    public List<InstanceStatus> dataSet;
    public Integer            totalCount;

    public static class InstanceStatus extends TeaModel {

        /**
         * 实例ID
         */
        public String instanceId;

        /**
         * 实例状态
         */
        public String instanceStatus;

    }

}
