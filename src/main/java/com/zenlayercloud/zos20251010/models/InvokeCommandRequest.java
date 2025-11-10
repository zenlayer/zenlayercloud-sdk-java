package com.zenlayercloud.zos20251010.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class InvokeCommandRequest extends TeaModel {


    /**
     * 需要执行的命令ID
     */
    public String commandId;

    /**
     * 执行的实例ID列表。
     * 目前只支持ZEC实例。
     * 最多不得超过200个实例
     */
    public List<String> instanceIds;

    /**
     * 每台实例执行命令的超时时间。
     * 单位秒
     */
    public Integer timeout;

    public String getCommandId() {
        return this.commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public Integer getTimeout() {
        return this.timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

}