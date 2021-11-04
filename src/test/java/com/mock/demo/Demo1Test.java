package com.mock.demo;

import com.mock.model.MyModel;
import com.myutils.util.RandomString;
import org.junit.Test;

/**
 * 静态 mock 示例
 */
import static org.mockito.Mockito.*;

public class Demo1Test {

    @Test
    public void testMyModel(){
        String name = RandomString.random();
        MyModel myModel = mock(MyModel.class);//直接调用mock
        myModel.setName(name);//执行mock类的一些代码
        verify(myModel).setName(name);//验证方法是在myModel mock上调用的
    }
}
