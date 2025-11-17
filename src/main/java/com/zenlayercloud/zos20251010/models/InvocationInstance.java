package com.zenlayercloud.zos20251010.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述执行目标实例的信息。
 */
public class InvocationInstance extends TeaModel {


    /**
     * 执行ID
     */
    public String instanceId;

    /**
     * 实例的名称
     */
    public String instanceName;

    /**
     * 实例是否存在
     */
    public Boolean instanceExist;

    /**
     * 实例执行任务的状态
     */
    public String taskStatus;

    /**
     * 命令进程的退出代码
     */
    public Integer exitCode;

    /**
     * 命令执行失败原因的代号
     */
    public String errorCode;

    /**
     * 命令执行的标准输出(stdout)
     */
    public String output;

    /**
     * 命令执行的标准错误输出(stderr)
     */
    public String outputError;

    /**
     * 命令执行的开始时间
     */
    public String execStartTime;

    /**
     * 命令执行的结束时间
     */
    public String execEndTime;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public Boolean getInstanceExist() {
        return this.instanceExist;
    }

    public void setInstanceExist(Boolean instanceExist) {
        this.instanceExist = instanceExist;
    }

    public String getTaskStatus() {
        return this.taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Integer getExitCode() {
        return this.exitCode;
    }

    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getOutput() {
        return this.output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getOutputError() {
        return this.outputError;
    }

    public void setOutputError(String outputError) {
        this.outputError = outputError;
    }

    public String getExecStartTime() {
        return this.execStartTime;
    }

    public void setExecStartTime(String execStartTime) {
        this.execStartTime = execStartTime;
    }

    public String getExecEndTime() {
        return this.execEndTime;
    }

    public void setExecEndTime(String execEndTime) {
        this.execEndTime = execEndTime;
    }

}