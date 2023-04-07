/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author wolfgang
 * @date 2022-11-09 20:21:03
 * @version $ Id: CreateInstanceRequest.java, v 0.1  wolfgang Exp $
 */
public class CreateInstancesResponse extends TeaModel {
    /**
     * 实例ID列表。
     * 当通过本接口来创建实例时会返回该参数，表示一个或多个实例ID。返回实例ID列表并不代表实例创建成功，可根据 DescribeInstances 接口查询返回的dataSet中对应实例的状态来判断创建是否完成：如果实例状态由CREATING(创建中)
     * 或PENDING变为RUNNING(运行中)，则为创建成功；如果实例找不到或状态变为CREATE_FAILED，表示创建失败。
     */
    public List<String> instanceIdSet;

    /**
     * 订单编号。
     */
    public String       orderNumber;
}
