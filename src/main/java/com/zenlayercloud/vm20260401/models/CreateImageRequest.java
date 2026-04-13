package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class CreateImageRequest extends TeaModel {


    /**
     * 需要制作镜像的实例ID。
     */
    public String instanceId;

    /**
     * 镜像名称。
     * 长度不超过24位，支持中文、字母、数字或连接符号-_。
     */
    public String imageName;

    /**
     * 镜像描述。
     * 不超过255个字符。
     */
    public String imageDescription;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getImageName() {
        return this.imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageDescription() {
        return this.imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }

}