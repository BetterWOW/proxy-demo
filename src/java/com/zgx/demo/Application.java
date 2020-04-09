package com.zgx.demo;

import com.zgx.demo.proxy.ProxyDynamicHandler;
import com.zgx.demo.service.Service;
import com.zgx.demo.service.impl.ServiceImpl;

import java.lang.reflect.Proxy;

public class Application {
    public static void main(String[] args) {
        Service service = (Service) Proxy.newProxyInstance(Service.class.getClassLoader(), new Class[]{Service.class},new ProxyDynamicHandler<>(new ServiceImpl()));
        service.say();
        service.say();
    }
}
