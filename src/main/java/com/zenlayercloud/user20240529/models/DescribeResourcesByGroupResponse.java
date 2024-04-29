/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.user20240529.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-08-04 13:56:36
 * @version $ Id: DescribeLogsResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeResourcesByGroupResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;
    public Integer pageNum;
    public Integer pageSize;
    public Integer total;
    public List<ResourceInfo> list;

    public static class ResourceInfo extends TeaModel {
        public String resourceId;
        public String name;
        public String aliasName;
        public String resourceType;
        public String createTime;
        public String updateTime;
    }
}
