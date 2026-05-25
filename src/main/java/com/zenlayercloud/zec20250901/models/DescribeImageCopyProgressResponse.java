package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeImageCopyProgressResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 镜像复制进度列表，仅包含进行中的目标区域。
     * 镜像状态非SYNCING时返回空列表。
     */
    public List<ImageCopyProgress> dataSet;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<ImageCopyProgress> getDataSet() {
        return this.dataSet;
    }

    public void setDataSet(List<ImageCopyProgress> dataSet) {
        this.dataSet = dataSet;
    }

}