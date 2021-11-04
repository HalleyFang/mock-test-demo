package com.mock.service;

import com.mock.model.MyModel;
import com.myutils.basecase.MockitoBaseCase;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class MyCase1Test extends MockitoBaseCase {

    @Mock
    MyModel myModel;
    @InjectMocks
    MyCase1 myCase1;

    @Test
    public void test1(){

    }

    @Test
    public void test2(){
        String msg = myCase1.matchers("test",myModel);
        Assert.assertEquals("test",msg);
    }
}
