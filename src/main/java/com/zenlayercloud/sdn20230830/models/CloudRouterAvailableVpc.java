/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-10-10 10:13:45
 * @version $ Id: CloudRouterAvailableVpc.java, v 0.1  alicat.xu Exp $
 */
public class CloudRouterAvailableVpc extends TeaModel {

    /**
     * VPC ID。
     */
    public String vpcId;

    /**
     * VPC 名称
     */
    public String vpcName;

    /**
     * vpc所在的数据中心。
     */
    public DatacenterInfo dataCenter;

    /**
     * VPC 的 CIDR。
     */
    public String cidrBlock;

}
