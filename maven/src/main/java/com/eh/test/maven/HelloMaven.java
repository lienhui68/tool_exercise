package com.eh.test.maven;

import com.eh.test.util.HelloUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * maven测试类
 *
 * @author David Li
 * @create 2020/06/11 07:28
 */
public class HelloMaven {
    public String sayHello() {
        return HelloUtil.sayHello("Maven");
    }

    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(1, "a");
        m.put(2, "b");
        m.put(1, "c");
        m.put(1, "d");
        System.out.println(m);
    }
}
