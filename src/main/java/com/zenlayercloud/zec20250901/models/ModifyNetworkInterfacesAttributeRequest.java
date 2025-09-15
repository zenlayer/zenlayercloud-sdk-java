package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 修改网卡的属性的请求参数。
 */
public class ModifyNetworkInterfacesAttributeRequest extends TeaModel {


    /**
     * 需要修改的网卡ID列表
     */
    public List<String> nicIds;

    /**
     * 名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-/_和英文句点(.)。
     * 且必须以数字或字母开头和结尾
     */
    public String name;

    public List<String> getNicIds() {
        return this.nicIds;
    }

    public void setNicIds(List<String> nicIds) {
        this.nicIds = nicIds;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}