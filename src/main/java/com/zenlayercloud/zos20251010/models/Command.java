package com.zenlayercloud.zos20251010.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述命令的基本信息。
 */
public class Command extends TeaModel {


    /**
     * 命令ID
     */
    public String commandId;

    /**
     * 命令的名称
     */
    public String name;

    /**
     * 命令的描述信息
     */
    public String description;

    /**
     * 命令的内容
     */
    public String content;

    /**
     * 命令的类型
     */
    public String type;

    /**
     * 命令的创建时间
     */
    public String createTime;

    /**
     * 最近执行的时间
     */
    public String latestInvocationTime;

    /**
     * 指令的标签
     */
    public Tags tags;

    /**
     * 指令所属的资源组
     */
    public ResourceGroupInfo resourceGroup;

    public String getCommandId() {
        return this.commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLatestInvocationTime() {
        return this.latestInvocationTime;
    }

    public void setLatestInvocationTime(String latestInvocationTime) {
        this.latestInvocationTime = latestInvocationTime;
    }

    public Tags getTags() {
        return this.tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public ResourceGroupInfo getResourceGroup() {
        return this.resourceGroup;
    }

    public void setResourceGroup(ResourceGroupInfo resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

}