package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 批量删除子网中单个失败项的详情。
 */
public class DeleteSubnetsFailedItem extends TeaModel {


    /**
     * 删除失败的子网ID。
     */
    public String subnetId;

    /**
     * 错误码。
     */
    public String errorCode;

    /**
     * 错误消息。
     */
    public String errorMsg;

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

}