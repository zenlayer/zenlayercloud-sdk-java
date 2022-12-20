/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-01-05 13:34:23
 * @version $ Id: DescribeEipAddressesRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeDdosIpAddressesRequest extends TeaModel {

    /**
     * DDOS IP ID 取值可以由多个DDOS IP ID组成一个
     * 最多支持100个ID查询
     */
    public List<String> ddosIpIds;

    /**
     *  PREPAID：预付费，即包年包月
     *  POSTPAID：后付费
     */
    public String ddosIpChargeType;

    /**
     * IP地址
     */
    public String ipAddress;

    /**
     * EIP所属的可用区ID
     */
    public String zoneId;

    /**
     * 资源组的ID
     * 如果不传，则返回该用户可见的所有资源组内的EIP
     */

    public String resourceGroupId;

    /**
     * DDOS IP 状态，状态如下
     * CREATING：表示创建中
     * CREATE_FAILED：表示创建失败
     * ASSOCIATING: 表示绑定中
     * UNASSOCIATING: 表示解绑中
     * INUSE：表示已分配
     * AVAILABLE：表示可用
     * RELEASING：表示释放中
     * RECYCLE：表示在回收站
     */
    public String ddosIpStatus;

    /**
     * 机器实例ID
     */
    public String instanceId;

    /**
     * 机器实例名称
     */
    public String instanceName;

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
