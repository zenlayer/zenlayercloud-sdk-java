package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeCustomImagesRequest extends TeaModel {


    /**
     * 区域ID，传入时仅返回该区域可用的自定义镜像。
     */
    public String regionId;

    /**
     * 镜像ID列表。
     */
    public List<String> imageIds;

    /**
     * 根据镜像名称过滤。
     * 该字段支持模糊搜索。
     */
    public String imageName;

    /**
     * 镜像所属分类。
     */
    public String category;

    /**
     * 操作系统类型。
     */
    public String osType;

    /**
     * 镜像的状态。
     */
    public String imageStatus;

    /**
     * 返回的分页页码。
     */
    public Integer pageNum;

    /**
     * 返回的分页大小。
     * 默认为20，最大为1000。
     */
    public Integer pageSize;

    /**
     * 根据资源组ID过滤。
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

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public List<String> getImageIds() {
        return this.imageIds;
    }

    public void setImageIds(List<String> imageIds) {
        this.imageIds = imageIds;
    }

    public String getImageName() {
        return this.imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOsType() {
        return this.osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getImageStatus() {
        return this.imageStatus;
    }

    public void setImageStatus(String imageStatus) {
        this.imageStatus = imageStatus;
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