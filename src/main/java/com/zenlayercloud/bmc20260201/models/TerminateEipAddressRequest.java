package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


public class TerminateEipAddressRequest extends TeaModel {


    /**
     * 一个EIP ID。
     * 可通过DescribeEipAddresses接口返回值中的eipId获取。
     */
    public String eipId;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

}