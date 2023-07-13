package com.abacus.overwork.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/index")
    public String index () {
        return "index";
    }

    @RequestMapping("/login")
    public String login () {
        return "user/login";
    }

    @RequestMapping("/signup")
    public String signup () {
        return "user/signup";
    }
}
