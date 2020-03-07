package com.huayang.controller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Log
@RestController
public class InitCtl {
    @GetMapping("/")
    public ModelAndView  hello(){
        return new ModelAndView(" html/index.html");

    }
}
