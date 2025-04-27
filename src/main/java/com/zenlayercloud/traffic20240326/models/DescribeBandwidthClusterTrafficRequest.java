package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;


public class DescribeBandwidthClusterTrafficRequest extends TeaModel {


    /**
     * 共享带宽包ID
     */
    public String bandwidthClusterId;

    /**
     * 查询开始时间。
     * 按照ISO8601标准表示，并且使用UTC时间。
     * 格式为：YYYY-MM-DDThh:mm:ssZ
     */
    public String startTime;

    /**
     * 查询结束时间。
     * 按照ISO8601标准表示，并且使用UTC时间。
     * 格式为：YYYY-MM-DDThh:mm:ssZ
     */
    public String endTime;

    /**
     * 按城市进行过滤，如LAX。
     * 该值可以是城市英文名也可以是城市码。
     * 指定该值，将会只返回该城市的带宽流量数据。
     * 当前带宽组的城市码和城市名称可以在[DescribeBandwidthClusters](../bandwidth-cluster/describebandwidthclusters.md)中的cities字段中查看
     */
    public String city;

    public String getBandwidthClusterId() {
        return this.bandwidthClusterId;
    }

    public void setBandwidthClusterId(String bandwidthClusterId) {
        this.bandwidthClusterId = bandwidthClusterId;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}