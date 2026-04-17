package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class CreateByoipResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 创建成功的 BYOIP ID。
     */
    public String byoipId;

    /**
     * 创建成功的 CIDR ID。
     */
    public String cidrBlockId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getByoipId() {
        return this.byoipId;
    }

    public void setByoipId(String byoipId) {
        this.byoipId = byoipId;
    }

    public String getCidrBlockId() {
        return this.cidrBlockId;
    }

    public void setCidrBlockId(String cidrBlockId) {
        this.cidrBlockId = cidrBlockId;
    }

}