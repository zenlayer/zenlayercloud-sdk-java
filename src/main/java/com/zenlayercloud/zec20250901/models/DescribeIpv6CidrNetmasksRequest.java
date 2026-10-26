package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeIpv6CidrNetmasksRequest extends TeaModel {


    /**
     * 查询IPv6 CIDR所在的节点ID。
     */
    public String regionId;

    /**
     * 后付费的承诺期设置。
     * 指定period时会校验该承诺期是否已开通（未开通返回错误），并按其计算价格，需与询价、下单时传入的值一致；不传或未指定period时按承诺期1个月计算。
     */
    public ChargePostpaid instanceChargePostpaid;

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ChargePostpaid getInstanceChargePostpaid() {
        return this.instanceChargePostpaid;
    }

    public void setInstanceChargePostpaid(ChargePostpaid instanceChargePostpaid) {
        this.instanceChargePostpaid = instanceChargePostpaid;
    }

}