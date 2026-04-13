package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class CreateImageResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 镜像ID。
     */
    public String imageId;

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

}