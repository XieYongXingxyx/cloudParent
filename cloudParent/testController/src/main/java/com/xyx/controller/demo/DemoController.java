package com.xyx.controller.demo;

import com.xyx.service.demoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xyx
 * @TIME 2019/11/15 16:56
 */
@RestController
@RequestMapping("/user")
public class DemoController {
    @Autowired
    private demoService demoService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
    @RequestMapping("queryDB")
    public List<Integer> findIds(){
        return demoService.findIds();
    }
}
