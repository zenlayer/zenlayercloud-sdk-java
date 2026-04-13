package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 镜像相关信息。
 */
public class ImageInfo extends TeaModel {


    /**
     * 镜像ID。
     */
    public String imageId;

    /**
     * 镜像名称。
     */
    public String imageName;

    /**
     * 镜像类型。
     * PUBLIC_IMAGE：公共镜像。
     * CUSTOM_IMAGE：自定义镜像。
     */
    public String imageType;

    /**
     * 镜像大小，单位为GB。
     */
    public String imageSize;

    /**
     * 镜像描述。
     */
    public String imageDescription;

    /**
     * 镜像版本。
     */
    public String imageVersion;

    /**
     * 镜像状态。
     * CREATING：创建中。
     * AVAILABLE：可用。
     * UNAVAILABLE：不可用。
     */
    public String imageStatus;

    /**
     * 镜像所属分类。
     */
    public String category;

    /**
     * 操作系统类型。
     * 可能值：windows、linux。
     */
    public String osType;

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

}