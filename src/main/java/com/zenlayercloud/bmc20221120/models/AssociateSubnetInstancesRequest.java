/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-02-22 14:44:34
 * @version $ Id: UnAssociateSubnetInstanceRequest.java, v 0.1  alicat.xu Exp $
 */
public class AssociateSubnetInstancesRequest extends TeaModel {

    /**
     * Subnet ID
     */
    @Validation(required = true)
    public String subnetId;

    /**
     * Subnet绑定实例集合。
     */
    @Validation(required = true)
    public List<AssociateSubnetInstance> subnetInstanceList;

    public static class AssociateSubnetInstance {
        /**
         * 实例ID。
         */
        @Validation(required = true)
        public String instanceId;

        /**
         * 内网IPv4地址。该地址必须在子网的CIDR范围内。 如果不指定内网地址，系统会会寻找CIDR中未用的内网地址下发到实例。
         */
        public String privateIpAddress;
    }


}
