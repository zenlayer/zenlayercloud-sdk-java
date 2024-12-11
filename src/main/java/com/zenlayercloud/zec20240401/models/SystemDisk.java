/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-03-30 14:17:38
 * @version $ Id: SystemDisk.java, v 0.1  alicat.xu Exp $
 */
public class SystemDisk extends TeaModel {

    /**
     * 系统盘ID
     */
    public String diskId;

    /**
     * 系统盘大小
     */
    public Integer diskSize;

    /**
     * 云硬盘种类
     */
    public String diskCategory;
}
