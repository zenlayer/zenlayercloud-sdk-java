package com.zenlayercloud.user20240529.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeMembersRequest extends TeaModel {


    /**
     * 成员名称。
     */
    public String name;

    /**
     * 成员邮箱。
     */
    public String username;

    /**
     * 分页数。
     */
    public Integer pageNum;

    /**
     * 分页大小。
     */
    public Integer pageSize;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}