package com.pos.pos.test.controller;

import com.pos.pos.test.domain.Menu;
import com.pos.pos.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/test")
    public String test(Model model) throws Exception{
        Menu data = testService.getMenu();
        model.addAttribute("data", data.getMenu());
        return "test";
    }
    @GetMapping("/calendar")
    public String calendar(){
        return "calendar";
    }

    @GetMapping("/header")
    public String header(){
        return "common/header";
    }

    @GetMapping("/payment")
    public String payment(){
        return "payment";
    }
}
