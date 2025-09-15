package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述CIDR掩码的信息。
 */
public class NetmaskInfo extends TeaModel {


    /**
     * 掩码大小
     */
    public Integer netmask;

    /**
     * CIDR的数量
     */
    public Integer amount;

    public Integer getNetmask() {
        return this.netmask;
    }

    public void setNetmask(Integer netmask) {
        this.netmask = netmask;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}