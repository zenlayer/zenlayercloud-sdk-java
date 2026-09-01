package com.zenlayercloud.zos20251010.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyCommandRequest extends TeaModel {


    /**
     * 需要修改的命令ID。
     */
    public String commandId;

    /**
     * 命令名称。
     * 长度不能超过64个字符。
     */
    public String name;

    /**
     * 命令内容，需使用Base64编码后传入。
     * 解码后长度不能超过16K(16384)个字符。
     */
    public String content;

    /**
     * 命令的描述信息。
     * 长度不能超过255个字符。
     */
    public String description;

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

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}