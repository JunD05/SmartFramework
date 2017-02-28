package com.smart4j.staticproxy;

/**
 * Created by dengjj on 2017/2/28.
 */
public class HelloImpl implements Hello {
    @Override
    public void say(String name) {
        System.out.println("Hello!" + name);
    }
}
