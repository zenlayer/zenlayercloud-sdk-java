package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DeleteImageCopyRequest extends TeaModel {


    /**
     * 自定义镜像ID。
     * 可通过调用 ~~DescribeImages~~ 获取。
     */
    public String imageId;

    /**
     * 待删除副本的区域ID列表。
     * 可通过调用 ~~DescribeRegions~~ 获取。
     */
    public List<String> regionIds;

    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public List<String> getRegionIds() {
        return this.regionIds;
    }

    public void setRegionIds(List<String> regionIds) {
        this.regionIds = regionIds;
    }

}