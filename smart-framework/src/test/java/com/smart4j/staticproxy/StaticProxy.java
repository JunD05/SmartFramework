package com.smart4j.staticproxy;

/**
 * Created by dengjj on 2017/2/28.
 */
public class StaticProxy {
    public static void main(String[] args) {
        Hello helloProxy = new HelloProxy();
        helloProxy.say("Jeck");
    }
}

