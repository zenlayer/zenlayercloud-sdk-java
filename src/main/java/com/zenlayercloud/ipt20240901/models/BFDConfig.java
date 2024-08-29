/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2024 All Rights Reserved.
 */
package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

/**
 * @author wolfgang.zhu
 * @date 2024-08-08 14:15:09
 * @version $ Id: BFDConfig.java, v 0.1  wolfgang.zhu Exp $
 */
public class BFDConfig extends TeaModel {
    /**
     * 发送间隔。
     * 单位：ms
     * 取值范围：100～60000
     */
    public Integer bfdTxInterval;
    /**
     * 接收间隔。
     * 单位：ms
     * 取值范围：100～60000
     */
    public Integer bfdRxInterval;
    /**
     * 本地检测倍数。
     * 取值范围：3～20
     */
    public Integer bfdMultiplier;
}
