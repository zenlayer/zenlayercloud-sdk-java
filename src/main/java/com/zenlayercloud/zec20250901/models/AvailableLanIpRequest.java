package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class AvailableLanIpRequest extends TeaModel {


    /**
     * 待查询的弹性公网 IP 的 ID。
     * 接口将返回与该 EIP 同地域子网下的所有可绑定 vNIC 及内网 IP。
     * 可通过 DescribeEips 接口获取 EIP ID。
     */
    public String eipId;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

}