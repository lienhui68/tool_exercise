package com.eh.test.maven;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * todo
 *
 * @author David Li
 * @create 2020/06/11 07:31
 */
public class HelloMavenTest {

    @Test
    public void sayHello() {
        HelloMaven helloMaven = new HelloMaven();
        assertEquals("Hello, Maven", helloMaven.sayHello());
    }
}
