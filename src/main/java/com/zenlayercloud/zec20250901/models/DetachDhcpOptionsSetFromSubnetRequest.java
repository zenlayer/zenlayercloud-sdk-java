package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DetachDhcpOptionsSetFromSubnetRequest extends TeaModel {


    /**
     * 要与 DHCP 选项集取消关联的 Subnet 的 ID集合。
     */
    public List<String> subnetIds;

    public List<String> getSubnetIds() {
        return this.subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

}