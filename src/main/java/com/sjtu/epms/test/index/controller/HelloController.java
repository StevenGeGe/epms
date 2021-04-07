package com.sjtu.epms.test.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author: Yong
 * @Date: 2021/4/7 11:31
 * @Version 1.0
 * @PACKAGE_NAME : com.sjtu.epms.test.index.controller
 **/
@Controller
@RequestMapping(value = "/epms")
public class HelloController {

    @RequestMapping(value = "/index")
    public String sayHello(){
        return "/index";
    }
}
