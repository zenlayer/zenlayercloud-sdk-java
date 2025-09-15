package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 恢复云硬盘的请求参数。
 */
public class RenewDiskRequest extends TeaModel {


    /**
     * 要恢复的云硬盘ID
     */
    public String diskId;

    public String getDiskId() {
        return this.diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

}