package com.zenlayercloud.zos20251010.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述命令执行记录的信息。
 */
public class CommandInvocation extends TeaModel {


    /**
     * 执行ID
     */
    public String invocationId;

    /**
     * 命令的ID
     */
    public String commandId;

    /**
     * 命令的名称
     */
    public String commandName;

    /**
     * 命令的类型
     */
    public String commandType;

    /**
     * 执行的内容
     */
    public String content;

    /**
     * 超时时间
     */
    public Integer timeout;

    /**
     * 命令执行的创建时间
     */
    public String createTime;

    /**
     * 命令的执行的总执行状态
     */
    public String invocationStatus;

    /**
     * 命令执行实例列表
     */
    public List<InvocationInstance> invocationInstances;

    public String getInvocationId() {
        return this.invocationId;
    }

    public void setInvocationId(String invocationId) {
        this.invocationId = invocationId;
    }

    public String getCommandId() {
        return this.commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    public String getCommandName() {
        return this.commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandType() {
        return this.commandType;
    }

    public void setCommandType(String commandType) {
        this.commandType = commandType;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getTimeout() {
        return this.timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getInvocationStatus() {
        return this.invocationStatus;
    }

    public void setInvocationStatus(String invocationStatus) {
        this.invocationStatus = invocationStatus;
    }

    public List<InvocationInstance> getInvocationInstances() {
        return this.invocationInstances;
    }

    public void setInvocationInstances(List<InvocationInstance> invocationInstances) {
        this.invocationInstances = invocationInstances;
    }

}