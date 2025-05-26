package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 实例列表请求参数
 */
public class DescribeManagedInstancesRequest extends TeaModel {


    /**
     * 实例ID。
     * 取值可以由多个实例ID组成一个。
     * 最多支持100个ID查询
     */
    public List<String> instanceIds;

    /**
     * 实例名称
     */
    public String instanceName;

    /**
     * 公网IP地址
     */
    public String ip;

    /**
     * 内网IP地址
     */
    public String lanIp;

    /**
     * 地域名称
     */
    public String facName;

    /**
     * 城市代码
     */
    public String cityCode;

    /**
     * 返回的分页数
     */
    public Integer pageNum;

    /**
     * 返回的分页大小
     */
    public Integer pageSize;

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLanIp() {
        return this.lanIp;
    }

    public void setLanIp(String lanIp) {
        this.lanIp = lanIp;
    }

    public String getFacName() {
        return this.facName;
    }

    public void setFacName(String facName) {
        this.facName = facName;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}