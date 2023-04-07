/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-23 17:09:30
 * @version $ Id: DescribeInstancesStatusRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeInstancesStatusRequest extends TeaModel {
    /**
     * 一个或多个待操作的实例ID。
     * 可通过DescribeInstances接口返回值中的InstanceId获取。
     * 每次请求批量实例的上限为100。
     */
    public List<String> instanceIds;

    /**
     * 返回的分页大小
     * 默认为20。最大为1000
     */
    public Integer pageSize;

    /**
     * 返回的分页数
     * 默认为1
     */
    public Integer pageNum;
}
