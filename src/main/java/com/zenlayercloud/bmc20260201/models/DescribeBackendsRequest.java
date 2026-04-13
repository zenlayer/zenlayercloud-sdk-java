package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeBackendsRequest extends TeaModel {


    /**
     * 监听器的ID。
     */
    public String listenerId;

    /**
     * 后端配置服务器的ID集合。
     */
    public List<String> backendIds;

    /**
     * 后端配置服务器的名称。
     */
    public String backendName;

    /**
     * 返回的分页数。
     */
    public Integer pageNum;

    /**
     * 返回的分页大小。默认为20，最大为1000。
     */
    public Integer pageSize;

    public String getListenerId() {
        return this.listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public List<String> getBackendIds() {
        return this.backendIds;
    }

    public void setBackendIds(List<String> backendIds) {
        this.backendIds = backendIds;
    }

    public String getBackendName() {
        return this.backendName;
    }

    public void setBackendName(String backendName) {
        this.backendName = backendName;
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}