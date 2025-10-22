package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DeleteImagesRequest extends TeaModel {


    /**
     * 镜像ID列表
     */
    public List<String> imageIds;

    public List<String> getImageIds() {
        return this.imageIds;
    }

    public void setImageIds(List<String> imageIds) {
        this.imageIds = imageIds;
    }

}