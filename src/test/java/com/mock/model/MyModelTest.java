package com.mock.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyModelTest {

    @Test
    public void test(){
        MyModel myModel = new MyModel();
        myModel.setName("name");
        myModel.setAge(20);
        myModel.setIsBoy(true);
        Assert.assertEquals("name",myModel.getName());
        Assert.assertEquals(20,myModel.getAge());
        Assert.assertEquals(true,myModel.getIsBoy());
    }
}