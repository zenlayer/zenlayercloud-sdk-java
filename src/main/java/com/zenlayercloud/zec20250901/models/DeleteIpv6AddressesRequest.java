package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DeleteIpv6AddressesRequest extends TeaModel {


    /**
     * 要删除的公网 IPv6 的 ID 列表。
     */
    public List<String> ipv6Ids;

    public List<String> getIpv6Ids() {
        return this.ipv6Ids;
    }

    public void setIpv6Ids(List<String> ipv6Ids) {
        this.ipv6Ids = ipv6Ids;
    }

}