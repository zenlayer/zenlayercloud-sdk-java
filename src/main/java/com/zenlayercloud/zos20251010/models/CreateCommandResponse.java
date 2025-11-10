package com.zenlayercloud.zos20251010.models;

import com.aliyun.tea.TeaModel;


/**
 * 创建命令的响应结果。
 */
public class CreateCommandResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 创建的命令ID
     */
    public String commandId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getCommandId() {
        return this.commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

}