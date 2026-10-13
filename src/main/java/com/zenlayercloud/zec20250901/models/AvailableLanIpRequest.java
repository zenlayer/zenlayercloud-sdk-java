package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class AvailableLanIpRequest extends TeaModel {


    /**
     * 待查询的弹性公网IP的ID。
     * 接口将返回与该EIP同地域子网下的所有可绑定vNIC及内网IP。
     * 可通过 ~~DescribeEips~~ 接口获取EIP ID。
     */
    public String eipId;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

}