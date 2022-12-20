/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-02-22 09:43:34
 * @version $ Id: VpcRegionAvailableResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeVpcAvailableRegionsResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String                requestId;
    /**
     * VPC Region节点区域集合
     */
    public List<VpcRegionInfo>  vpcRegionSet;


    public static class VpcRegionInfo extends TeaModel {

        /**
         * VPC Region ID
         */
        public String vpcRegionId;

        /**
         * VPC Region 名称
         */
        public String vpcRegionName;

        /**
         * 可用区ID集合
         */
        public List<String> zoneIds;
    }
}
