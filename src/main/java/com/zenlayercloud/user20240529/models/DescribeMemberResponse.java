package com.zenlayercloud.user20240529.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeMemberResponse extends TeaModel {


    /**
     * requestId
     */
    public String requestId;

    /**
     * 成员列表唯一ID。
     */
    public String memberId;

    /**
     * 用户唯一ID。
     */
    public String userUid;

    /**
     * 用户名称。
     */
    public String firstName;

    /**
     * 用户姓氏。
     */
    public String lastName;

    /**
     * 用户邮箱。
     */
    public String username;

    /**
     * 用户邀请状态。
     * ACTIVE：已加入,PENDING: 待确认
     */
    public String assignmentStatus;

    /**
     * 更新时间。
     */
    public String updateTime;

    /**
     * 加入时间。
     */
    public String createTime;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getUserUid() {
        return this.userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAssignmentStatus() {
        return this.assignmentStatus;
    }

    public void setAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}