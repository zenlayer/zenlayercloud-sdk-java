package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 网卡授权信息。
 */
public class NetworkInterfacePermission extends TeaModel {


    /**
     * 网卡授权ID。
     */
    public String permissionId;

    /**
     * 网卡ID。
     */
    public String nicId;

    /**
     * 被授权账号的cid。
     */
    public String granteeCid;

    /**
     * 授权的操作。
     */
    public String permission;

    /**
     * 授权的创建时间。
     */
    public String createTime;

    public String getPermissionId() {
        return this.permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getNicId() {
        return this.nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public String getGranteeCid() {
        return this.granteeCid;
    }

    public void setGranteeCid(String granteeCid) {
        this.granteeCid = granteeCid;
    }

    public String getPermission() {
        return this.permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}