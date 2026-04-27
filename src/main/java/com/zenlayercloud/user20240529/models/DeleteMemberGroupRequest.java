package com.zenlayercloud.user20240529.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DeleteMemberGroupRequest extends TeaModel {


    /**
     * 成员组唯一ID。
     */
    public String memberGroupId;

    public String getMemberGroupId() {
        return this.memberGroupId;
    }

    public void setMemberGroupId(String memberGroupId) {
        this.memberGroupId = memberGroupId;
    }

}