package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DeleteImagesRequest extends TeaModel {


    /**
     * 将要被删除的镜像ID集合。
     */
    public List<String> imageIds;

    public List<String> getImageIds() {
        return this.imageIds;
    }

    public void setImageIds(List<String> imageIds) {
        this.imageIds = imageIds;
    }

}