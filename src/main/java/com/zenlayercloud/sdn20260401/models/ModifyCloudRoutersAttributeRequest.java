package com.zenlayercloud.sdn20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class ModifyCloudRoutersAttributeRequest extends TeaModel {


    /**
     * 三层网络的 ID 列表。
     * 数量不超过 100。
     */
    public List<String> cloudRouterIds;

    /**
     * 三层网络名称。
     * 长度不超过 255，名称和描述至少指定其一。
     */
    public String cloudRouterName;

    /**
     * 三层网络描述信息。
     * 长度不超过 255，名称和描述至少指定其一。
     */
    public String cloudRouterDescription;

    public List<String> getCloudRouterIds() {
        return this.cloudRouterIds;
    }

    public void setCloudRouterIds(List<String> cloudRouterIds) {
        this.cloudRouterIds = cloudRouterIds;
    }

    public String getCloudRouterName() {
        return this.cloudRouterName;
    }

    public void setCloudRouterName(String cloudRouterName) {
        this.cloudRouterName = cloudRouterName;
    }

    public String getCloudRouterDescription() {
        return this.cloudRouterDescription;
    }

    public void setCloudRouterDescription(String cloudRouterDescription) {
        this.cloudRouterDescription = cloudRouterDescription;
    }

}