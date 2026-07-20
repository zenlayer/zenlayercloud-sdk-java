package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyPortAttributeRequest extends TeaModel {


    /**
     * 数据中心端口 ID。
     */
    public String portId;

    /**
     * 数据中心端口名称。
     * 最长 255 字符，建议使用数据中心四字码+数据中心端口规格。
     */
    public String portName;

    /**
     * 数据中心端口备注信息。
     * 最长 255 字符。
     */
    public String portRemarks;

    /**
     * 商业实体名称。
     * 用于 LOA 抬头。
     * 仅在数据中心端口 LOA 上传前可修改，已上传则不支持修改。
     */
    public String businessEntityName;

    public String getPortId() {
        return this.portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public String getPortName() {
        return this.portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public String getPortRemarks() {
        return this.portRemarks;
    }

    public void setPortRemarks(String portRemarks) {
        this.portRemarks = portRemarks;
    }

    public String getBusinessEntityName() {
        return this.businessEntityName;
    }

    public void setBusinessEntityName(String businessEntityName) {
        this.businessEntityName = businessEntityName;
    }

}