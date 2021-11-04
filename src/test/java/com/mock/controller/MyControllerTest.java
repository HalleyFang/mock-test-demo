package com.mock.controller;

import org.junit.Assert;
import org.junit.Test;

public class MyControllerTest {

    private MyController controller = new MyController();

    @Test
    public void test1(){
        String msg = (String) controller.save("callback");
        Assert.assertEquals("callback",msg);
    }
}
