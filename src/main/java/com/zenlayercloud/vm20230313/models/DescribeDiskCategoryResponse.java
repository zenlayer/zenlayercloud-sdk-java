/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-07-04 13:56:01
 * @version $ Id: DescribeDiskCategoryResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeDiskCategoryResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId
     */
    public String         requestId;

    public List<DiskCategory> categoryZoneSet;

    public static class DiskCategory extends TeaModel {

        /**
         * 可用区ID
         */
        public String zoneId;

        /**
         * 支持的云盘类别。
         */
        public List<String> categorySet;
    }
}
