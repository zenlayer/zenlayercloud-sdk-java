package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeBorderGatewaysRequest extends TeaModel {


    /**
     * 根据边界网关ID列表过滤
     */
    public List<String> zbgIds;

    /**
     * 根据网关名称过滤。
     * 支持模糊搜索
     */
    public String name;

    /**
     * 根据边界网关所在的节点过滤
     */
    public String regionId;

    /**
     * 根据边界网关所属的VPC ID过滤
     */
    public String vpcId;

    /**
     * 返回的分页大小
     */
    public Integer pageSize;

    /**
     * 返回的分页数
     */
    public Integer pageNum;

    public List<String> getZbgIds() {
        return this.zbgIds;
    }

    public void setZbgIds(List<String> zbgIds) {
        this.zbgIds = zbgIds;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

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