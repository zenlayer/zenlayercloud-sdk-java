package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeTencentVlanUsageRequest extends TeaModel {


    /**
     * 接入点的数据中心 ID。
     */
    public String dcId;

    /**
     * 云平台配对密钥。
     * 用于按密钥查询对应接入点的 VLAN 使用情况。
     */
    public String pairingKey;

    public String getDcId() {
        return this.dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
    }

    public String getPairingKey() {
        return this.pairingKey;
    }

    public void setPairingKey(String pairingKey) {
        this.pairingKey = pairingKey;
    }

}