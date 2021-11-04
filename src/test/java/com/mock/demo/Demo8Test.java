package com.mock.demo;

import com.mock.model.MyModel;
import com.mock.service.MyCase1;
import com.mock.service.MyCase2;
import com.myutils.basecase.MockitoBaseCase;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;

import static org.mockito.Mockito.*;

/**
 * InjectMocks 示例
 */
public class Demo8Test extends MockitoBaseCase {

    @Mock
    MyModel myModel;

    @Spy
    @InjectMocks
    MyCase1 myCase1;

    @InjectMocks
    MyCase2 myCase2;

    @Test
    public void testVerify(){
//        doReturn(myModel).when(myCase1).case1();
        myCase2.initialize();
        verify(myCase1).case1();
    }

}
