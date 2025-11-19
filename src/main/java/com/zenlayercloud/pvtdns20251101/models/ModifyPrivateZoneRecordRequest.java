package com.zenlayercloud.pvtdns20251101.models;

import com.aliyun.tea.TeaModel;


public class ModifyPrivateZoneRecordRequest extends TeaModel {


    /**
     * 内网权威域名ID
     */
    public String zoneId;

    /**
     * 要修改的内网权威域名解析记录ID
     */
    public String recordId;

    /**
     * 解析记录值
     */
    public String value;

    /**
     * 解析记录权重
     */
    public Integer weight;

    /**
     * 域名本地缓存时间。
     * 单位秒，默认值60，可选值5-86400(一天)
     */
    public Integer ttl;

    /**
     * MX记录的优先级。
     * 取值越小，优先级越高, 默认为1
     */
    public Integer priority;

    /**
     * 备注信息。
     * 最长不超过255个字符
     */
    public String remark;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getRecordId() {
        return this.recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getTtl() {
        return this.ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}