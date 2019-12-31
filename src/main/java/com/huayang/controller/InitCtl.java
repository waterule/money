package com.huayang.controller;

import lombok.Data;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
public class InitCtl {
    @GetMapping("/")
    public String hello(){
        log.info("------------2020---------");
        return "hello,2020";
    }
}
