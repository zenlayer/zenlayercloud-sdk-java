/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;


import com.aliyun.tea.TeaModel;

import java.util.Date;
import java.util.List;

/**
 * @author ezreal
 * @version $ Id: DescribeSubnetsResponse.java, v 0.1  ezreal Exp $
 * @date 2023-03-14 21:27:14
 */

public class DescribeSubnetsResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;
    public List<SubnetInfo> dataSet;
    public Integer totalCount;

    public static class SubnetInfo extends TeaModel {
        public String subnetId;
        public String zoneId;
        public String subnetName;
        public String subnetStatus;
        public String cidrBlock;
        public Integer usageIpCount;
        public Integer totalIpCount;
        public String createTime;
        public List<String> instanceIdList;
    }
}
