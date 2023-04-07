package com.zenlayercloud.bmc20221120;

/**
 * @author alicat.xu
 * @date 2023-05-16 16:07:50
 * @version $ Id: BmcErrorCode.java, v 0.1  alicat.xu Exp $
 */
public enum BmcErrorCode {

    // 参数hostname超过了长度限制，请注意模式串中的bits总和不要超过指定长度。
    INVALID_PARAMETER_HOSTNAME_EXCEED,

    // 参数hostname格式不正确，请注意输入值在规定的字符内。
    INVALID_PARAMETER_HOSTNAME_MALFORMED,

    // 参数instanceName超过了长度限制，请注意模式串中的bits总和不要超过指定长度。
    INVALID_PARAMETER_INSTANCE_NAME_EXCEED,

    // 指定的网络计费类型在当前区域不支持。
    OPERATION_FILED_INTERNET_CHARGE_TYPE_NOT_SUPPORT,

    // 未找到指定的镜像。
    INVALID_IMAGE_NOT_FOUND,

    // 指定的可用区不存在。
    INVALID_ZONE_NOT_FOUND,

    // 未找到指定的实例规格。
    INVALID_INSTANCE_TYPE_NOT_FOUND,

    // 自定义分区必须指定操作系统才可以进行。
    INVALID_PARTITION_IMAGE_NOT_SET,

    // 机器创建数量超过了当前Team的总配额。
    OPERATION_DENIED_INSTANCE_QUOTA_EXCEED,

    // 指定的带宽大小超过了机型允许的最大范围限制。
    INVALID_BANDWIDTH_VALUE_EXCEED_MAXIMUM,

    // 无效密码。指定的密码不符合密码复杂度限制。例如密码长度不符合限制等。
    INVALID_PARAMETER_VALUE_PASSWORD_MALFORMED,

    // 不能同时指定密码登录和SSH Key登录。
    INVALID_PARAMETER_INSTANCE_LOGIN_CONFLICT,

    // 输入的ssh key格式不正确，一般以rsa开头。
    INVALID_PARAMETER_SSH_KEY_MALFORMED,

    // 自定义raid和快速raid只能选择其中一种。
    INVALID_RAID_CONFIG_FAST_CUSTOM_CONFLICT,

    // 当前机型不支持指定的raid级别。
    INVALID_INSTANCE_TYPE_RAID_NOT_SUPPORT,

    // 公网网卡名称和内网网卡不能相同。
    INVALID_PARAMETER_NIC_NAME_CONFLICT,

    // 公网网卡或内网网卡名称不符合规范，请注意字符是否在规定的范围内。
    INVALID_PARAMETER_NIC_NAME_MALFORMED,

    // 分区大小没有到达应分区的规定容量。
    INVALID_PARTITION_SIZE_NOT_FULL,

    // 分区的文件路径或盘符有重复。
    INVALID_PARTITION_DUPLICATE_FILE_PATH,

    // 分区时缺少必须的文件路径（盘符），windos必须包含c，linux必须包含/。
    INVALID_PARTITION_MISSING_REQUIRED_FILE_PATH,

    // 分区文件类型或路径有格式问题。
    INVALID_PARTITION_MALFORMED,

    // 分区文件类型错误。
    INVALID_PARTITION_NO_TYPE,

    // windows 分区时盘符必须按字母顺序以此填写，比如CDEFG。
    INVALID_PARTITION_INVALID_ORDER,

    // 自定义raid配置时传的硬盘数量和Raid等级所要求的硬盘数量不匹配。
    INVALID_PARAMETER_VALUE_RAID_DISK_MISMATCH,

    // 自定义raid配置时硬盘的序号必须按顺序填写，比如[1,2,3]。
    INVALID_PARAMETER_VALUE_RAID_DISK_DISORDER,

    // 自定义raid配置时硬盘的序号超过了机型的硬盘数量。
    INVALID_PARAMETER_VALUE_RAID_DISK_SEQUENCE_RANGE,

