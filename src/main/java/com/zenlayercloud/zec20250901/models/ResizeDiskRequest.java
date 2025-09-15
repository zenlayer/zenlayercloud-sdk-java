package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


public class ResizeDiskRequest extends TeaModel {


    /**
     * 云硬盘ID。
     * 通过DescribeDisks接口查询
     */
    public String diskId;

    /**
     * 云硬盘扩容后的大小。
     * 单位GiB。
     * 必须大于当前云硬盘大小。
     * 云盘最大限制为32768GB(32TB)
     */
    public Integer diskSize;

    public String getDiskId() {
        return this.diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    public Integer getDiskSize() {
        return this.diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

}