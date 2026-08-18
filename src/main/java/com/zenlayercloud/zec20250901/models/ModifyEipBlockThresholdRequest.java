package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class ModifyEipBlockThresholdRequest extends TeaModel {


    /**
     * 修改封堵阈值的EIP ID。
     * 网段（IP块）类型的EIP不支持修改封堵阈值。
     */
    public String eipId;

    /**
     * 是否启用自定义封堵阈值。
     * 传`false`时删除已有的自定义阈值，恢复为系统默认阈值，此时无需传递四项阈值。
     */
    public Boolean enable;

    /**
     * 带宽封堵阈值，单位Mbps。
     * 上限由配额`ZEC_EIP_Block_threshold_bps_cap`控制。
     * 启用自定义阈值时，四项阈值至少传一项；未传的项保持原值不变。
     */
    public Long bps;

    /**
     * 报文速率封堵阈值，单位kpps。
     * 上限由配额`ZEC_EIP_Block_threshold_pps_cap`控制。
     * 启用自定义阈值时，四项阈值至少传一项；未传的项保持原值不变。
     */
    public Long pps;

    /**
     * 入向连接速率封堵阈值，单位kcps。
     * 上限由配额`ZEC_EIP_Block_threshold_cps_in_cap`控制。
     * 启用自定义阈值时，四项阈值至少传一项；未传的项保持原值不变。
     */
    public Long inCps;

    /**
     * 出向连接速率封堵阈值，单位kcps。
     * 上限由配额`ZEC_EIP_Block_threshold_cps_out_cap`控制。
     * 启用自定义阈值时，四项阈值至少传一项；未传的项保持原值不变。
     */
    public Long outCps;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public Boolean getEnable() {
        return this.enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Long getBps() {
        return this.bps;
    }

    public void setBps(Long bps) {
        this.bps = bps;
    }

    public Long getPps() {
        return this.pps;
    }

    public void setPps(Long pps) {
        this.pps = pps;
    }

    public Long getInCps() {
        return this.inCps;
    }

    public void setInCps(Long inCps) {
        this.inCps = inCps;
    }

    public Long getOutCps() {
        return this.outCps;
    }

    public void setOutCps(Long outCps) {
        this.outCps = outCps;
    }

}