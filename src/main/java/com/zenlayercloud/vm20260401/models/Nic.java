package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 网络接口卡配置，包括公网和内网网卡名称设置。
 */
public class Nic extends TeaModel {


    /**
     * 公网网卡名称。
     */
    public String wanName;

    /**
     * 内网网卡名称。
     */
    public String lanName;

    public String getWanName() {
        return this.wanName;
    }

    public void setWanName(String wanName) {
        this.wanName = wanName;
    }

    public String getLanName() {
        return this.lanName;
    }

    public void setLanName(String lanName) {
        this.lanName = lanName;
    }

}