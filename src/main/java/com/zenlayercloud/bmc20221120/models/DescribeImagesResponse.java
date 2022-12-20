/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author Zif
 * @date 2023/1/9
 */
public class DescribeImagesResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 镜像列表。
     */
    public List<ImageInfo> images;

    public static class ImageInfo extends TeaModel {

        /**
         * 镜像ID
         */
        public String imageId;

        /**
         * 镜像名称
         */
        public String imageName;

        /**
         * 镜像所属分类。可能值：
         * <li>centos</li>
         * <li>windows</li>
         * <li>ubuntu</li>
         * <li>debian</li>
         * <li>esxi</li>
         */
        public String catalog;

        /**
         * 镜像类型。
         * PUBLIC_IMAGE: 公共镜像
         * CUSTOM_IMAGE：自定义镜像
         * 目前不支持自主的创建自定义镜像，可联系support沟通
         */
        public String imageType;

        /**
         * 操作系统类型。可能值：
         * windows
         * linux
         */
        public String osType;

    }
}
