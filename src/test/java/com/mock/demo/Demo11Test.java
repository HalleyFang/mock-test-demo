package com.mock.demo;

import com.mock.service.MyCase3;
import com.mock.service.MyCase4;
import com.myutils.basecase.PowerMockBaseCase;
import com.myutils.util.RandomString;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.powermock.api.mockito.PowerMockito.*;

@PrepareForTest(MyCase3.class)
public class Demo11Test extends PowerMockBaseCase {
    @Mock
    MyCase3 case3;

    @InjectMocks
    MyCase4 case4;

    @Test
    public void testStatic() {
        mockStatic(MyCase3.class);
        String str = RandomString.random();
        when(MyCase3.caseStatic()).thenReturn(str);
        String result = case4.caseStatic();
        assertEquals(result, str);
    }

    @Test
    public void testFinal() {
        when(case3.caseFinal()).thenReturn(true);
        Boolean result = case4.caseFinal();
        assertTrue(result);
    }

    @Test
    public void testPrivate() throws Exception {
        when(case3, "casePrivate").thenCallRealMethod();
        Boolean result = case4.casePrivate();
        assertTrue(!result);
    }

    @Test
    public void testVoid() throws Exception {
        whenNew(MyCase3.class).withNoArguments().thenReturn(case3);
        MyCase3 testCase = new MyCase3();
        when(testCase.caseFinal()).thenReturn(false);
        Boolean result = testCase.caseFinal();
        assertTrue(!result);
    }
}
