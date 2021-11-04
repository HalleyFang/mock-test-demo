package com.mock.demo;

import com.mock.model.MyModel;
import com.mock.service.MyCase1;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;

/**
 * initMocks 示例
 */
public class Demo3Test {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);//其中this就是单元测试所在的类，在initMocks函数中Mockito会根据类中不同的注解（如@Mock, @Spy等）创建不同的mock对象，即初始化工作
    }

    @Mock
    MyModel myModel;

    @InjectMocks
    MyCase1 myCase1;

    @Test
    public void testCase1(){
        MyModel result = myCase1.case1();
        assertTrue(!result.getIsBoy());
        verify(myModel).setIsBoy(true);
    }

}
