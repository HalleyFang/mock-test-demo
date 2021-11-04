package com.mock.service;

import org.junit.Assert;
import org.junit.Test;

public class MyCase3Test {
    private MyCase3 myCase3 = new MyCase3();

    @Test
    public void test1() {
        Assert.assertEquals("", MyCase3.caseStatic());
    }

    @Test
    public void test2() {
        Assert.assertEquals(true, myCase3.caseFinal());
    }
}