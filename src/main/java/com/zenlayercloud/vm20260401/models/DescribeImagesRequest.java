package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeImagesRequest extends TeaModel {


    /**
     * 镜像ID集合。
     */
    public List<String> imageIds;

    /**
     * 镜像名称。
     */
    public String imageName;

    /**
     * 可用区ID。
     * 可从DescribeZones的zoneId中获取。
     */
    public String zoneId;

    /**
     * 镜像所属分类。
     * 可能值：CentOS、Windows、Ubuntu、Debian。
     */
    public String category;

    /**
     * 镜像类型。
     * PUBLIC_IMAGE：公共镜像。
     * CUSTOM_IMAGE：自定义镜像。
     */
    public String imageType;

    /**
     * 操作系统类型。
     * 可能值：windows、linux。
     */
    public String osType;

    /**
     * 镜像状态。
     * CREATING：创建中。
     * AVAILABLE：可用。
     * UNAVAILABLE：不可用。
     */
    public String imageStatus;

    /**
     * 返回的分页数。
     * 默认为1。
     */
    public Integer pageNum;

    /**
     * 返回的分页大小。
     * 默认为20，最大为1000。
     */
    public Integer pageSize;

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

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
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

}