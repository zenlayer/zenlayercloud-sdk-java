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

    @Validation(required = true)
    public List<AssociateSubnetInstance> subnetInstanceList;

    public static class AssociateSubnetInstance {
        /**
         * Instance ID
         */
        @Validation(required = true)
        public String instanceId;

        public String privateIpAddress;
    }


}
