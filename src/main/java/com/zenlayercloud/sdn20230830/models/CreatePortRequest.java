/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-08-30 13:54:53
 * @version $ Id: CreatePortRequest.java, v 0.1  alicat.xu Exp $
 */
public class CreatePortRequest extends TeaModel {

    /**
     * 数据中心四字码。
     */
    public String dcId;

    /**
     * 端口名称。
     * 最长不超过255个字符，建议使用数据中心四字码 + 端口规格拼接。
     */
    public String portName;

    /**
     * 端口备注信息。
     * 最长不超过255个字符。
     */
    public String portRemarks;

    /**
     * 端口规格。
     */
    public String portType;

    /**
     * 贵司商业实体名称。
     */
    public String businessEntityName;
}
