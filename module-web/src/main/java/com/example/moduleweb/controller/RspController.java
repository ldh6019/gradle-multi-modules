package com.example.moduleweb.controller;

import com.example.modulecommon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("rsp")
public class RspController {

    @Autowired
    public TestService testService;

    @GetMapping("")
    public String userAction(){
        return testService.testService();
    }
}


