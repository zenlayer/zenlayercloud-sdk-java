package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述CPU数据的信息。
 */
public class DescribeInstanceCpuMonitorData extends TeaModel {


    /**
     * CPU使用率。
     */
    public String cpu;

    /**
     * 时间。
     */
    public String time;

    public String getCpu() {
        return this.cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}