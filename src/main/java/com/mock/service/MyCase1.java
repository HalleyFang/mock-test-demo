package com.mock.service;

import com.mock.model.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyCase1 {

    @Autowired
    MyModel myModel;

    public MyModel case1(){
        myModel.setName("小明");
        myModel.setAge(20);
        myModel.setIsBoy(true);
        return myModel;
    }

    public String matchers(String str,MyModel myModel){
        return str;
    }
}
