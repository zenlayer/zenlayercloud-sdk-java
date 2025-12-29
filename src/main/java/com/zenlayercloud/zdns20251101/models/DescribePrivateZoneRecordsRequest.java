package com.zenlayercloud.zdns20251101.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribePrivateZoneRecordsRequest extends TeaModel {


    /**
     * 内网权威域名ID
     */
    public String zoneId;

    /**
     * 根据解析记录ID进行筛选
     */
    public List<String> recordIds;

    /**
     * 根据主机记录进行筛选
     */
    public String recordName;

    /**
     * 根据解析记录类型进行筛选
     */
    public String type;

    /**
     * 根据解析线路过滤。
     * `default` 为默认，即全局。
     * 也可以指定某个节点ID，例如asia-east-1
     */
    public String line;

    /**
     * 根据解析记录状态进行筛选
     */
    public String status;

    /**
     * 根据记录值进行筛选
     */
    public String value;

    /**
     * 返回的分页大小，默认为20，最大为1000
     */
    public Integer pageSize;

    /**
     * 返回的分页数，默认为1
     */
    public Integer pageNum;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public List<String> getRecordIds() {
        return this.recordIds;
    }

    public void setRecordIds(List<String> recordIds) {
        this.recordIds = recordIds;
    }

    public String getRecordName() {
        return this.recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

}