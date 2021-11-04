package com.mock.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


@RestController
public class MyController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @RequestMapping(value = "/taskSave")
    public Object save(@RequestParam("callback") String callback){
        logger.debug(" save task ");

        return callback;
    }

}
