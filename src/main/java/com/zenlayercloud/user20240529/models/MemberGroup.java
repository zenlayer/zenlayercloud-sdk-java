package com.zenlayercloud.user20240529.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述成员组的响应信息。包括成员组ID，名称等。
 */
public class MemberGroup extends TeaModel {


    /**
     * 成员组唯一ID。
     */
    public String memberGroupId;

    /**
     * 成员组名称。
     */
    public String name;

    /**
     * 成员组创建时间。
     */
    public String createTime;

    public String getMemberGroupId() {
        return this.memberGroupId;
    }

    public void setMemberGroupId(String memberGroupId) {
        this.memberGroupId = memberGroupId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}