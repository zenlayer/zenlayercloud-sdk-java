package com.zenlayercloud.zdns20251101.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述内网权威域名解析记录的信息。
 */
public class PrivateZoneRecord extends TeaModel {


    /**
     * 解析记录ID
     */
    public String recordId;

    /**
     * 内网权威域名ID
     */
    public String zoneId;

    /**
     * 解析记录类型
     */
    public String type;

    /**
     * 主机记录
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
     * 单位秒
     */
    public Integer ttl;

    /**
     * 解析请求来源。
     * `default` 为默认，即全局。
     * 也可以指定某个节点ID，例如asia-east-1
     */
    public String line;

    /**
     * 解析请求来源详细信息。
     * 仅当line为节点时存在
     */
    public LineInfo lineInfo;

    /**
     * `MX`记录的优先级。
     * 取值越小，优先级越高
     */
    public Integer priority;

    /**
     * 备注信息
     */
    public String remark;

    /**
     * 解析记录状态
     */
    public String status;

    /**
     * 解析记录的创建时间
     */
    public String createTime;

    public String getRecordId() {
        return this.recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

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

    public String getLine() {
        return this.line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public LineInfo getLineInfo() {
        return this.lineInfo;
    }

    public void setLineInfo(LineInfo lineInfo) {
        this.lineInfo = lineInfo;
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

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}