package com.mock.service;

import org.springframework.stereotype.Service;

@Service
public class MyCase3 {

    public static String caseStatic(){
        return "";
    }

    public final Boolean caseFinal(){
        return true;
    }

    Boolean casePrivate(){
        return false;
    }
}
