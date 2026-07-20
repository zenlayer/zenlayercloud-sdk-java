package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class ModifyPrivateConnectsAttributeRequest extends TeaModel {


    /**
     * 二层网络专线 ID 列表。
     * 数量不得超过 100。
     */
    public List<String> privateConnectIds;

    /**
     * 二层网络专线名称。
     * 长度不得超过 255。
     */
    public String privateConnectName;

    public List<String> getPrivateConnectIds() {
        return this.privateConnectIds;
    }

    public void setPrivateConnectIds(List<String> privateConnectIds) {
        this.privateConnectIds = privateConnectIds;
    }

    public String getPrivateConnectName() {
        return this.privateConnectName;
    }

    public void setPrivateConnectName(String privateConnectName) {
        this.privateConnectName = privateConnectName;
    }

}