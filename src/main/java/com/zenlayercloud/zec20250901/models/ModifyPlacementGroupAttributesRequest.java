package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ModifyPlacementGroupAttributesRequest extends TeaModel {


    /**
     * 置放组ID。
     */
    public String placementGroupId;

    /**
     * 置放组新名称。
     * 长度2到63个字符。
     * 必须以字母或数字开头和结尾，支持字母、数字、空格、连字符、斜杠、点号。
     */
    public String name;

    /**
     * 置放组的分区数。
     * 取值范围为2到5。
     * 分区数只能调大，不能调小。
     * 若修改后的分区数或亲和度不满足当前实例分布状态，会拒绝修改。
     */
    public Integer partitionNum;

    /**
     * 置放组的亲和度。
     * 取值范围为1到分区数向下取整除以2。
     */
    public Integer affinity;

    public String getPlacementGroupId() {
        return this.placementGroupId;
    }

    public void setPlacementGroupId(String placementGroupId) {
        this.placementGroupId = placementGroupId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPartitionNum() {
        return this.partitionNum;
    }

    public void setPartitionNum(Integer partitionNum) {
        this.partitionNum = partitionNum;
    }

    public Integer getAffinity() {
        return this.affinity;
    }

    public void setAffinity(Integer affinity) {
        this.affinity = affinity;
    }

}