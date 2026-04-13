package com.zenlayercloud.vm20260401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DetachDisksRequest extends TeaModel {


    /**
     * 将要卸载的云硬盘ID集合。
     */
    public List<String> diskIds;

    public List<String> getDiskIds() {
        return this.diskIds;
    }

    public void setDiskIds(List<String> diskIds) {
        this.diskIds = diskIds;
    }

}