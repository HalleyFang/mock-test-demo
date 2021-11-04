package com.mock.demo;

import com.mock.model.MyModel;
import com.mock.service.MyCase1;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;

/**
 * MockitoJUnit.rule() 示例
 */
public class Demo4Test {

    @Mock
    MyModel myModel;

    @InjectMocks
    MyCase1 myCase1;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void testCase1(){
        MyModel result = myCase1.case1();
        assertTrue(!result.getIsBoy());
        verify(myModel).setIsBoy(true);
    }

}
