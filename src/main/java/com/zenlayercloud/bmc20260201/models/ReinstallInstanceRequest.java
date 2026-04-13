package com.zenlayercloud.bmc20260201.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class ReinstallInstanceRequest extends TeaModel {


    /**
     * 指定有效的镜像ID。
     * 可通过以下方式获取可用的镜像ID：通过调用接口 DescribeImages ，传入instanceTypeId获取当前机型支持的镜像列表，取返回信息中的imageId字段；也可以不指定镜像，如果不指定镜像，后续可以通过IPMI进行安装。使用iPXE安装镜像，请指定ipxeUrl字段，且该字段不必传。
     */
    public String imageId;

    /**
     * 实例的主机名。
     * 不得超过64个字符。仅支持输入字母、数字、-和英文句点(.)。
     * 默认值为hostname。
     */
    public String hostname;

    /**
     * 实例的密码。
     * 必须是 8-16 个字符，包含大写字母、小写字母、数字和特殊字符。特殊符号可以是：1~!@$^*-_=+。该密码也是作为IPMI登录的密码，请妥善保管。
     * 密钥与密码必须并且只能指定其中一个。
     */
    public String password;

    /**
     * 密钥ID。与password必须指定其中的一种。
     * 可调用接口DescribeKeyPairs来获得最新的密钥对信息。
     * 关联密钥后，就可以通过对应的私钥来访问实例；密钥与密码不能同时指定，同时Windows操作系统不支持指定密钥。
     * 示例值：key-YWD2QFOl
     */
    public String keyId;

    /**
     * 磁盘阵列配置。
     */
    public RaidConfig raidConfig;

    /**
     * 分区配置。
     * 如果未安装操作系统，将不能设置分区。
     */
    public List<Partition> partitions;

    /**
     * 网卡的配置。
     */
    public Nic nic;

    /**
     * iPXE URL 地址。
     * 传入参数后，将根据指定URL进行iPXE安装， 如果指定为netboot，将使用netboot iPXE方式进行安装。相关帮助文档：Deploy a Custom Image Using iPXE
     */
    public String ipxeUrl;

    /**
     * 用户数据。
     * 在安装实例时可以通过指定用户数据进行配置实例。当实例首次启动时，用户数据将以文本的方式传递到云服务器中，并执行该文本。支持的最大数据大小为 32KB。
     */
    public String userData;

    /**
     * 待操作的实例ID。
     * 可通过DescribeInstances接口返回值中的instanceId获取。
     */
    public String instanceId;

    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
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

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

}