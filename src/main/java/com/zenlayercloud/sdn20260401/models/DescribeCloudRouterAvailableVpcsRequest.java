package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeCloudRouterAvailableVpcsRequest extends TeaModel {


    /**
     * VPC ID。
     */
    public String vpcId;

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

    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
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