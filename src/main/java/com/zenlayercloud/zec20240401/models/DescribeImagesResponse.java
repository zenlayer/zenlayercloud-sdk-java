package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeImagesResponse extends TeaModel {
    public String requestId;

    public Integer totalCount;

    public List<ImageInfo> dataSet;

    public static class ImageInfo extends TeaModel {
        public String imageId;

        public String imageName;

        public String imageType;

        public String imageSize;

        public String imageDescription;

        public String imageVersion;

        public String imageStatus;

        public String category;

        public String osType;

    }
}
