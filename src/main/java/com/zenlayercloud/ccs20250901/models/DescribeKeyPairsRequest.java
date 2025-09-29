package com.zenlayercloud.ccs20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 查询密钥对列表的请求参数。
 */
public class DescribeKeyPairsRequest extends TeaModel {


    /**
     * 根据密钥对ID列表进行筛选
     */
    public List<String> keyIds;

    /**
     * 根据密钥对名称进行筛选。
     * 该字段支持模糊搜索
     */
    public String keyName;

    /**
     * 返回的分页大小。
     * 默认为20，最大为1000
     */
    public Integer pageSize;

    /**
     * 返回的分页数。
     * 默认为1
     */
    public Integer pageNum;

    public List<String> getKeyIds() {
        return this.keyIds;
    }

    public void setKeyIds(List<String> keyIds) {
        this.keyIds = keyIds;
    }

    public String getKeyName() {
        return this.keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
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