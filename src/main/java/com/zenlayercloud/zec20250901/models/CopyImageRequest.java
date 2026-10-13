package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class CopyImageRequest extends TeaModel {


    /**
     * 自定义镜像ID。
     * 可通过调用 ~~DescribeImages~~ 获取。
     */
    public String imageId;

    /**
     * 目标区域ID列表。
     */
    public List<String> regionIdList;

    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public List<String> getRegionIdList() {
        return this.regionIdList;
    }

    public void setRegionIdList(List<String> regionIdList) {
        this.regionIdList = regionIdList;
    }

}