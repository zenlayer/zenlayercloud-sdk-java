package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 替换的公网IP信息。
 */
public class ReplaceIp extends TeaModel {


    /**
     * 需要替换的弹性公网IP ID
     */
    public String eipId;

    /**
     * 原IP。
     * 当IP是三线IP(IP线路类型为`ThreeLine`)时需要指定
     */
    public String ownIp;

    /**
     * 需要变更的目标IP。
     * 如果未指定，将由系统随机分配
     */
    public String targetIp;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public String getOwnIp() {
        return this.ownIp;
    }

    public void setOwnIp(String ownIp) {
        this.ownIp = ownIp;
    }

    public String getTargetIp() {
        return this.targetIp;
    }

    public void setTargetIp(String targetIp) {
        this.targetIp = targetIp;
    }

}