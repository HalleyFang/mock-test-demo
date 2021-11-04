package com.mock.demo;

import com.mock.model.MyModel;
import com.mock.service.MyCase1;
import com.myutils.basecase.MockitoBaseCase;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * doReturn when 示例
 */
public class Demo6Test extends MockitoBaseCase {

    @Mock
    MyModel myModel;

    @Spy
    @InjectMocks
    MyCase1 myCase1;

    @Test
    public void testMyCase1(){
        doReturn(myModel).when(myCase1).case1();
        assertEquals(myCase1.case1().getAge(),0);
        verify(myCase1).case1();
    }

    /**
     * 测试抛出异常
     */
    @Test
    public void testThrow(){
        doThrow(new RuntimeException()).when(myCase1).case1();
        try {
            myCase1.case1();
        }catch (Exception e){
            //e.printStackTrace();
        }finally {
            verify(myCase1,times(1)).case1();
        }
    }
}
