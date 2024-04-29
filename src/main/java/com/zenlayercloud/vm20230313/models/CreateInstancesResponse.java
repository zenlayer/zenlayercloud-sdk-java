/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-30 14:08:43
 * @version $ Id: CreateInstancesResponse.java, v 0.1  alicat.xu Exp $
 */
public class CreateInstancesResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String             requestId;

    /**
     * 实例ID集合
     */
    public List<String> instanceIdSet;
    /**
     * 实例ID带数据盘集合
     */
    public List<InnerInstance> instances;

    /**
     * 订单编号
     */
    public  String       orderNumber;

    public static class InnerInstance {
        public String       instanceId;
        /**
         * 随实例创建的数据盘
         */
        public List<String> diskIdSet;
    }
}
