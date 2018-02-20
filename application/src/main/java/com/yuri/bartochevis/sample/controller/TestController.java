package com.yuri.bartochevis.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String getString() {
        return "Is Working test";
    }


    @RequestMapping("/")
    public String getString2() {
        return "Is Working default";
    }

}
