package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述实例的状态。
 */
public class InstanceStatus extends TeaModel {


    /**
     * 待创建
     */
    public String PENDING;

    /**
     * 部署中
     */
    public String DEPLOYING;

    /**
     * 重建中。
     */
    public String REBUILDING;

    /**
     * 重启中
     */
    public String REBOOT;

    /**
     * 运行中。
     */
    public String RUNNING;

    /**
     * 关机的。
     */
    public String STOPPED;

    /**
     * 启动中。
     */
    public String BOOTING;

    /**
     * 删除释放中。
     */
    public String RELEASING;

    /**
     * 关机中。
     */
    public String STOPPING;

    /**
     * 已删除，回收保留中。
     */
    public String RECYCLE;

    /**
     * 回收中。
     */
    public String RECYCLING;

    /**
     * 创建失败。
     */
    public String CREATE_FAILED;

    /**
     * 镜像制作中。
     */
    public String IMAGING;

    public String getPENDING() {
        return this.PENDING;
    }

    public void setPENDING(String PENDING) {
        this.PENDING = PENDING;
    }

    public String getDEPLOYING() {
        return this.DEPLOYING;
    }

    public void setDEPLOYING(String DEPLOYING) {
        this.DEPLOYING = DEPLOYING;
    }

    public String getREBUILDING() {
        return this.REBUILDING;
    }

    public void setREBUILDING(String REBUILDING) {
        this.REBUILDING = REBUILDING;
    }

    public String getREBOOT() {
        return this.REBOOT;
    }

    public void setREBOOT(String REBOOT) {
        this.REBOOT = REBOOT;
    }

    public String getRUNNING() {
        return this.RUNNING;
    }

    public void setRUNNING(String RUNNING) {
        this.RUNNING = RUNNING;
    }

    public String getSTOPPED() {
        return this.STOPPED;
    }

    public void setSTOPPED(String STOPPED) {
        this.STOPPED = STOPPED;
    }

    public String getBOOTING() {
        return this.BOOTING;
    }

    public void setBOOTING(String BOOTING) {
        this.BOOTING = BOOTING;
    }

    public String getRELEASING() {
        return this.RELEASING;
    }

    public void setRELEASING(String RELEASING) {
        this.RELEASING = RELEASING;
    }

    public String getSTOPPING() {
        return this.STOPPING;
    }

    public void setSTOPPING(String STOPPING) {
        this.STOPPING = STOPPING;
    }

    public String getRECYCLE() {
        return this.RECYCLE;
    }

    public void setRECYCLE(String RECYCLE) {
        this.RECYCLE = RECYCLE;
    }

    public String getRECYCLING() {
        return this.RECYCLING;
    }

    public void setRECYCLING(String RECYCLING) {
        this.RECYCLING = RECYCLING;
    }

    public String getCREATE_FAILED() {
        return this.CREATE_FAILED;
    }

    public void setCREATE_FAILED(String CREATE_FAILED) {
        this.CREATE_FAILED = CREATE_FAILED;
    }

    public String getIMAGING() {
        return this.IMAGING;
    }

    public void setIMAGING(String IMAGING) {
        this.IMAGING = IMAGING;
    }

}