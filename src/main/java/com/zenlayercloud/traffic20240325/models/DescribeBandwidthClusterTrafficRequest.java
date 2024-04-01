package com.zenlayercloud.traffic20240325.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author Zif
 * @date 2024/3/25
 */
public class DescribeBandwidthClusterTrafficRequest extends TeaModel {

    /**
     * 带宽组ID。
     */
    @Validation(required = true)
    public String bandwidthClusterId;

    /**
     * 查询开始时间。
     * 按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    @Validation(required = true)
    public String startTime;

    /**
     * 查询结束时间。
     * 按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    @Validation(required = true)
    public String endTime;

}
