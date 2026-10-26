package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * IPv6 CIDR某个掩码档位的可售信息。
 */
public class Ipv6CidrNetmaskInfo extends TeaModel {


    /**
     * 掩码大小。
     */
    public Integer netmask;

    /**
     * 该掩码下各条线路的库存与单价，按线路枚举顺序排列。
     * 库存为0或未配置售卖价格的线路不会返回。
     */
    public List<Ipv6CidrLineTypeInfo> networkLineTypes;

    public Integer getNetmask() {
        return this.netmask;
    }

    public void setNetmask(Integer netmask) {
        this.netmask = netmask;
    }

    public List<Ipv6CidrLineTypeInfo> getNetworkLineTypes() {
        return this.networkLineTypes;
    }

    public void setNetworkLineTypes(List<Ipv6CidrLineTypeInfo> networkLineTypes) {
        this.networkLineTypes = networkLineTypes;
    }

}