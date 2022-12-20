/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.Date;
import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-02-21 23:39:22
 * @version $ Id: DescribeVpcsResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeVpcsResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 符合条件的数据总数。
     */
    public Integer totalCount;

    /**
     * 结果集。
     */
    public List<VpcInfo> dataSet;

    public static class VpcInfo extends TeaModel {
        /**
         * VPC唯一ID。
         */
        public String vpcId;

        /**
         * VPC Region ID。
         */
        public String vpcRegionId;

        /**
         * VPC Region 名称。
         */
        public String vpcRegionName;

        /**
         * VPC 名称。
         */
        public String vpcName;

        /**
         * CidrBlock。
         */
        public String cidrBlock;

        /**
         * 创建时间。
         * 格式为：YYYY-MM-DDThh:mm:ssZ。
         */
        public String createTime;

        /**
         * 状态
         */
        public String vpcStatus;


        /**
         * 所属资源组的ID。
         */
        public String resourceGroupId;

        /**
         * 所属资源组的名称。
         */
        public String resourceGroupName;
    }
}
