package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Date;

@RestController
@RequestMapping("/hello")
public class HelloController {

    public static Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/abc")
    public String hello () {
        log.info(new Date().toLocaleString() + ":hello world");
        return "hello abc";
    }
}
