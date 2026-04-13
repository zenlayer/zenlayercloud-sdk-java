package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ModifyImagesAttributesRequest extends TeaModel {


    /**
     * 镜像ID集合。
     * 可从DescribeImages返回的imageId获取。
     */
    public List<String> imageIds;

    /**
     * 新的镜像描述。
     * 描述信息不得超过255个字符。
     */
    public String imageDescription;

    /**
     * 新的镜像名称。
     * 长度不超过24位，支持中文、字母、数字或连接符号-_。
     */
    public String imageName;

    public List<String> getImageIds() {
        return this.imageIds;
    }

    public void setImageIds(List<String> imageIds) {
        this.imageIds = imageIds;
    }

    public String getImageDescription() {
        return this.imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }

    public String getImageName() {
        return this.imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

}