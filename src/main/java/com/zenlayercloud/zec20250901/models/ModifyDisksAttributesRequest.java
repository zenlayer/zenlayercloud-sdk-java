package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 修改云盘属性的请求参数。
 */
public class ModifyDisksAttributesRequest extends TeaModel {


    /**
     * 需要修改的云盘ID列表
     */
    public List<String> diskIds;

    /**
     * 云盘名称。
     * 范围1到64个字符。
     * 仅支持输入字母、数字、-/_和英文句点(.)。
     * 且必须以数字或字母开头和结尾
     */
    public String diskName;

    public List<String> getDiskIds() {
        return this.diskIds;
    }

    public void setDiskIds(List<String> diskIds) {
        this.diskIds = diskIds;
    }

    public String getDiskName() {
        return this.diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

}