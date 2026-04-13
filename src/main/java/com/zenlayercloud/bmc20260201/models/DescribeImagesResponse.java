package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeImagesResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 结果集。
     */
    public List<ImageInfo> images;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<ImageInfo> getImages() {
        return this.images;
    }

    public void setImages(List<ImageInfo> images) {
        this.images = images;
    }

}