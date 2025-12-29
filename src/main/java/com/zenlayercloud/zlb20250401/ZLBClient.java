/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2022 All Rights Reserved.
 */
package com.zenlayercloud.zlb20250401;

import com.aliyun.tea.TeaModel;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.zenlayercloud.zlb20250401.models.*;
import com.zenlayercloud.common.AbstractClient;
import com.zenlayercloud.common.Config;
import com.zenlayercloud.common.Credential;

import java.util.Map;


public class ZLBClient extends AbstractClient {
    private static final String VERSION = "2025-04-01";
    private static final String ENDPOINT = "console.zenlayer.com";
    private static final String PATH = "/api/v2/zlb";

    public ZLBClient(Credential credential, Config config) {
        super(credential, config,
            config.getEndpoint() != null ? config.getEndpoint() : ENDPOINT,
            VERSION, PATH);
    }

        /**
         * 本接口接口可根据负载均衡器 ID、监听器的协议作为过滤条件获取监听器列表。
         * 如果不指定任何过滤条件，则返回指定负载均衡实例下的所有监听器。
         
         */
    public DescribeListenersResponse describeListeners(DescribeListenersRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeListeners",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeListenersResponse());
    }

        /**
         * 查询创建负载均衡监听器。
         
         */
    public CreateListenerResponse createListener(CreateListenerRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateListener",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateListenerResponse());
    }

        /**
         * 查询删除一个负载均衡监听器。
         
         */
    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteListener",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteListenerResponse());
    }

        /**
         * 修改负载均衡监听器的属性，包括监听器的名称、健康检查参数、转发方式等。
         * 不支持修改监听器的监听协议。
         
         */
    public ModifyListenerResponse modifyListener(ModifyListenerRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyListener",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyListenerResponse());
    }

        /**
         * 查询支持购买负载均衡的区域。
         
         */
    public DescribeLoadBalancerRegionsResponse describeLoadBalancerRegions(DescribeLoadBalancerRegionsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeLoadBalancerRegions",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeLoadBalancerRegionsResponse());
    }

        /**
         * 将一台或多台后端服务绑定到负载均衡的监听器。
         
         */
    public RegisterBackendResponse registerBackend(RegisterBackendRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "RegisterBackend",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new RegisterBackendResponse());
    }

        /**
         * 将一台或多台绑定在指定监听器上的后端服务解绑。
         
         */
    public DeregisterBackendResponse deregisterBackend(DeregisterBackendRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeregisterBackend",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeregisterBackendResponse());
    }

        /**
         * 修改一台或多台绑定在指定监听器上的后端服务的配置，包括权重和和后端服务器转发端口。
         
         */
    public ModifyBackendResponse modifyBackend(ModifyBackendRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyBackend",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyBackendResponse());
    }

        /**
         * 查询负载均衡实例的绑定的后端服务列表。
         
         */
    public DescribeBackendsResponse describeBackends(DescribeBackendsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeBackends",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeBackendsResponse());
    }

        /**
         * 查询负载均衡实例的绑定的后端服务列表。
         
         */
    public DescribeBackendHealthResponse describeBackendHealth(DescribeBackendHealthRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeBackendHealth",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeBackendHealthResponse());
    }

        /**
         * 修改负载均衡实例的属性。
         * 目前仅支持修改负载均衡实例的名称。
         
         */
    public ModifyLoadBalancersAttributeResponse modifyLoadBalancersAttribute(ModifyLoadBalancersAttributeRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "ModifyLoadBalancersAttribute",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new ModifyLoadBalancersAttributeResponse());
    }

        /**
         * 查询负载均衡实例列表。
         
         */
    public DescribeLoadBalancersResponse describeLoadBalancers(DescribeLoadBalancersRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeLoadBalancers",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeLoadBalancersResponse());
    }

        /**
         * 将在回收站的负载均衡实例进行恢复。
         
         */
    public RestoreLoadBalancerResponse restoreLoadBalancer(RestoreLoadBalancerRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "RestoreLoadBalancer",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new RestoreLoadBalancerResponse());
    }

        /**
         * 本接口用户删除一个指定的负载均衡器实例。
         
         */
    public TerminateLoadBalancerResponse terminateLoadBalancer(TerminateLoadBalancerRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "TerminateLoadBalancer",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new TerminateLoadBalancerResponse());
    }

        /**
         * 创建负载均衡器实例。
         
         */
    public CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "CreateLoadBalancer",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new CreateLoadBalancerResponse());
    }

        /**
         * 查询创建负载均衡的价格。
         
         */
    public InquiryPriceCreateLoadBalancerResponse inquiryPriceCreateLoadBalancer(InquiryPriceCreateLoadBalancerRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "InquiryPriceCreateLoadBalancer",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new InquiryPriceCreateLoadBalancerResponse());
    }

        /**
         * 查询负载均衡监控指标数据，包括并发连接数, 新建连接数以及网络带宽等指标数据。
         
         */
    public DescribeLoadBalancerMonitorDataResponse describeLoadBalancerMonitorData(DescribeLoadBalancerMonitorDataRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DescribeLoadBalancerMonitorData",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DescribeLoadBalancerMonitorDataResponse());
    }

        /**
         * 批量更换负载器均衡的安全组。
         
         */
    public SetSecurityGroupForLoadBalancersResponse setSecurityGroupForLoadBalancers(SetSecurityGroupForLoadBalancersRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "SetSecurityGroupForLoadBalancers",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new SetSecurityGroupForLoadBalancersResponse());
    }

        /**
         * 批量解绑负载器均衡的安全组。
         
         */
    public UnbindSecurityGroupFromLoadBalancersResponse unbindSecurityGroupFromLoadBalancers(UnbindSecurityGroupFromLoadBalancersRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "UnbindSecurityGroupFromLoadBalancers",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new UnbindSecurityGroupFromLoadBalancersResponse());
    }

        /**
         * 为负载均衡器实例添加内网IP。
         
         */
    public AddLoadBalancersPrivateIpsResponse addLoadBalancersPrivateIps(AddLoadBalancersPrivateIpsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "AddLoadBalancersPrivateIps",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new AddLoadBalancersPrivateIpsResponse());
    }

        /**
         * 为负载均衡器实例删除内网IP。
         
         */
    public DeleteLoadBalancersPrivateIpsResponse deleteLoadBalancersPrivateIps(DeleteLoadBalancersPrivateIpsRequest request) {
        Map<String, ?> rsp = super.callApi(
            request,
            "DeleteLoadBalancersPrivateIps",
            new RuntimeOptions()
        );
        return TeaModel.toModel(rsp, new DeleteLoadBalancersPrivateIpsResponse());
    }

}