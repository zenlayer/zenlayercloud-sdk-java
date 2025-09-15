package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 查询可供弹性公网IP绑定的网卡及内网IP信息的请求参数。
 */
public class AvailableLanIpRequest extends TeaModel {


    /**
     * 要查询的公网弹性IP ID
     */
    public String eipId;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

}