package com.zgx.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyDynamicHandler<T> implements InvocationHandler {
    private T object;
    public ProxyDynamicHandler(T object){
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy!!!!");
        return method.invoke(object,args);
    }
}
