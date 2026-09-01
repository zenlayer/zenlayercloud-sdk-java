package com.zenlayercloud.zsp20260801.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeTicketsRequest extends TeaModel {


    /**
     * 工单编号，支持模糊查询。
     */
    public String ticketNumber;

    /**
     * 工单类型。
     */
    public String type;

    /**
     * 问题描述，支持模糊查询。
     */
    public String description;

    /**
     * 工单状态列表。
     * 不填时返回所有状态的工单。
     */
    public List<String> statuses;

    /**
     * 创建时间的查询起点。
     * 时间格式：yyyy-MM-ddTHH:mm:ssZ。
     */
    public String startTime;

    /**
     * 创建时间的查询终点。
     * 时间格式：yyyy-MM-ddTHH:mm:ssZ。
     */
    public String endTime;

    /**
     * 返回结果是否按创建时间倒序排列。
     */
    public Boolean createTimeDesc;

    /**
     * 分页大小。
     * 当未传递时，默认值为10。
     */
    public Integer pageSize;

    /**
     * 分页页码。
     * 当未传递时，默认值为1。
     */
    public Integer pageNum;

    public String getTicketNumber() {
        return this.ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getStatuses() {
        return this.statuses;
    }

    public void setStatuses(List<String> statuses) {
        this.statuses = statuses;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Boolean getCreateTimeDesc() {
        return this.createTimeDesc;
    }

    public void setCreateTimeDesc(Boolean createTimeDesc) {
        this.createTimeDesc = createTimeDesc;
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