    // 自定义raid配置时硬盘的序号存在重复的值。
    INVALID_PARAMETER_VALUE_RAID_DISK_SEQUENCE_DUPLICATE,

    // 所选资源未售卖。
    RESOURCE_INSUFFICIENT_PRODUCT_SOLD_OUT,

    // 该区域所选择的付费类型不支持。
    OPERATION_DENIED_CHARGE_TYPE_NOT_SUPPORT,

    // 指定的实例机型已售罄。
    RESOURCES_SOLDOUT_INSTANCE_TYPE,

    // 付费类型不支持，请联系Support进行开通。
    INVALID_CHARGE_TYPE_NOT_SUPPORT,

    // 内网Subnet不存在。
    INVALID_SUBNET_NOT_FOUND,

    // Subnet子网下内网的IP不足以分配给创建的机器。
    INVALID_SUBNET_PRIVATE_IP_INSUFFICIENT,

    // Subnet不在指定的Zone。
    INVALID_SUBNET_ZONE_MISMATCH,

    // ssh密钥值不合法，值存在重复。
    INVALID_PARAMETER_SSH_KEY_DUPLICATE,

    // 当前机型不支持快速raid级别。请使用自定义raid。
    INVALID_INSTANCE_TYPE_QUICK_RAID_NOT_SUPPORT,

    // 指定的镜像不存在。
    IMAGE_NOT_FOUND,

    // 指定的实例不存在。
    INVALID_INSTANCE_NOT_FOUND,

    // 回收站中的实例不支持该操作。
    OPERATION_DENIED_INSTANCE_RECYCLED,

    // 不是关机状态的实例不支持该操作。
    OPERATION_DENIED_INSTANCE_NOT_STOPPED,

    // 不是运行中状态的实例不支持该操作。
    OPERATION_DENIED_INSTANCE_NOT_RUNNING,

    // 实例当前的状态不支持该操作。
    OPERATION_DENIED_INSTANCE_STATUS,

    // 创建中的实例不支持该操作。
    OPERATION_DENIED_INSTANCE_CREATING,

    // 安装中的实例不支持该操作。
    OPERATION_DENIED_INSTANCE_STATUS_INSTALLING,

    // 订阅模式的实例不支持该操作。
    OPERATION_DENIED_INSTANCE_SUBSCRIPTION,

    // 资源处于后付费承诺期，无法手动终止
    OPERATION_DENIED_POSTPAID_PROMISE,

    // 不在回收站中的实例不支持该操作。
    OPERATION_DENIED_INSTANCE_NOT_RECYCLED,

    // 指定实例规格在指定的 可用区未售卖
    INVALID_INSTANCE_TYPE_ZONE_NO_SELL,

    // 指定的公网计费类型在所选的可用区不支持
    INVALID_INSTANCE_BANDWIDTH_ZONE_NO_SELL,

    // 指定的实例网络模型不是ByBandwidth。
    OPERATION_DENIED_INTERNET_CHARGE_TYPE_NOT_SUPPORT,

    // 指定的实例不存在带宽降配订单。
    OPERATION_DENIED_DOWNGRADE_NOT_EXIST,

    // 带宽参数超出最大值。
    INVALID_PARAMETER_BANDWIDTH_EXCEED,

    // 指定的实例带宽正在修改中。
    OPERATION_FAILED_INSTANCE_BANDWIDTH_PROCESSING,

    // 指定的实例流量包正在修改中。
    OPERATION_DENIED_INSTANCE_TRAFFIC_PACKAGE_PROCESSING,

    // 实例流量包参数校验错误。
    INVALID_PARAMETER_TRAFFIC_PACKAGE_ERROR,

    // 指定的实例不存在流量包。
    OPERATION_FAILED_INSTANCE_NOT_EXIST_TRAFFIC_PACKAGE,

    // 指定的实例存在降配计划订单。
    OPERATION_FAILED_INSTANCE_EXIST_PLAN_TRAFFIC_PACKAGE,

