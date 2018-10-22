package com.example.api.controller;

import com.example.modulecommon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/rsp")
public class RspApiController {

    @Autowired
    public TestService testService;

    @GetMapping("/action")
    public String userAction(){

        return testService.testService();
    }
}
