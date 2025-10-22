package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class CreateImageRequest extends TeaModel {


    /**
     * 需要制作镜像的实例ID
     */
    public String instanceId;

    /**
     * 名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-/_和英文句点(.)。
     * 且必须以数字或字母开头和结尾
     */
    public String imageName;

    /**
     * 镜像所放的资源组ID，如不指定则放入默认资源组
     */
    public String resourceGroupId;

    /**
     * 创建镜像时关联的标签。
     * 注意：·关联`标签键`不能重复
     */
    public TagAssociation tags;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getImageName() {
        return this.imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

}