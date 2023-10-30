/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

public class PortInfo extends TeaModel {

    /**
     * 端口 的Id。
     */
    public String portId;

    /**
     * 端口 的名称。
     */
    public String portName;

    /**
     * 端口 的备注。
     */
    public String portRemarks;

    /**
     * 端口 规格。
     */
    public String portType;

    /**
     * 端口 连通性的状态。
     */
    public String connectionStatus;

    /**
     * 端口 业务状态。
     */
    public String portStatus;

    /**
     * 数据中心 的Id。
     */
    public String dcId;

    /**
     * 数据中心 的名称。
     */
    public String dcName;

    /**
     * 城市 的名称。
     */
    public String cityName;

    /**
     * 区域 的名称。
     */
    public String areaName;

    /**
     * LOA 的状态。
     */
    public String loaStatus;

    /**
     * LOA 的下载地址。
     */
    public String loaDownloadUrl;

    /**
     * 创建时间。
     */
    public String createdTime;

    /**
     * 到期时间。
     */
    public String expiredTime;

    /**
     * 端口计费类型。
     */
    public String portChargeType;

    /**
     * 购买端口的时长。
     */
    public Integer period;

    /**
     * 商业实体名称
     */
    public String businessEntityName;

    /**
     * 是否允许创建业务
     */
    public Boolean isCreateBusinessAllowed;
}