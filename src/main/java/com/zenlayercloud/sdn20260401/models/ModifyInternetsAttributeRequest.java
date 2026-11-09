package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class ModifyInternetsAttributeRequest extends TeaModel {


    /**
     * Internet ID 列表。
     * 最多支持 100 个。
     */
    public List<String> internetIds;

    /**
     * Internet名称。
     */
    public String internetName;

    /**
     * Internet描述。
     */
    public String internetDescription;

    public List<String> getInternetIds() {
        return this.internetIds;
    }

    public void setInternetIds(List<String> internetIds) {
        this.internetIds = internetIds;
    }

    public String getInternetName() {
        return this.internetName;
    }

    public void setInternetName(String internetName) {
        this.internetName = internetName;
    }

    public String getInternetDescription() {
        return this.internetDescription;
    }

    public void setInternetDescription(String internetDescription) {
        this.internetDescription = internetDescription;
    }

}