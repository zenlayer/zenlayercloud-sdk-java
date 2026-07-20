package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribePortsRequest extends TeaModel {


    /**
     * 每页数量。
     * 取值范围 1-1000。
     */
    public Integer pageSize;

    /**
     * 页码。
     * 从 1 开始。
     */
    public Integer pageNum;

    /**
     * 数据中心端口 ID 列表。
     * 最大支持长度为 100。
     */
    public List<String> portIds;

    /**
     * 数据中心端口名称。
     * 最长不超过 255 个字符，支持模糊匹配、忽略大小写。
     */
    public String portName;

    /**
     * 数据中心ID。
     * 可通过 ~~DescribeDataCenters~~ 接口获取。
     */
    public String dcId;

    /**
     * 城市名称。
     * 最长不超过 64 个字符，支持模糊匹配、忽略大小写。
     */
    public String cityName;

    /**
     * 资源组 ID。
     * 不传则返回该用户可见的所有资源组内的数据中心端口。
     */
    public String resourceGroupId;

    /**
     * 根据标签键进行搜索。
     * 最长不得超过20个标签键。
     */
    public List<String> tagKeys;

    /**
     * 根据标签进行搜索。
     * 最长不得超过20个标签。
     */
    public List<Tag> tags;

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

    public List<String> getPortIds() {
        return this.portIds;
    }

    public void setPortIds(List<String> portIds) {
        this.portIds = portIds;
    }

    public String getPortName() {
        return this.portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public String getDcId() {
        return this.dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public List<String> getTagKeys() {
        return this.tagKeys;
    }

    public void setTagKeys(List<String> tagKeys) {
        this.tagKeys = tagKeys;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

}