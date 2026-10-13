package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DeleteDhcpOptionsSetRequest extends TeaModel {


    /**
     * DHCP选项集ID。
     * 可通过调用 ~~DescribeDhcpOptionsSets~~ 获取。
     */
    public String dhcpOptionsSetId;

    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    public void setDhcpOptionsSetId(String dhcpOptionsSetId) {
        this.dhcpOptionsSetId = dhcpOptionsSetId;
    }

}