    // 实例流量包参数需要大于等于默认值。
    INVALID_PARAMETER_TRAFFIC_PACKAGE_LESS,

    // 流量包参数超过最大值。
    INVALID_PARAMETER_TRAFFIC_PACKAGE_EXCEED,

    // 实例状态不支持。
    OPERATION_DENIED_INSTANCE_STATUS_NOT_SUPPORT,

    // 资源组不存在
    OPERATION_FAILED_RESOURCE_GROUP_NOT_FOUND,

    // 资源不存在
    OPERATION_FAILED_RESOURCE_NOT_FOUND,

    // 指定EIP在指定的可用区未售卖。
    INVALID_EIP_TYPE_ZONE_NO_SELL,

    // 指的参数为空。
    MISSING_PARAMETER,

    // 指定的EIP不存在。
    INVALID_EIP_NOT_FOUND,

    // 订阅模式的EIP不支持该操作。
    OPERATION_DENIED_EIP_SUBSCRIPTION,

    // 已经在回收站中的EIP不支持该操作。
    OPERATION_DENIED_EIP_RECYCLED,

    // 指定的EIP不在回收站。
    OPERATION_DENIED_EIP_NOT_RECYCLED,

    // 指定的EIP与实例区域不一致。
    OPERATION_DENIED_EIP_ZONE_NOT_SAME,

    // 指定的EIP在回收站。
    FAILED_OPERATION_FOR_RECYCLE_RESOURCE,

    // 指定的EIP状态不可用。
    OPERATION_DENIED_EIP_STATUS_NOT_AVAILABLE,

    // 指定的EIP不支持ESXI实例。
    OPERATION_DENIED_EIP_ESXI_INSTANCE_ASSIGN,

    // 实例绑定EIP数量超过限制。
    OPERATION_DENIED_EIP_INSTANCE_EXCEED_LIMIT,

    // 指定的EIP状态不支持。
    OPERATION_DENIED_EIP_STATUS_NOT_SUPPORT,

    // ESXI类型机器不支持
    INVALID_ESXI_NOT_SUPPORT,

    // 指定Ddos IP在指定的可用区未售卖。
    INVALID_DDOS_IP_TYPE_ZONE_NO_SELL,

    // 指定的Ddos IP不存在。
    INVALID_DDOS_IP_NOT_FOUND,

    // 订阅模式的Ddos IP不支持该操作。
    OPERATION_DENIED_DDOS_IP_SUBSCRIPTION,

    // 已经在回收站中的Ddos IP不支持该操作。
    OPERATION_DENIED_DDOS_IP_RECYCLED,

    // 指定的Ddos IP不在回收站。
    OPERATION_DENIED_DDOS_IP_NOT_RECYCLED,

    // 指定的Ddos IP与实例区域不一致。
    OPERATION_DENIED_DDOS_IP_ZONE_NOT_SAME,

    // 指定的Ddos IP状态不可用。
    OPERATION_DENIED_DDOS_IP_STATUS_NOT_AVAILABLE,

    // 指定的Ddos IP不支持ESXI实例。
    OPERATION_DENIED_DDOS_IP_ESXI_INSTANCE_ASSIGN,

    // 指定的Ddos IP状态不支持。
    OPERATION_DENIED_DDOS_IP_STATUS_NOT_SUPPORT,

    // 指定的掩码不可用。
    OPERATION_DENIED_UNAVAILABLE_NETMASK,

    // 指定的掩码库存不足。
    OPERATION_DENIED_NETMASK_OUT_OF_STOCK,

    // 该Cidr Block类型不支持续费。
    OPERATION_DENIED_CIDRBLOCK_TYPE_NOT_SUPPORTED,

    // 预付费订阅模式的Cidr Block不允许退还。
    OPERATION_DENIED_CIDRBLOCK_SUBSCRIPTION,

    // 存在绑定实例的Cidr Block不允许退还。
    OPERATION_DENIED_INSTANCE_EXIST,

