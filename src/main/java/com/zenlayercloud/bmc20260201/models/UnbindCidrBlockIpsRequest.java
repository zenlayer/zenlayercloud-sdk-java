package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class UnbindCidrBlockIpsRequest extends TeaModel {


    /**
     * 待解绑的IP列表。
     */
    public List<String> ipList;

    /**
     * 待操作的Cidr Block ID。
     * 可通过DescribeCidrBlocks接口返回值中的cidrBlockId获取。
     */
    public String cidrBlockId;

    public List<String> getIpList() {
        return this.ipList;
    }

    public void setIpList(List<String> ipList) {
        this.ipList = ipList;
    }

    public String getCidrBlockId() {
        return this.cidrBlockId;
    }

    public void setCidrBlockId(String cidrBlockId) {
        this.cidrBlockId = cidrBlockId;
    }

}