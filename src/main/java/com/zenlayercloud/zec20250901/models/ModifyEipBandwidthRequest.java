package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyEipBandwidthRequest extends TeaModel {


    /**
     * EIP唯一标识ID。
     */
    public String eipId;

    /**
     * 调整带宽限速的目标值。
     * 单位Mbps。
     */
    public Integer bandwidth;

    /**
     * 已废弃，该参数不再生效，传值将被忽略。
     * 已配置突发带宽的 EIP 保持原值不变；若本次 `bandwidth` 超过原突发带宽，突发带宽将自动上调至与 `bandwidth` 一致。
     */
    @Deprecated
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

    @Deprecated
    public Integer getCommitBandwidth() {
        return this.commitBandwidth;
    }

    @Deprecated
    public void setCommitBandwidth(Integer commitBandwidth) {
        this.commitBandwidth = commitBandwidth;
    }

}