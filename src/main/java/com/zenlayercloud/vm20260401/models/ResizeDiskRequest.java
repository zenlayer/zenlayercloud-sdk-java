package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class ResizeDiskRequest extends TeaModel {


    /**
     * 云硬盘ID。
     */
    public String diskId;

    /**
     * 扩容后的云硬盘大小，单位GB。
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