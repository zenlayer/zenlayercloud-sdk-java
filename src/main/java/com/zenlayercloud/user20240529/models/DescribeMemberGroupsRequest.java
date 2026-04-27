package com.zenlayercloud.user20240529.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class DescribeMemberGroupsRequest extends TeaModel {


    /**
     * 成员组名称。
     */
    public String name;

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