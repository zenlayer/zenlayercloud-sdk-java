package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class RenewCidrBlockRequest extends TeaModel {


    /**
     * 待操作的Cidr Block ID。
     * 可通过DescribeCidrBlocks接口返回值中的cidrBlockId获取。
     */
    public String cidrBlockId;

    public String getCidrBlockId() {
        return this.cidrBlockId;
    }

    public void setCidrBlockId(String cidrBlockId) {
        this.cidrBlockId = cidrBlockId;
    }

}