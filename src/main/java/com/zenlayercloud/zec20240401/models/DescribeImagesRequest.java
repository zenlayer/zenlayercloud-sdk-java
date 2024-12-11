package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

public class DescribeImagesRequest extends TeaModel {
    public List<String> imageIds;

    public String imageName;

    @Validation(required = true)
    public String zoneId;

    public String category;

    public String imageType;

    public String osType;

    public String imageStatus;

    public Integer pageNum;

    public Integer pageSize;
}
