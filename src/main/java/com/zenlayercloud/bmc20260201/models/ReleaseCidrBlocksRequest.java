package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ReleaseCidrBlocksRequest extends TeaModel {


    /**
     * 一个或多个待操作的Cidr Block ID。
     * 可通过DescribeCidrBlocks接口返回值中的cidrBlockId获取。
     * 每次请求批量实例的上限为100。
     */
    public List<String> cidrBlockIds;

    public List<String> getCidrBlockIds() {
        return this.cidrBlockIds;
    }

    public void setCidrBlockIds(List<String> cidrBlockIds) {
        this.cidrBlockIds = cidrBlockIds;
    }

}