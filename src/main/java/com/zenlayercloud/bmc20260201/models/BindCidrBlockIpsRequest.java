package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class BindCidrBlockIpsRequest extends TeaModel {


    /**
     * 待绑定的IP参数列表。
     */
    public List<IpBindParam> ipBindList;

    /**
     * 待操作的Cidr Block ID。
     * 可通过DescribeCidrBlocks接口返回值中的cidrBlockId获取。
     */
    public String cidrBlockId;

    public List<IpBindParam> getIpBindList() {
        return this.ipBindList;
    }

    public void setIpBindList(List<IpBindParam> ipBindList) {
        this.ipBindList = ipBindList;
    }

    public String getCidrBlockId() {
        return this.cidrBlockId;
    }

    public void setCidrBlockId(String cidrBlockId) {
        this.cidrBlockId = cidrBlockId;
    }

}