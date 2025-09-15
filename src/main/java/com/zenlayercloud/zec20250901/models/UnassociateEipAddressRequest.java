package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 将弹性公网IP（EIP）从绑定的云产品上解绑的请求参数。
 */
public class UnassociateEipAddressRequest extends TeaModel {


    /**
     * 要解绑的弹性公网IP的ID列表
     */
    public List<String> eipIds;

    public List<String> getEipIds() {
        return this.eipIds;
    }

    public void setEipIds(List<String> eipIds) {
        this.eipIds = eipIds;
    }

}