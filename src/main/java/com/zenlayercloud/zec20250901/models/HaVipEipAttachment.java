package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * HaVip关联EIP信息。
 */
public class HaVipEipAttachment extends TeaModel {


    /**
     * 弹性公网IP的ID。
     */
    public String eipId;

    /**
     * 弹性公网IP地址。
     */
    public String eipAddress;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public String getEipAddress() {
        return this.eipAddress;
    }

    public void setEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
    }

}