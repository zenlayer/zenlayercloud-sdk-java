package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribePrivateConnectAvailablePortsRequest extends TeaModel {


    /**
     * 数据中心端口 ID 列表。
     * 用于按数据中心端口过滤。
     */
    public List<String> portIds;

    /**
     * 数据中心 ID。
     * 用于按数据中心过滤。
     */
    public String dcId;

    /**
     * 返回的分页大小。
     * 默认为 20，最大为 100。
     */
    public Integer pageSize;

    /**
     * 返回的分页页码。
     * 默认为 1。
     */
    public Integer pageNum;

    public List<String> getPortIds() {
        return this.portIds;
    }

    public void setPortIds(List<String> portIds) {
        this.portIds = portIds;
    }

    public String getDcId() {
        return this.dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
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