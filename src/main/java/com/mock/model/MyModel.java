package com.mock.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MyModel {

    private String name;
    private int age;
    private Boolean isBoy;

}

