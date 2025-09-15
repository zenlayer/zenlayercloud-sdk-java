package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 查询Eip指定时间段内的流量信息的请求信息。
 */
public class DescribeEipTrafficRequest extends TeaModel {


    /**
     * 要查询的弹性IP ID
     */
    public String eipId;

    /**
     * 查询开始时间。
     * 按照ISO8601标准表示，并且使用UTC时间。
     * 格式为：YYYY-MM-ddTHH:mm:ssZ
     */
    public String startTime;

    /**
     * 查询结束时间。
     * 按照ISO8601标准表示，并且使用UTC时间。
     * 格式为：YYYY-MM-ddTHH:mm:ssZ
     */
    public String endTime;

    /**
     * 查询数据点间隔。
     * 单位为分钟。
     * 支持参数：1,5
     */
    public Integer step;

    /**
     * 指定IP查询，该字段用于三线IP,可以指定IP地址查询流量
     */
    public String wanIp;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getStep() {
        return this.step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public String getWanIp() {
        return this.wanIp;
    }

    public void setWanIp(String wanIp) {
        this.wanIp = wanIp;
    }

}