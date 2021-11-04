package com.mock.demo;

import com.mock.model.MyModel;
import com.myutils.basecase.MockitoBaseCase;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

/**
 * verify 示例
 */
public class Demo7Test extends MockitoBaseCase {

    @Mock
    MyModel myModel;

    @Test
    public void testVerify(){
        myModel.getName();
        myModel.getAge();
        myModel.getAge();
        myModel.getAge();

        verify(myModel).getName();
        verify(myModel,times(1)).getName();
        verify(myModel, never()).getIsBoy();
        verify(myModel, atLeastOnce()).getName();
        verify(myModel, atLeast(2)).getAge();
        verify(myModel, atMost(3)).getAge();
        // This let's you check that no other methods where called on this object.
        // You call it after you have verified the expected method calls.
        verifyNoMoreInteractions(myModel);
    }

}
