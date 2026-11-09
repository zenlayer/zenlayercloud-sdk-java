package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DeleteNetworkInterfacePermissionRequest extends TeaModel {


    /**
     * 要删除的网卡授权ID。
     * 可通过调用 **DescribeNetworkInterfacePermissions** 获取。
     */
    public String permissionId;

    /**
     * 被授权账号已把网卡绑定到它的实例时，是否仍然删除授权。
     * 为 `false` 时拒绝删除；删除授权不会解绑网卡。
     */
    public Boolean force;

    public String getPermissionId() {
        return this.permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public Boolean getForce() {
        return this.force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

}