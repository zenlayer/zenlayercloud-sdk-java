package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeImagesRequest extends TeaModel {


    /**
     * 镜像ID。
     */
    public List<String> imageIds;

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
     * 目前不支持自主的创建自定义镜像，如有需求，请提交support。
     */
    public String imageType;

    /**
     * 操作系统类型。
     * 可能值：
     * <ul><li>windows</li><li>linux</li></ul>
     */
    public String osType;

    /**
     * 支持的机型ID。
     */
    public String instanceTypeId;

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

    public String getInstanceTypeId() {
        return this.instanceTypeId;
    }

    public void setInstanceTypeId(String instanceTypeId) {
        this.instanceTypeId = instanceTypeId;
    }

}