package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class CreatePlacementGroupRequest extends TeaModel {


    /**
     * 置放组所属可用区ID。
     * 置放组的管理范围为zone维度。
     */
    public String zoneId;

    /**
     * 置放组名称。
     * 长度2到63个字符。
     * 必须以字母或数字开头和结尾，支持字母、数字、空格、连字符、斜杠、点号。
     */
    public String name;

    /**
     * 置放组的分区数。
     * 决定置放组最大可关联实例数。
     */
    public Integer partitionNum;

    /**
     * 置放组的亲和度。
     * 取值范围为1到分区数向下取整除以2。
     * 不填时默认为分区数向下取整除以2。
     */
    public Integer affinity;

    /**
     * 资源组ID。
     */
    public String resourceGroupId;

    /**
     * 创建置放组时关联的标签。
     */
    public TagAssociation tags;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
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

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

}