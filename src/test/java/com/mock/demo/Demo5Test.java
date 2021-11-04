package com.mock.demo;

import com.mock.model.MyModel;
import com.myutils.basecase.MockitoBaseCase;
import com.myutils.util.RandomString;
import org.junit.Test;
import org.mockito.Mock;
import org.omg.CORBA.portable.ApplicationException;
import sun.applet.AppletIOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * when thenReturn 示例
 */
public class Demo5Test extends MockitoBaseCase {

    @Mock
    MyModel myModel;

    @Test
    public void testMyModel(){
        String name = RandomString.random();
        when(myModel.getName()).thenReturn(name);
        assertEquals(myModel.getName(),name);
        verify(myModel).getName();
    }

    /**
     * 测试多个返回
     */
    @Test
    public void testMoreThanOneReturnValue(){
        String name1 = RandomString.random();
        String name2 = RandomString.random();
        when(myModel.getName()).thenReturn(name1).thenReturn(name2);
        assertEquals(myModel.getName(),name1);//第一次调用返回name1
        assertEquals(myModel.getName(),name2);//第二次调用返回name2
        assertEquals(myModel.getName(),name2);//超过定义数则调用返回最后一次的赋值name2
        verify(myModel,times(3)).getName();
    }

    /**
     * 测试抛出异常
     */
    @Test
    public void testThrow(){
        when(myModel.getName()).thenThrow(new RuntimeException());
        try {
            myModel.getName();
        }catch (Exception e){
            //e.printStackTrace();
        }finally {
            verify(myModel,times(1)).getName();
        }
    }
}
