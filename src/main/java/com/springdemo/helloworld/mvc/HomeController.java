package com.springdemo.helloworld.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/spring-mvc-demo")
    public String showPage() {
        return "index";
    }
}
