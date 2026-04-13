package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class CreateInstancesRequest extends TeaModel {


    /**
     * 实例所属的可用区ID。
     */
    public String zoneId;

    /**
     * 付费类型。
     * PREPAID：预付费，即包年包月 POSTPAID：后付费
     * 默认只支持预付费计费方式， 如果需要后付费， 请联系Support开通后付费权限。
     */
    public String instanceChargeType;

    /**
     * 预付费模式。
     * 即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长等属性。若指定实例的付费模式为预付费则该参数必传。
     */
    public ChargePrepaid instanceChargePrepaid;

    /**
     * 实例机型ID。
     * 具体取值可通过调用接口DescribeInstanceTypes来获得最新的规格表。
     */
    public String instanceTypeId;

    /**
     * 指定有效的镜像ID。
     * 可通过以下方式获取可用的镜像ID：通过调用接口 DescribeImages
     *                 ，传入InstanceType获取当前机型支持的镜像列表，取返回信息中的ImageId字段。
     *                 也可以不指定镜像，如果不指定镜像，后续可以通过IPMI进行安装。使用iPXE安装镜像，请指定ipxeUrl字段，且该字段不必传。
     */
    public String imageId;

    /**
     * 实例所在的资源组ID。
     */
    public String resourceGroupId;

    /**
     * 实例显示名称。
     * 不得超过64个字符。仅支持输入字母、数字、-和英文句点(.)。
     * 购买多台实例，可以指定模式串[begin_number,bits]。begin_number：有序数值的起始值，取值支持[0,99999]，默认值为0。bits：有序数值所占的位数，取值支持[1,6]，默认值为6。注意模式串中不得有空格。购买1台时，例如server_[3,3]实例显示为server003；购买2台时，实例显示名分别为server003，server004。支持指定多个模式串，如server_[3,3]_[1,1]。
     *                 
     * 默认值为 instance。
     */
    public String instanceName;

    /**
     * 实例的主机名。
     * 不得超过64个字符。仅支持输入字母、数字、-和英文句点(.) 。
     * 购买多台实例，可以指定模式串[begin_number,bits]。begin_number：有序数值的起始值，取值支持[0,99999]，默认值为0。bits：有序数值所占的位数，取值支持[1,6]，默认值为6。注意模式串中不得有空格。购买1台时，例如server_[3,3]主机名为server003；购买2台时，实例主机名分别为server003，server004。支持指定多个模式串，如server_[3,3]_[1,1]。
     *                 
     * 默认值为hostname。
     */
    public String hostname;

    /**
     * 指定创建实例的数量。
     */
    public Integer amount;

    /**
     * 实例的密码。
     * 必须是 8-16 个字符，包含大写字母、小写字母、数字和特殊字符。特殊符号可以是：1~!@$^*-_=+。该密码也是作为IPMI登录的密码。请妥善保管。
     * 密钥ID与密码必须并且只能指定其中一个。
     */
    public String password;

    /**
     * 密钥ID。与password必须指定其中的一种。
     * 可调用接口DescribeKeyPairs来获得最新的密钥对信息。
     *                 
     * 关联密钥后，就可以通过对应的私钥来访问实例；密钥与密码不能同时指定，同时Windows操作系统不支持指定密钥。
     * 示例值：key-YWD2QFOl
     */
    public String keyId;

    /**
     * 网络计费类型。
     */
    public String internetChargeType;

    /**
     * 公网出带宽上限。
     * 单位：Mbps。默认值：1Mbps。不同机型带宽上限范围不一致，具体限制详见购买网络带宽。
     */
    public Integer internetMaxBandwidthOut;

    /**
     * 流量包订购大小。
     * 单位为TB。该值仅限当 internetChargeType = ByTrafficPackage 生效。
     * 如果没有传则会默认以赠送的流量包大小
     */
    public Double trafficPackageSize;

    /**
     * 虚拟子网ID 。
     * 您可以调用DescribeVpcSubnets查询已创建的交换机的相关信息。
     */
    public String subnetId;

    /**
     * 磁盘阵列配置。
     */
    public RaidConfig raidConfig;

    /**
     * 分区配置。
     * 如果未安装操作系统，将不能设置分区
     */
    public List<Partition> partitions;

    /**
     * 网卡配置。
     */
    public Nic nic;

    /**
     * iPXE URL 地址。
     * 传入参数后，将根据指定URL进行iPXE安装， 如果指定为netboot，将使用netboot iPXE方式进行安装。相关帮助文档：Deploy
     *                     a Custom Image Using iPXE
     */
    public String ipxeUrl;

    /**
     * 用户数据。
     * 在安装实例时可以通过指定用户数据进行配置实例。当实例首次启动时，用户数据将以文本的方式传递到云服务器中，并执行该文本。支持的最大数据大小为 32KB。
     */
    public String userData;

    /**
     * 是否启用实例主IPv6。
     * false为不启用主IPv6，此时将不能为实例配置弹性IPv6。默认为true。
     */
    public Boolean enablePrimaryIPv6;

    /**
     * 带宽组ID。当 internetChargeType = ByBandwidthCluster 时必传。
     */
    public String clusterId;

    /**
     * 市场营销活动相关信息。
     */
    public MarketingInfo marketingOptions;

    /**
     * 创建实例时关联的标签。
     * 注意: 关联标签键不能重复。
     */
    public TagAssociation tags;

    /**
     * 是否启用网关模式。
     * 启用后，该机器上绑定的IP将作为网关模式使用，用于转发下游网络流量，且仅支持绑定EIP掩码段类IP。开启后需要进入机器完成进一步配置。若未开启则是普通路由模式。
     * 请注意：网关模式默认为不支持，如需使用请联系Console Support。
     */
    public Boolean enableGatewayMode;

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public void setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
    }

    public ChargePrepaid getInstanceChargePrepaid() {
        return this.instanceChargePrepaid;
    }

    public void setInstanceChargePrepaid(ChargePrepaid instanceChargePrepaid) {
        this.instanceChargePrepaid = instanceChargePrepaid;
    }

    public String getInstanceTypeId() {
        return this.instanceTypeId;
    }

    public void setInstanceTypeId(String instanceTypeId) {
        this.instanceTypeId = instanceTypeId;
    }

    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
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

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
    }

    public Double getTrafficPackageSize() {
        return this.trafficPackageSize;
    }

    public void setTrafficPackageSize(Double trafficPackageSize) {
        this.trafficPackageSize = trafficPackageSize;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public RaidConfig getRaidConfig() {
        return this.raidConfig;
    }

    public void setRaidConfig(RaidConfig raidConfig) {
        this.raidConfig = raidConfig;
    }

    public List<Partition> getPartitions() {
        return this.partitions;
    }

    public void setPartitions(List<Partition> partitions) {
        this.partitions = partitions;
    }

    public Nic getNic() {
        return this.nic;
    }

    public void setNic(Nic nic) {
        this.nic = nic;
    }

    public String getIpxeUrl() {
        return this.ipxeUrl;
    }

    public void setIpxeUrl(String ipxeUrl) {
        this.ipxeUrl = ipxeUrl;
    }

    public String getUserData() {
        return this.userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public Boolean getEnablePrimaryIPv6() {
        return this.enablePrimaryIPv6;
    }

    public void setEnablePrimaryIPv6(Boolean enablePrimaryIPv6) {
        this.enablePrimaryIPv6 = enablePrimaryIPv6;
    }

    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
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

    public Boolean getEnableGatewayMode() {
        return this.enableGatewayMode;
    }

    public void setEnableGatewayMode(Boolean enableGatewayMode) {
        this.enableGatewayMode = enableGatewayMode;
    }

}