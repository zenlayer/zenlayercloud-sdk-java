package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;


/**
 * 
 */
public class InquiryPriceResizeDiskRequest extends TeaModel {


    /**
     * 云硬盘ID。
     */
    public String diskId;

    /**
     * 云硬盘扩容后的目标大小。
     * 单位：GiB。
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