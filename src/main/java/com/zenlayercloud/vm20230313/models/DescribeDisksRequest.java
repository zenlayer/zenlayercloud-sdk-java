/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-23 14:49:49
 * @version $ Id: DescribeDisksRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeDisksRequest extends TeaModel {

    /**
     * DISK ID 取值可以由多个DISK ID组成一个
     * 最多支持100个ID查询
     */
    public List<String> diskIds;

    /**
     * DISK名称
     */
    public String diskName;

    /**
     * DISK状态
     */
    public String diskStatus;

    /**
     * DISK类型。
     */
    public String diskType;

    /**
     * DISK大小
     */
    public Integer diskSize;

    /**
     * 是否可插拔
     */
    public Boolean portable;

    /**
     * 实例ID
     */
    public String instanceId;

    /**
     * 区域ID
     */
    public String zoneId;

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
