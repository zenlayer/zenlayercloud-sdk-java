package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 描述公网IP池的基本信息。
 */
public class PoolInfo extends TeaModel {


    /**
     * 公网IP池的ID
     */
    public String poolId;

    /**
     * 公网IP池所在的节点ID
     */
    public String regionId;

    /**
     * 公网IP池的名称
     */
    public String name;

    /**
     * 公网IP池的创建时间
     */
    public String createTime;

    public String getPoolId() {
        return this.poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
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