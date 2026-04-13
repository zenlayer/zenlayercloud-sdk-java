package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeImageQuotaResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 镜像配额结果集。
     */
    public List<ImageQuotaInfo> images;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<ImageQuotaInfo> getImages() {
        return this.images;
    }

    public void setImages(List<ImageQuotaInfo> images) {
        this.images = images;
    }

}