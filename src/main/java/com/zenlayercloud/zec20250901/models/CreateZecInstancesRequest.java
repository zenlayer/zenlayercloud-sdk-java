package com.zenlayercloud.zec20250901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * 创建虚拟机实例的请求参数。
 */
public class CreateZecInstancesRequest extends TeaModel {


    /**
     * 可用区ID
     */
    public String zoneId;

    /**
     * 指定有效的镜像ID。
     * 可以通过[DescribeImages](describeimages.md)取返回信息中的imageId字段
     */
    public String imageId;

    /**
     * 设置操作系统的时区
     */
    public String timeZone;

    /**
     * 实例机型。
     * 具体取值可通过调用接口[DescribeZoneInstanceConfigInfos](describezoneinstanceconfiginfos.md)来获得最新的规格表
     */
    public String instanceType;

    /**
     * 实例显示名称。
     * 范围2到63个字符。
     * 仅支持输入字母、数字、-和英文句点(.)。
     * 且必须以数字或字母开头和结尾。
     * 购买多台实例，可以指定模式串[begin_number,bits]。
     * begin_number：有序数值的起始值，取值支持[0,99999]，默认值为0。
     * bits：有序数值所占的位数，取值支持[1,6]，默认值为6。
     * 注意模式串中不得有空格。
     * 购买1台时，例如server-[3,3]实例显示为server003；购买2台时，实例显示名分别为server003，server004。
     * 支持指定多个模式串，如server-[3,3]-[1,1]。
     * 默认值为 instance
     */
    public String instanceName;

    /**
     * 实例的密码。
     * 与keyId必须指定其中的一种。
     * 必须包含以下3种格式的字符：大小写字母: [a-zA-Z]数字: 0-9特殊字符: ~!@$^*-_=+
     */
    public String password;

    /**
     * 密钥ID。
     * 与password必须指定其中的一种。
     * 可调用接口DescribeKeyPairs来获得最新的密钥对信息。
     * 关联密钥后，就可以通过对应的私钥来访问实例；密钥与密码不能同时指定，同时Windows操作系统不支持指定密钥。
     * 示例值：key-YWD2QFOl
     */
    public String keyId;

    /**
     * 要创建的实例数量
     */
    public Integer instanceCount;

    /**
     * 实例系统盘配置信息。
     * 若不指定该参数，则按照系统默认值进行分配。
     * 即操作系统要求的最小大小
     */
    public SystemDisk systemDisk;

    /**
     * 实例数据盘配置信息。
     * 若不指定该参数，则默认不额外购买数据盘。
     * 目前只能附带1个数据盘
     */
    public List<DataDisk> dataDisks;

    /**
     * 要配置在实例主网卡的安全组ID。
     * 目前只能关联1个安全组。
     * 如果未指定，会默认用VPC关联的安全组
     */
    public String securityGroupId;

    /**
     * 子网ID
     */
    public String subnetId;

    /**
     * 分配的内网起始IP。
     * 如果内网IP被使用,则会往后分配
     */
    public String lanIp;

    /**
     * 是否安装启动Agent
     */
    public Boolean enableAgent;

    /**
     * 是否开启IP转发
     */
    public Boolean enableIpForward;

    /**
     * 公网IP的网络计费类型。
     * 如果不指定，则不会分配公网IP地址
     */
    public String internetChargeType;

    /**
     * 流量包订购大小。
     * 单位为TB。
     * 该值必须在`internetChargeType = ByTrafficPackage`时才会生效
     */
    public Double trafficPackageSize;

    /**
     * 公网出带宽上限。
     * 单位：Mbps。
     * 当分配公网IP时需要指定
     */
    public Integer bandwidth;

    /**
     * 公网IP的绑定模式。
     * 当分配公网IP时需要指定
     */
    public String eipBindType;

    /**
     * 公网IPv4的线路类型。
     * 当分配公网IP时需要指定。
     * 请确保所选子网的堆栈类型支持`IPv4`。
     * 目前不支持三线IP随实例一起创建
     */
    public String eipV4Type;

    /**
     * 共享带宽包ID。
     * 当网络计费方式是共享带宽包计费(`BandwidthCluster`)时需要指定
     */
    public String clusterId;

    /**
     * 创建后实例所在的资源组ID，如不指定则放入默认资源组
     */
    public String resourceGroupId;

    /**
     * 市场营销的相关选项
     */
    public MarketingInfo marketingOptions;

    /**
     * 创建实例时关联的标签。
     * 注意：·关联`标签键`不能重复
     */
    public TagAssociation tags;

    /**
     * 初始化命令
     */
    public String userData;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getTimeZone() {
        return this.timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public void setSystemDisk(SystemDisk systemDisk) {
        this.systemDisk = systemDisk;
    }

    public List<DataDisk> getDataDisks() {
        return this.dataDisks;
    }

    public void setDataDisks(List<DataDisk> dataDisks) {
        this.dataDisks = dataDisks;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getLanIp() {
        return this.lanIp;
    }

    public void setLanIp(String lanIp) {
        this.lanIp = lanIp;
    }

    public Boolean getEnableAgent() {
        return this.enableAgent;
    }

    public void setEnableAgent(Boolean enableAgent) {
        this.enableAgent = enableAgent;
    }

    public Boolean getEnableIpForward() {
        return this.enableIpForward;
    }

    public void setEnableIpForward(Boolean enableIpForward) {
        this.enableIpForward = enableIpForward;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public Double getTrafficPackageSize() {
        return this.trafficPackageSize;
    }

    public void setTrafficPackageSize(Double trafficPackageSize) {
        this.trafficPackageSize = trafficPackageSize;
    }

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getEipBindType() {
        return this.eipBindType;
    }

    public void setEipBindType(String eipBindType) {
        this.eipBindType = eipBindType;
    }

    public String getEipV4Type() {
        return this.eipV4Type;
    }

    public void setEipV4Type(String eipV4Type) {
        this.eipV4Type = eipV4Type;
    }

    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public MarketingInfo getMarketingOptions() {
        return this.marketingOptions;
    }

    public void setMarketingOptions(MarketingInfo marketingOptions) {
        this.marketingOptions = marketingOptions;
    }

    public TagAssociation getTags() {
        return this.tags;
    }

    public void setTags(TagAssociation tags) {
        this.tags = tags;
    }

    public String getUserData() {
        return this.userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

}