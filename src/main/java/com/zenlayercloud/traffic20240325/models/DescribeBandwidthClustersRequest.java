package com.zenlayercloud.traffic20240325.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

/**
 * @author Zif
 * @date 2024/3/25
 */
public class DescribeBandwidthClustersRequest extends TeaModel {

    /**
     * 带宽组ID。取值可以由多个带宽组ID组成一个。最多支持100个ID查询
     */
    @Validation(maxLength = 100)
    public List<String> bandwidthClusterIds;

    /**
     * 带宽组显示名称。支持模糊匹配。
     */
    public String bandwidthClusterName;

    /**
     * 带宽组所包含的城市名称。
     */
    public String cityName;

    /**
     * 返回的分页数。
     * 默认为1。
     */
    public Integer pageNum;

    /**
     * 返回的分页大小。
     * 默认为20，最大为1000。
     */
    public Integer pageSize;

}
