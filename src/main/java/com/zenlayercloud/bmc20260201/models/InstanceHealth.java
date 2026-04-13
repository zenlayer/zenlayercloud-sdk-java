package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;


/**
 * 实例状态信息。
 */
public class InstanceHealth extends TeaModel {


    /**
     * 实例ID。
     */
    public String instanceId;

    /**
     * CPU状态。
     * <ul><li>OK：硬件状态正常。</li><li>WARNING：硬件原生告警。</li><li>UNKNOWN：数据未采集到。</li></ul>
     */
    public String cpuStatus;

    /**
     * Disk状态。
     * <ul><li>OK：硬件状态正常。</li><li>WARNING：硬件原生告警。</li><li>UNKNOWN：数据未采集到。</li></ul>
     */
    public String diskStatus;

    /**
     * Ipmi IP状态。
     * <ul><li>OK：ICMP探测正常。</li><li>CRITICAL：ICMP探测失败。</li><li>UNKNOWN：数据未采集到。</li></ul>
     */
    public String ipmiPing;

    /**
     * Ipmi状态。
     * <ul><li>OK：ICMP探测正常。</li><li>WARNING：硬件原生告警。</li><li>UNKNOWN：数据未采集到。</li></ul>
     */
    public String ipmiStatus;

    /**
     * Memory状态。
     * <ul><li>OK：硬件状态正常。</li><li>WARNING：硬件原生告警。</li><li>UNKNOWN：数据未采集到。</li></ul>
     */
    public String memoryStatus;

    /**
     * Power Supply状态。
     * <ul><li>OK：硬件状态正常。</li><li>WARNING：硬件原生告警。</li><li>UNKNOWN：数据未采集到。</li></ul>
     */
    public String psuStatus;

    /**
     * 服务器公网口连接的交换机端口的状态。
     * <ul><li>OK：硬件状态正常。</li><li>WARNING：硬件原生告警。</li><li>UNKNOWN：数据未采集到。</li></ul>
     */
    public String wanPortStatus;

    /**
     * 风扇状态。
     * <ul><li>OK：硬件状态正常。</li><li>WARNING：硬件原生告警。</li><li>UNKNOWN：数据未采集到。</li></ul>
     */
    public String fanStatus;

    /**
     * 服务器供应商品牌。
     */
    public String serverBrand;

    /**
     * 服务器供应商型号。
     */
    public String serverModel;

    /**
     * 超微 Supermicro 对于刀片机单 CPU 的温度，范围[0-100]，为空代表取不到值。
     */
    public Integer cpuTemp;

    /**
     * CPU0 的温度，范围[0-100]，为空代表取不到值。
     */
    public Integer cpu0Temp;

    /**
     * CPU1 的温度，范围[0-100]，为空代表取不到值。
     */
    public Integer cpu1Temp;

    /**
     * CPU2 的温度，范围[0-100]，为空代表取不到值。
     */
    public Integer cpu2Temp;

    /**
     * 进入服务器的空气温度，可简单认为是服务器所在机房的温度。
     */
    public Integer inletTemp;

    /**
     * 温度单位，目前只有Celsius，即摄氏温度。
     */
    public String tempUnit;

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getCpuStatus() {
        return this.cpuStatus;
    }

    public void setCpuStatus(String cpuStatus) {
        this.cpuStatus = cpuStatus;
    }

    public String getDiskStatus() {
        return this.diskStatus;
    }

    public void setDiskStatus(String diskStatus) {
        this.diskStatus = diskStatus;
    }

    public String getIpmiPing() {
        return this.ipmiPing;
    }

    public void setIpmiPing(String ipmiPing) {
        this.ipmiPing = ipmiPing;
    }

    public String getIpmiStatus() {
        return this.ipmiStatus;
    }

    public void setIpmiStatus(String ipmiStatus) {
        this.ipmiStatus = ipmiStatus;
    }

    public String getMemoryStatus() {
        return this.memoryStatus;
    }

    public void setMemoryStatus(String memoryStatus) {
        this.memoryStatus = memoryStatus;
    }

    public String getPsuStatus() {
        return this.psuStatus;
    }

    public void setPsuStatus(String psuStatus) {
        this.psuStatus = psuStatus;
    }

    public String getWanPortStatus() {
        return this.wanPortStatus;
    }

    public void setWanPortStatus(String wanPortStatus) {
        this.wanPortStatus = wanPortStatus;
    }

    public String getFanStatus() {
        return this.fanStatus;
    }

    public void setFanStatus(String fanStatus) {
        this.fanStatus = fanStatus;
    }

    public String getServerBrand() {
        return this.serverBrand;
    }

    public void setServerBrand(String serverBrand) {
        this.serverBrand = serverBrand;
    }

    public String getServerModel() {
        return this.serverModel;
    }

    public void setServerModel(String serverModel) {
        this.serverModel = serverModel;
    }

    public Integer getCpuTemp() {
        return this.cpuTemp;
    }

    public void setCpuTemp(Integer cpuTemp) {
        this.cpuTemp = cpuTemp;
    }

    public Integer getCpu0Temp() {
        return this.cpu0Temp;
    }

    public void setCpu0Temp(Integer cpu0Temp) {
        this.cpu0Temp = cpu0Temp;
    }

    public Integer getCpu1Temp() {
        return this.cpu1Temp;
    }

    public void setCpu1Temp(Integer cpu1Temp) {
        this.cpu1Temp = cpu1Temp;
    }

    public Integer getCpu2Temp() {
        return this.cpu2Temp;
    }

    public void setCpu2Temp(Integer cpu2Temp) {
        this.cpu2Temp = cpu2Temp;
    }

    public Integer getInletTemp() {
        return this.inletTemp;
    }

    public void setInletTemp(Integer inletTemp) {
        this.inletTemp = inletTemp;
    }

    public String getTempUnit() {
        return this.tempUnit;
    }

    public void setTempUnit(String tempUnit) {
        this.tempUnit = tempUnit;
    }

}