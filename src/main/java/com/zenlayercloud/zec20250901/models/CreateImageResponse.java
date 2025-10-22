package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class CreateImageResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 镜像ID
     */
    public String imageId;

    /**
     * 镜像名称
     */
    public String imageName;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

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

}