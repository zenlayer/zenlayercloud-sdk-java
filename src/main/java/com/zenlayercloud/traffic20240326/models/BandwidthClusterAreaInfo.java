package com.zenlayercloud.traffic20240326.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 描述带宽包的区域信息。
 */
public class BandwidthClusterAreaInfo extends TeaModel {


    /**
     * 带宽包区域代码
     */
    public String areaCode;

    /**
     * 带宽包区域名称
     */
    public String areaName;

    /**
     * 该地区支持的IP网络类型
     */
    public List<String> networkTypes;

    public String getAreaCode() {
        return this.areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return this.areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public List<String> getNetworkTypes() {
        return this.networkTypes;
    }

    public void setNetworkTypes(List<String> networkTypes) {
        this.networkTypes = networkTypes;
    }

}