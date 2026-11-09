package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 
 */
public class DescribeNetworkInterfacePermissionsRequest extends TeaModel {


    /**
     * 根据网卡ID过滤。
     * 最多传入100个ID。
     */
    public List<String> nicIds;

    /**
     * 根据网卡授权ID过滤。
     * 最多传入100个ID。
     */
    public List<String> permissionIds;

    /**
     * 返回的分页大小。
     */
    public Integer pageSize;

    /**
     * 返回的分页数。
     */
    public Integer pageNum;

    public List<String> getNicIds() {
        return this.nicIds;
    }

    public void setNicIds(List<String> nicIds) {
        this.nicIds = nicIds;
    }

    public List<String> getPermissionIds() {
        return this.permissionIds;
    }

    public void setPermissionIds(List<String> permissionIds) {
        this.permissionIds = permissionIds;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

}