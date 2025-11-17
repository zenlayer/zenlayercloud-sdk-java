package com.zenlayercloud.zos20251010.models;

import com.aliyun.tea.TeaModel;


/**
 * 创建命令的请求参数。
 */
public class CreateCommandRequest extends TeaModel {


    /**
     * 命令名称。
     * 长度不能超过64个字符
     */
    public String name;

    /**
     * 命令内容。
     * 长度不能超过4096个字符
     */
    public String content;

    /**
     * 命令类型
     */
    public String type;

    /**
     * 命令描述信息。
     * 最长不超过255个字符
     */
    public String description;

    /**
     * 命令关联的资源组ID
     */
    public String resourceGroupId;

    /**
     * 命令绑定的标签信息
     */
    public TagAssociation tags;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
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