package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 批量删除公网IPv6中单个失败项的详情。
 */
public class DeleteIpv6AddressesFailedItem extends TeaModel {


    /**
     * 删除失败的公网IPv6的ID。
     */
    public String ipv6Id;

    /**
     * 错误码。
     */
    public String errorCode;

    /**
     * 错误消息。
     */
    public String errorMsg;

    public String getIpv6Id() {
        return this.ipv6Id;
    }

    public void setIpv6Id(String ipv6Id) {
        this.ipv6Id = ipv6Id;
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