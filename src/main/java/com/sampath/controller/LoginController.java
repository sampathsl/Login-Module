package com.sampath.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by SAMPATH on 2/25/2016.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public static String viewLoginPage(Model model){
        return "login";
    }

}
