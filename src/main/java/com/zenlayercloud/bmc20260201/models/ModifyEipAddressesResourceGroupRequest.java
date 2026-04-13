package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifyEipAddressesResourceGroupRequest extends TeaModel {


    /**
     * 弹性IP ID列表。
     * 每次请求允许操作的IP数量上限是100。
     */
    public List<String> eipIds;

    /**
     * 资源组ID。
     */
    public String resourceGroupId;

    public List<String> getEipIds() {
        return this.eipIds;
    }

    public void setEipIds(List<String> eipIds) {
        this.eipIds = eipIds;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

}