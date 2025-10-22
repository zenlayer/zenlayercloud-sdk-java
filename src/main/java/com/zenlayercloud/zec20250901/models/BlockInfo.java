package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * ip封堵信息详情
 */
public class BlockInfo extends TeaModel {


    /**
     * ip
     */
    public String ip;

    /**
     * 单位bps
     */
    public Long bps;

    /**
     * 单位pps
     */
    public Long pps;

    /**
     * 单位个
     */
    public Long inCps;

    /**
     * 单位个
     */
    public Long outCps;

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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