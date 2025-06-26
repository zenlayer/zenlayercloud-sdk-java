package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;


/**
 * 修改带宽限速请求。
 */
public class ModifyEipBandwidthRequest extends TeaModel {


    /**
     * EIP唯一标识ID
     */
    public String eipId;

    /**
     * 调整带宽限速的目标值。
     * 单位Mbps
     */
    public Integer bandwidth;

    /**
     * 保底带宽。
     * 单位Mbps。
     * 有且仅当为95计费时, 需要指定
     */
    public Integer commitBandwidth;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Integer getCommitBandwidth() {
        return this.commitBandwidth;
    }

    public void setCommitBandwidth(Integer commitBandwidth) {
        this.commitBandwidth = commitBandwidth;
    }

}