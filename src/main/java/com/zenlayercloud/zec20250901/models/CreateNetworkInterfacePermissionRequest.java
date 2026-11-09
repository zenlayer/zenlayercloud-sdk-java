package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class CreateNetworkInterfacePermissionRequest extends TeaModel {


    /**
     * 要授权的网卡ID。
     * 可通过调用 **DescribeNetworkInterfaces** 获取。
     * 不支持主网卡，网卡状态须为 `AVAILABLE`。
     */
    public String nicId;

    /**
     * 被授权账号的cid，不能是网卡所属账号。
     * 一张网卡只能授权给一个账号；对同一账号重复授权同一操作时，返回已有的授权。
     */
    public String granteeCid;

    /**
     * 授权的操作。
     */
    public String permission;

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

}