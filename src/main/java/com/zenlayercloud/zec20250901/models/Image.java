package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述镜像的基本信息。
 */
public class Image extends TeaModel {


    /**
     * 镜像ID
     */
    public String imageId;

    /**
     * 镜像的名称
     */
    public String imageName;

    /**
     * 镜像的类型
     */
    public String imageType;

    /**
     * 镜像的大小
     */
    public String imageSize;

    /**
     * 镜像描述信息
     */
    public String imageDescription;

    /**
     * 镜像的版本
     */
    public String imageVersion;

    /**
     * 镜像的状态
     */
    public String imageStatus;

    /**
     * 镜像支持的网卡类型
     */
    public List<String> nicNetworkType;

    /**
     * 镜像的分类
     */
    public String category;

    /**
     * 操作系统类型
     */
    public String osType;

    /**
     * 实例关联的标签
     */
    public Tags tags;

    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getImageName() {
        return this.imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageType() {
        return this.imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getImageSize() {
        return this.imageSize;
    }

    public void setImageSize(String imageSize) {
        this.imageSize = imageSize;
    }

    public String getImageDescription() {
        return this.imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }

    public String getImageVersion() {
        return this.imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public String getImageStatus() {
        return this.imageStatus;
    }

    public void setImageStatus(String imageStatus) {
        this.imageStatus = imageStatus;
    }

    public List<String> getNicNetworkType() {
        return this.nicNetworkType;
    }

    public void setNicNetworkType(List<String> nicNetworkType) {
        this.nicNetworkType = nicNetworkType;
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

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

}