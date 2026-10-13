package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DeleteSubnetRequest extends TeaModel {


    /**
     * 要删除的子网ID。
     * 可通过调用 ~~DescribeSubnets~~ 获取。
     */
    public String subnetId;

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

}