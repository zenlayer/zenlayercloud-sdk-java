package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class DescribeImageCopyProgressRequest extends TeaModel {


    /**
     * 自定义镜像 ID。
     */
    public String imageId;

    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

}