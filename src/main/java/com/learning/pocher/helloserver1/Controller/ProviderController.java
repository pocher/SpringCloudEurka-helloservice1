package com.learning.pocher.helloserver1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController
public class ProviderController {

    @Value("${spring.application.name}")
    private String serverName;
    @Autowired
    DiscoveryClient client;
    @RequestMapping("/callToXiaoAI")
    public String getMessage(){
        System.out.println("小爱同学在此！！！！！！！！！！！！！！！！！！！！！！！！！！");
        return "你好! 我是小AI同学，编号AI1001, 我服务器的名称是:" + serverName + "=====";
    }
}
