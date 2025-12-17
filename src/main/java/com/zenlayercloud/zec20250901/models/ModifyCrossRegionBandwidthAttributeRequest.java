package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 修改内网跨区域带宽属性请求参数
 */
public class ModifyCrossRegionBandwidthAttributeRequest extends TeaModel {


    /**
     * 要修改的内网跨区域带宽ID集合
     */
    public List<String> crossRegionBandwidthIds;

    /**
     * 内网跨区域带宽的名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-/_和英文句点(.)。
     * 且必须以数字或字母开头和结尾
     */
    public String crossRegionBandwidthName;

    public List<String> getCrossRegionBandwidthIds() {
        return this.crossRegionBandwidthIds;
    }

    public void setCrossRegionBandwidthIds(List<String> crossRegionBandwidthIds) {
        this.crossRegionBandwidthIds = crossRegionBandwidthIds;
    }

    public String getCrossRegionBandwidthName() {
        return this.crossRegionBandwidthName;
    }

    public void setCrossRegionBandwidthName(String crossRegionBandwidthName) {
        this.crossRegionBandwidthName = crossRegionBandwidthName;
    }

}