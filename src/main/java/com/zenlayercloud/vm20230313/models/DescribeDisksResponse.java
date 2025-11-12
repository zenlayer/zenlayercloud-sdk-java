/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-23 14:49:43
 * @version $ Id: DescribeDisksResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeDisksResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId
     */
    public String         requestId;
    public List<DiskInfo> dataSet;
    public Integer        totalCount;

    public static class DiskInfo extends TeaModel {

        /**
         * DISK ID
         */
        public String diskId;

        /**
         * DISK名称
         */
        public String diskName;

        /**
         * DISK所属可用区
         */
        public String zoneId;

        /**
         * DISK类型
         */
        public String diskType;

        /**
         * 是否可插拔
         */
        public Boolean portable;

        /**
         * DISK种类
         */
        public String diskCategory;

        /**
         * DISK大小
         */
        public Integer diskSize;

        /**
         * DISK状态
         */
        public String diskStatus;

        /**
         * 实例ID
         */
        public String instanceId;

        /**
         * 实例名称
         */
        public String instanceName;

        /**
         *  PREPAID：预付费，即包年包月
         *  POSTPAID：后付费
         */
        public String chargeType;

        /**
         * 创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
         */
        public String createTime;

        /**
         * 到期时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-ddThh:mm:ssZ。注意：后付费模式本项为null
         */
        public String expiredTime;

        /**
         * 购买DISK的时长，单位：月
         * 后付费DISK该字段为null
         */
        public Integer period;

        /**
         * 是否自动续费。
         * 对于预付费实例，取消订阅后，该字段值将返回 false
         */
        public Boolean autoRenew;


        /**
         * 该DISK关联的标签
         */
        public Tags tags;
    }
}
