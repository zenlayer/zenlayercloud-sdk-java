package com.zenlayercloud.bmc20260201.models;

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
     * 镜像所属分类。
     * 可能值：
     * <ul><li>centos</li><li>windows</li><li>ubuntu</li><li>debian</li><li>esxi</li></ul>
     */
    public String catalog;

    /**
     * 镜像类型。
     * PUBLIC_IMAGE: 公共镜像。
     * CUSTOM_IMAGE：自定义镜像。
     * 目前不支持自主的创建自定义镜像，可联系support沟通。
     */
    public String imageType;

    /**
     * 操作系统类型。
     * 可能值：
     * <ul><li>windows</li><li>linux</li></ul>
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

    public String getCatalog() {
        return this.catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
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

}