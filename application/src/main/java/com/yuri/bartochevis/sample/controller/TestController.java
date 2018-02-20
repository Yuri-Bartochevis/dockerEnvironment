package com.yuri.bartochevis.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String getString() {

        if((int)(Math.random() * 10) % 3 == 0){
            try{
                Thread.sleep(5000);
            }catch(Exception e){
            }
        }

        return "Executing on node " + System.getenv("NODE_ENV");
    }


}
