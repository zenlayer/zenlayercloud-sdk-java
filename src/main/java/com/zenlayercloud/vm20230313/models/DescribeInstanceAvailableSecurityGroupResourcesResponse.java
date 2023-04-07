/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-17 10:49:08
 * @version $ Id: DescribeInstanceAvailableSecurityGroupResourcesResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeInstanceAvailableSecurityGroupResourcesResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId
     */
    public String requestId;

    public List<InstanceAvailableSecurityGroup> instanceAvailableSecurityGroups;

    public static class InstanceAvailableSecurityGroup extends TeaModel {

        /**
         * 安全组ID。
         */
        public String securityGroupId;

        /**
         * 安全组名称。
         */
        public String securityGroupName;

        /**
         * 是否默认
         */
        public Boolean isDefault;
    }
}
