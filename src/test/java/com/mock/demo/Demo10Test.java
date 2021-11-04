package com.mock.demo;

import com.mock.model.MyModel;
import com.myutils.basecase.MockitoBaseCase;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

/**
 * captor.capture() 示例
 */
public class Demo10Test extends MockitoBaseCase {

    @Captor
    private ArgumentCaptor<Integer> captor;

    @Mock
    MyModel myModel;

    @Test
    public void testArgumentCaptor(){
        myModel.setAge(10);
        verify(myModel).setAge(captor.capture());
    }

}
