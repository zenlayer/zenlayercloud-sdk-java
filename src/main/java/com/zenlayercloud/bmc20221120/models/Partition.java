/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author Zif
 * @date 2022/12/20
 */
public class Partition extends TeaModel {

    /**
     * 分区配置
     * 默认不进行分区。分区的大小容量和指定的规格磁盘大小以及
     */
    @Validation(required = true)
    public String fsPath;

    /**
     * 分区的文件类型
     */
    @Validation(required = true)
    public String fsType;

    /**
     * 分区的大小，单位是GB
     */
    @Validation(required = true, minimum = 1)
    public Integer size;

}
