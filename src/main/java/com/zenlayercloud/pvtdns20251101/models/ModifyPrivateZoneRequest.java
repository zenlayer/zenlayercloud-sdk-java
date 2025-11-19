package com.zenlayercloud.pvtdns20251101.models;

import com.aliyun.tea.TeaModel;


public class ModifyPrivateZoneRequest extends TeaModel {


    /**
     * 要修改的内网权威域名ID
     */
    public String zoneId;

    /**
     * 备注信息。
     * 最长不超过255个字符
     */
    public String remark;

    /**
     * 是否开启子域名递归代理
     */
    public String proxyPattern;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getProxyPattern() {
        return this.proxyPattern;
    }

    public void setProxyPattern(String proxyPattern) {
        this.proxyPattern = proxyPattern;
    }

}