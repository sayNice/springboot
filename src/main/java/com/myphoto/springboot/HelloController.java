package com.myphoto.springboot;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;


@Controller
public class HelloController {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("nowDatess",new Date());
        return "hello";
    }
}
