package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DetachDhcpOptionsSetFromSubnetRequest extends TeaModel {


    /**
     * 要与DHCP选项集取消关联的子网ID集合。
     * 可通过调用 ~~DescribeSubnets~~ 获取。
     */
    public List<String> subnetIds;

    public List<String> getSubnetIds() {
        return this.subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

}