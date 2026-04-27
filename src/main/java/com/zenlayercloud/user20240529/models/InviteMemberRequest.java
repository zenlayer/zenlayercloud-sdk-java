package com.zenlayercloud.user20240529.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class InviteMemberRequest extends TeaModel {


    /**
     * 用户邮箱。
     */
    public String email;

    /**
     * 成员组唯一ID。
     */
    public String memberGroupId;

    /**
     * 是否生成API访问密钥。
     */
    public Boolean openApi;

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMemberGroupId() {
        return this.memberGroupId;
    }

    public void setMemberGroupId(String memberGroupId) {
        this.memberGroupId = memberGroupId;
    }

    public Boolean getOpenApi() {
        return this.openApi;
    }

    public void setOpenApi(Boolean openApi) {
        this.openApi = openApi;
    }

}