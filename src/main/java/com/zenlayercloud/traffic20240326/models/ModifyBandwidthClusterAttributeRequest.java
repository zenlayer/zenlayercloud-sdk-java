package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;


/**
 * 修改共享带宽包属性的请求信息。
 */
public class ModifyBandwidthClusterAttributeRequest extends TeaModel {


    /**
     * 共享带宽包ID
     */
    public String bandwidthClusterId;

    /**
     * 要许改的共享带宽包显示名称。
     * 最长不超过255个字符
     */
    public String name;

    public String getBandwidthClusterId() {
        return this.bandwidthClusterId;
    }

    public void setBandwidthClusterId(String bandwidthClusterId) {
        this.bandwidthClusterId = bandwidthClusterId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}