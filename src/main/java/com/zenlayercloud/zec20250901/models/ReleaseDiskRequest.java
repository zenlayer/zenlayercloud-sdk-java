package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class ReleaseDiskRequest extends TeaModel {


    /**
     * 要删除的云硬盘ID。
     */
    public String diskId;

    public String getDiskId() {
        return this.diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

}