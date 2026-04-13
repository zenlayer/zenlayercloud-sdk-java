package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeListenersRequest extends TeaModel {


    /**
     * 监听器ID列表。
     * 最多支持100个。
     */
    public List<String> listenerIds;

    /**
     * 负载均衡实例ID列表。
     * 最多支持100个。
     */
    public List<String> loadBalancerIds;

    /**
     * 监听器名称。
     * 支持模糊搜索。
     */
    public String listenerName;

    /**
     * 返回的分页数。
     */
    public Integer pageNum;

    /**
     * 返回的分页大小。
     * 默认为20，最大为1000。
     */
    public Integer pageSize;

    public List<String> getListenerIds() {
        return this.listenerIds;
    }

    public void setListenerIds(List<String> listenerIds) {
        this.listenerIds = listenerIds;
    }

    public List<String> getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    public void setLoadBalancerIds(List<String> loadBalancerIds) {
        this.loadBalancerIds = loadBalancerIds;
    }

    public String getListenerName() {
        return this.listenerName;
    }

    public void setListenerName(String listenerName) {
        this.listenerName = listenerName;
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