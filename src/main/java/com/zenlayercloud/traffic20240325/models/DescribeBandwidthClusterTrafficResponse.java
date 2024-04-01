package com.zenlayercloud.traffic20240325.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author Zif
 * @date 2024/3/25
 */
public class DescribeBandwidthClusterTrafficResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回
     * 定位问题时需要提供该次请求的requestId
     */
    public String requestId;

    public List<BandwidthClusterTrafficData> dataList;

    public Long in95;

    public String in95Time;

    public Long inAvg;

    public Long inMax;

    public Long inMin;

    public Long inTotal;

    public Double maxBandwidth95ValueMbps;

    public Long out95;

    public String out95Time;

    public Long outAvg;

    public Long outMax;

    public Long outMin;

    public Long outTotal;

    public String totalUnit;

    public String unit;

    public static class BandwidthClusterTrafficData extends TeaModel {

        public Long internetRX;

        public Long internetTX;

        public String time;
    }

}
