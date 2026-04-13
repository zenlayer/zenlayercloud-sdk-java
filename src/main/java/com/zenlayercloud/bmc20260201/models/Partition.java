package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * 分区配置信息。包括文件类型, 分区大小等。
 */
public class Partition extends TeaModel {


    /**
     * 分区盘符。
     * linux系统：必须为/开头，且第一个为系统分区必须为/。
     * windows系统：支持C~H，第一个系统分区必须指定为C。
     */
    public String fsPath;

    /**
     * 分区的文件类型。
     * linux系统：支持的值ext2,ext3, ext4, ext类型必须要有。
     * windows系统: 只能为NTFS。
     */
    public String fsType;

    /**
     * 分区大小。
     * 单位为GB。
     */
    public Integer size;

    public String getFsPath() {
        return this.fsPath;
    }

    public void setFsPath(String fsPath) {
        this.fsPath = fsPath;
    }

    public String getFsType() {
        return this.fsType;
    }

    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    public Integer getSize() {
        return this.size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

}