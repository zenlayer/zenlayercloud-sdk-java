/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-08-30 10:42:45
 * @version $ Id: DescribePortUsableVlanRequest.java, v 0.1  alicat.xu Exp $
 */
public class DatacenterInfo extends TeaModel {

    /**
     * 数据中心四字码
     */
    public String dcId;

    /**
     * 数据中心名称。
     */
    public String dcName;

    /**
     * 数据中心地址。
     */
    public String dcAddress;

    /**
     * 城市名称
     */
    public String cityName;

    /**
     * 国家名称。
     */
    public String countryName;

    /**
     * 地区名称。
     */
    public String areaName;

    /**
     * 数据中心所在地理位置纬度。
     */
    public Double latitude;

    /**
     * 数据中心所在地理位置经度。
     */
    public Double longitude;

    /**
     * 数据中心是否支持物理端口。
     * 该字段仅在 DescribeDatacenters 可取值。
     */
    public Boolean isPortAvailable;

    /**
     * 数据中心最大可用的带宽。单位：Mbps。
     * 该字段仅在 DescribeVirtualEdgeDatacenters 可取值。
     */
    public Integer availableBandwidth;

}