package com.zenlayercloud.user20240529.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class CreateMemberGroupResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 成员组唯一ID。
     */
    public String memberGroupId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getMemberGroupId() {
        return this.memberGroupId;
    }

    public void setMemberGroupId(String memberGroupId) {
        this.memberGroupId = memberGroupId;
    }

}