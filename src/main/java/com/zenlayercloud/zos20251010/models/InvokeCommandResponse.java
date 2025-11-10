package com.zenlayercloud.zos20251010.models;

import com.aliyun.tea.TeaModel;


/**
 * 执行命令的响应信息。
 */
public class InvokeCommandResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 命令执行记录编号
     */
    public String invocationId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getInvocationId() {
        return this.invocationId;
    }

    public void setInvocationId(String invocationId) {
        this.invocationId = invocationId;
    }

}