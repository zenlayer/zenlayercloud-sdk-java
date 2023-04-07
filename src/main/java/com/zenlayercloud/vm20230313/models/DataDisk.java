/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-03-30 14:17:50
 * @version $ Id: DataDisk.java, v 0.1  alicat.xu Exp $
 */
public class DataDisk extends TeaModel {

    /**
     * 数据盘ID
     */
    public String diskId;

    /**
     * 数据盘大小
     */
    public Integer diskSize;

    public String diskName;

    public Boolean portable;
}
