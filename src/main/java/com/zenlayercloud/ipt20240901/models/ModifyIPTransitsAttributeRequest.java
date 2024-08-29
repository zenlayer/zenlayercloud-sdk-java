/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author wolfgang
 * @date 2023-07-18 20:55:28
 * @version $ Id: ModifyPrivateConnectBandwidthRequest.java, v 0.1  wolfgang Exp $
 */
public class ModifyIPTransitsAttributeRequest extends TeaModel {
    /**
     * IP Transit ID 列表
     * 数量不得超过100。
     */
    public List<String> iptIds;
    /**
     * IP Transit名称。
     * 不得超过255个字符。
     * 名称和描述信息至少需要有一项指定。
     */
    public String       iptName;
    /**
     * IP Transit 描述信息。
     * 名称和描述信息至少需要有一项指定。
     */
    public String       iptDescription;
}
