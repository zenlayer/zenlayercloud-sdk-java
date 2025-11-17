package com.zenlayercloud.zos20251010.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询执行记录列表的请求信息。
 */
public class DescribeCommandInvocationsRequest extends TeaModel {


    /**
     * 根据命令ID进行筛选
     */
    public List<String> commandIds;

    /**
     * 根据执行记录ID筛选
     */
    public List<String> invocationIds;

    /**
     * 根据执行的实例ID筛选
     */
    public List<String> instanceIds;

    /**
     * 根据执行的总状态筛选
     */
    public List<String> invocationStatuses;

    /**
     * 返回的分页大小，默认为20，最大为10000
     */
    public Integer pageSize;

    /**
     * 返回的分页数，默认为1
     */
    public Integer pageNum;

    public List<String> getCommandIds() {
        return this.commandIds;
    }

    public void setCommandIds(List<String> commandIds) {
        this.commandIds = commandIds;
    }

    public List<String> getInvocationIds() {
        return this.invocationIds;
    }

    public void setInvocationIds(List<String> invocationIds) {
        this.invocationIds = invocationIds;
    }

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public List<String> getInvocationStatuses() {
        return this.invocationStatuses;
    }

    public void setInvocationStatuses(List<String> invocationStatuses) {
        this.invocationStatuses = invocationStatuses;
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