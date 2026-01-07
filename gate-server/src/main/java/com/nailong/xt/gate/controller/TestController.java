package com.nailong.xt.gate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping(path = "/test")
    public String test() throws Exception {
        return "ok";
    }
}
