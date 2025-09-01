package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;


/**
 * 修改EIP属性的请求。
 */
public class ModifyEipAttributeRequest extends TeaModel {


    /**
     * 公网弹性IP的ID
     */
    public String eipId;

    /**
     * 公网弹性IP的名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-/_和英文句点(.)。
     * 且必须以数字或字母开头和结尾
     */
    public String name;

    public String getEipId() {
        return this.eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}