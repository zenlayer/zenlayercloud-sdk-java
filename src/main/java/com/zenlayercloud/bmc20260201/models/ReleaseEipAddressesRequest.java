package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ReleaseEipAddressesRequest extends TeaModel {


    /**
     * 一个或多个待操作的EIP ID。
     * 可通过DescribeEipAddresses接口返回值中的eipId获取。
     */
    public List<String> eipIds;

    public List<String> getEipIds() {
        return this.eipIds;
    }

    public void setEipIds(List<String> eipIds) {
        this.eipIds = eipIds;
    }

}