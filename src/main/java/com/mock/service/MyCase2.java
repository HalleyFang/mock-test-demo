package com.mock.service;

import com.mock.model.MyModel;
import org.springframework.stereotype.Service;

@Service
public class MyCase2 {

    private MyModel myModel;
    private MyCase1 myCase1;

    public MyCase2(MyModel myModel, MyCase1 myCase1) {
        this.myModel = myModel;
        this.myCase1 = myCase1;
    }

    public void initialize() {
        myCase1.case1();
    }
}
