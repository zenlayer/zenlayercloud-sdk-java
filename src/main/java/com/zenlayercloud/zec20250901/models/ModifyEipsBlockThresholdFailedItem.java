package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 批量修改弹性公网IP封堵阈值中单个失败项的详情。
 */
public class ModifyEipsBlockThresholdFailedItem extends TeaModel {


    /**
     * 修改失败的EIP ID。
     */
    public String eipId;

    /**
     * 错误码。
     */
    public String errorCode;

    /**
     * 错误消息。
     */
    public String errorMsg;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
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