    // 不在回收站中的Cidr Block不支持该操作。
    OPERATION_DENIED_CIDRBLOCK_NOT_RECYCLED,

    // 指定的实例和Cidr Block不在同一个区域。
    OPERATION_DENIED_DIFFERENT_ZONE,

    // 在回收站中的Cidr Block不支持该操作。
    OPERATION_DENIED_CIDRBLOCK_RECYCLED,

    // 已绑定的IP数量达到了上限。
    OPERATION_DENIED_CIDRBLOCK_IP_COUNT_REACH_LIMIT,

    // VPC RegionId 不存在。
    INVALID_VPC_REGION_NOT_FOUND,

    // VPC RegionId下数量限制。
    OPERATION_DENIED_VPC_REGION_EXCEED_LIMIT,

    // CidrBlock 掩码范围错误。
    INVALID_PARAMETER_VPC_LAN_IP_NETMASK,

    // CidrBlock 参数格式错误。
    INVALID_PARAMETER_VPC_CIDR_BLOCK,

    // CidrBlock 不是私网IP。
    INVALID_PARAMETER_VPC_LAN_IP,

    // VPC状态不支持。
    OPERATION_DENIED_VPC_STATUS_NOT_SUPPORT,

    // VPC下存在Subent。
    OPERATION_DENIED_VPC_EXIST_SUBNET_ASSIGN,

    // VPC下存在实例。
    OPERATION_DENIED_VPC_EXIST_INSTANCE,

    // 可用区不支持创建Subnet。
    OPERATION_DENIED_ZONE_NOT_SUPPORT_SUBNET,

    // VPC不存在。
    INVALID_VPC_NOT_FOUND,

    // VPC RegionId 不可用。
    OPERATION_DENIED_NO_AVAILABLE_VPC_REGION,

    // 可用区不属于VPC RegionId。
    OPERATION_DENIED_ZONE_NOT_BELONG_VPC,

    // CidrBlock 参数格式错误。
    INVALID_PARAMETER_SUBNET_CIDR_BLOCK,

    // CidrBlock 掩码范围错误。
    INVALID_PARAMETER_SUBNET_LAN_IP_NETMASK,

    // CidrBlock 不是私网IP。
    INVALID_PARAMETER_SUBNET_LAN_IP,

    // Subnet在可用区数量限制。
    OPERATION_DENIED_SUBNET_EXCEED_LIMIT,

    // VPC 可用区下Subnet数量限制。
    OPERATION_DENIED_VPC_ZONE_SUBNET_EXCEED_LIMIT,

    // Subnet网段与VPC下的网段有重叠。
    INVALID_PARAMETER_VPC_SUBNET_OVER_LAP,

    // Subnet网段不属于VPC网段下。
    INVALID_PARAMETER_SUBNET_CIDR_NOT_BELONG_VPC,

    // Subnet下存在实例。
    OPERATION_DENIED_SUBNET_EXIST_INSTANCE,

    // Subnet的状态不支持。
    OPERATION_DENIED_SUBNET_STATUS_NOT_SUPPORT,

    // 实例不支持绑定Subnet。
    OPERATION_DENIED_INSTANCE_NOT_SUPPORT_SUBNET,

    // Subnet分配重复的内网IP给实例。
    INVALID_PARAMETER_DUPLICATE_LAN_IP,

    // .1结尾的内网IP不支持。
    INVALID_PARAMETER_LAN_IP_NOT_SUPPORT,

    // 内网IP已经绑定实例。
    OPERATION_DENIED_IP_ASSOCIATED_INSTANCE,

    // Subnet下实例不能重复。
    OPERATION_DENIED_SUBNET_NOT_REPEAT_INSTANCE,

    // Subnet正在绑定实例。
    OPERATION_DENIED_SUBNET_ASSOCIATING_INSTANCE,

    // Subnet已绑定其他VPC。
    OPERATION_DENIED_SUBNET_ASSOCIATED_OTHER_VPC,

    ;



}
