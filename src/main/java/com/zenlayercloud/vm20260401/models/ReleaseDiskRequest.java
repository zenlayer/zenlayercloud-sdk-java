package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;


public class ReleaseDiskRequest extends TeaModel {


    /**
     * 云硬盘ID。
     */
    public String diskId;

    public String getDiskId() {
        return this.diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

}