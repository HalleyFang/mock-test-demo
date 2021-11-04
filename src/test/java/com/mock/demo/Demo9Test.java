package com.mock.demo;

import com.mock.model.MyModel;
import com.mock.service.MyCase1;
import com.myutils.basecase.MockitoBaseCase;
import com.myutils.util.RandomString;
import org.junit.Test;
import org.mockito.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class Demo9Test extends MockitoBaseCase {

    @Spy
    MyCase1 case1;

    @Test
    public void testMatchers(){
        String str = RandomString.random();
        doReturn(str).when(case1).matchers(anyString(),ArgumentMatchers.<MyModel>any());
        String result = case1.matchers(anyString(),ArgumentMatchers.<MyModel>any());
        assertEquals(result,str);
    }
}
