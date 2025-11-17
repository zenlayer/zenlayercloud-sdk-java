package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class DdosTrafficControl extends TeaModel {


    /**
     * 是否开启 bps 限速
     */
    public Boolean bpsEnabled;

    /**
     * bps 限速值
     */
    public Long bps;

    /**
     * 是否开启 pps 限速
     */
    public Boolean ppsEnabled;

    /**
     * pps 限速值
     */
    public Long pps;

    /**
     * 是否开启 sync bps 限速
     */
    public Boolean synBPSEnabled;

    /**
     * syn bps 限速值
     */
    public Long synBPS;

    /**
     * 是否开启 sync pps 限速
     */
    public Boolean synPPSEnabled;

    /**
     * syn pps 限速值
     */
    public Long synPPS;

    public Boolean getBpsEnabled() {
        return this.bpsEnabled;
    }

    public void setBpsEnabled(Boolean bpsEnabled) {
        this.bpsEnabled = bpsEnabled;
    }

    public Long getBps() {
        return this.bps;
    }

    public void setBps(Long bps) {
        this.bps = bps;
    }

    public Boolean getPpsEnabled() {
        return this.ppsEnabled;
    }

    public void setPpsEnabled(Boolean ppsEnabled) {
        this.ppsEnabled = ppsEnabled;
    }

    public Long getPps() {
        return this.pps;
    }

    public void setPps(Long pps) {
        this.pps = pps;
    }

    public Boolean getSynBPSEnabled() {
        return this.synBPSEnabled;
    }

    public void setSynBPSEnabled(Boolean synBPSEnabled) {
        this.synBPSEnabled = synBPSEnabled;
    }

    public Long getSynBPS() {
        return this.synBPS;
    }

    public void setSynBPS(Long synBPS) {
        this.synBPS = synBPS;
    }

    public Boolean getSynPPSEnabled() {
        return this.synPPSEnabled;
    }

    public void setSynPPSEnabled(Boolean synPPSEnabled) {
        this.synPPSEnabled = synPPSEnabled;
    }

    public Long getSynPPS() {
        return this.synPPS;
    }

    public void setSynPPS(Long synPPS) {
        this.synPPS = synPPS;
    }

}