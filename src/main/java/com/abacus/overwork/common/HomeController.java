package com.abacus.overwork.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/login")
    public String login () {
        return "login";
    }

    @RequestMapping("/signup")
    public String signup () {
        return "signup";
    }
}
