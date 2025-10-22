package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述镜像的请求信息
 */
public class DescribeImagesRequest extends TeaModel {


    /**
     * 查询镜像所在的可用区ID
     */
    public String zoneId;

    /**
     * 镜像ID列表
     */
    public List<String> imageIds;

    /**
     * 根据镜像名称过滤。
     * 该字段支持模糊搜索
     */
    public String imageName;

    /**
     * 镜像所属分类
     */
    public String category;

    /**
     * 镜像类型
     */
    public String imageType;

    /**
     * 操作系统类型
     */
    public String osType;

    /**
     * 镜像的状态
     */
    public String imageStatus;

    /**
     * 返回的分页页码。
     * 默认为1
     */
    public Integer pageNum;

    /**
     * 返回的分页大小。
     * 默认为20，最大为1000
     */
    public Integer pageSize;

    /**
     * 根据标签键进行搜索。
     * 最长不得超过20个标签键
     */
    public List<String> tagKeys;

    /**
     * 根据标签进行搜索。
     * 最长不得超过20个标签
     */
    public List<Tag> tags;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
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

    public String getImageType() {
        return this.imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
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