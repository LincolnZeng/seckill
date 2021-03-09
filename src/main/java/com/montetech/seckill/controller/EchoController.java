package com.montetech.seckill.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// 1.mark the rest controller
@RestController
@RequestMapping("echo") // 2.all the methods in this class will be mapped under this path
public class EchoController {
    @GetMapping("{text}") // 3.when use the broswer for input /echo/{text}, the text will be passed in
    public String echo(@PathVariable("text") String text){ // 4.get the text path variable value
        return text; //5. return the value
    }
}
