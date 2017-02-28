package com.smart4j.dynamicproxy;

import com.smart4j.staticproxy.Hello;
import com.smart4j.staticproxy.HelloImpl;

import java.lang.reflect.Proxy;

/**
 * Created by dengjj on 2017/2/28.
 */
public class DynamicProxyMain {

    public static void main(String[] args) {
        Hello hello = new HelloImpl();

        DynamicProxy dynamicProxy = new DynamicProxy(hello);

        Hello helloProxy = (Hello) Proxy.newProxyInstance(
                hello.getClass().getClassLoader(),
                hello.getClass().getInterfaces(),
                dynamicProxy
        );

        helloProxy.say("Jack");
    }

}
