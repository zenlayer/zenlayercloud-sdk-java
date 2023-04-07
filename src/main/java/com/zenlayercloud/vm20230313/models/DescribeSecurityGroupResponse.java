/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-16 17:50:51
 * @version $ Id: DescribeSecurityGroupResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeSecurityGroupResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId
     */
    public String                  requestId;
    public List<SecurityGroupInfo> dataSet;
    public Integer                 totalCount;

    public static class SecurityGroupInfo extends TeaModel {

        /**
         * 安全组ID
         */
        public String securityGroupId;

        /**
         * 安全组名称
         */
        public String securityGroupName;

        /**
         * 安全组状态
         */
        public String securityGroupStatus;

        /**
         * 创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
         */
        public String createTime;

        /**
         * 安全组描述
         */
        public String description;

        /**
         * 安全组下实例集合
         */
        public List<String> instanceIds;

        /**
         * 安全组下规则集合
         */
        public List<RuleInfoResponse> ruleInfos;

        /**
         * 是否默认
         */
        public Boolean isDefault;
    }
}
