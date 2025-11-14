package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 获取攻击事件列表的请求参数。
 */
public class DescribeDDosAllEventListRequest extends TeaModel {


    /**
     * 攻击状态
     */
    public String status;

    /**
     * 被攻击的IP
     */
    public String ipAddress;

    /**
     * 攻击开始时间
     */
    public String startTime;

    /**
     * 攻击结束时间
     */
    public String endTime;

    /**
     * 返回的分页大小
     */
    public Integer pageSize;

    /**
     * 返回的分页数
     */
    public Integer pageNum;

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
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

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

}