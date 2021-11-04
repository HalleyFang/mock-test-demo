package com.mock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyCase4 {

    @Autowired
    MyCase3 myCase3;

    public String caseStatic(){
       return MyCase3.caseStatic();
    }

    public Boolean caseFinal() {
        return myCase3.caseFinal();
    }

    public Boolean casePrivate() {
        return myCase3.casePrivate();
    }
}
