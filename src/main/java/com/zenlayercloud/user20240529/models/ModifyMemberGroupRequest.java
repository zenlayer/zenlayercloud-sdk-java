package com.zenlayercloud.user20240529.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyMemberGroupRequest extends TeaModel {


    /**
     * 成员组唯一名称。
     */
    public String name;

    /**
     * 成员组唯一ID。
     */
    public String memberGroupId;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberGroupId() {
        return this.memberGroupId;
    }

    public void setMemberGroupId(String memberGroupId) {
        this.memberGroupId = memberGroupId;
    }

}