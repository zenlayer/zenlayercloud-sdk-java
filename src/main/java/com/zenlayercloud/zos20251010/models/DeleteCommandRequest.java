package com.zenlayercloud.zos20251010.models;

import com.aliyun.tea.TeaModel;


/**
 * 删除命令的请求。
 */
public class DeleteCommandRequest extends TeaModel {


    /**
     * 需要删除的命令ID
     */
    public String commandId;

    public String getCommandId() {
        return this.commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

}