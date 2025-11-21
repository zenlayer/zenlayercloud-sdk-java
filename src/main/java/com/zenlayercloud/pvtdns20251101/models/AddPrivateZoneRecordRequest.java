package com.zenlayercloud.pvtdns20251101.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class AddPrivateZoneRecordRequest extends TeaModel {


    /**
     * 内网权威域名ID
     */
    public String zoneId;

    /**
     * 解析记录类型
     */
    public String type;

    /**
     * 主机记录。
     * 主机记录就是域名前缀，常见用法有www、@、*（泛解析）、mail（常用于邮箱）。
     * 例如要解析@.example.com，主机记录要填写"@”，而不是空
     */
    public String recordName;

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

    /**
     * 解析线路。
     * `default` 为默认线路，即全局线路。
     * 也可以指定某个节点ID，例如asia-east-1
     */
    public String line;

    /**
     * 解析记录的状态
     */
    public String status;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRecordName() {
        return this.recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
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

    public String getLine() {
        return this.line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}